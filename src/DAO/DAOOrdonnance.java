package DAO;

import gestion.Client;
import gestion.Ordonnance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOOrdonnance extends DAO<Ordonnance> {

    @Override
    public boolean create(Ordonnance obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("insert into ordonnance");
        sqlInsertUtilisateur.append("Ord_ID, Ord_Num, Ord_Date, Cli_ID, Med_ID, Spe_ID");
        sqlInsertUtilisateur.append("values (null, ?, ?, ?, ?,? )");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())) {

            preparedStatement.setString(1, obj.getOrd_Num());
            preparedStatement.setString(2, obj.getOrd_Date());
            preparedStatement.setInt(3, obj.getClient().getCli_ID());
            preparedStatement.setInt(4, obj.getMedecin().getMed_ID());
            preparedStatement.setInt(5, obj.getSpecialiste().getSpe_ID());


            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public boolean delete(Ordonnance obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Delete from ordonnance");
        sqlInsertUtilisateur.append("where Ord_ID = ?");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setInt(1, obj.getOrd_ID());

            preparedStatement.executeUpdate();
            requeteok = true;
        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public boolean update(Ordonnance obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Update ordonnance");
        sqlInsertUtilisateur.append("set Ord_Num = ?, Ord_Date = ?, Cli_ID = ?, Med_ID = ?, Spe_ID = ?");
        sqlInsertUtilisateur.append("where Ord_ID = ? ");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setString(1, obj.getOrd_Num());
            preparedStatement.setString(2, obj.getOrd_Date());
            preparedStatement.setInt(3, obj.getClient().getCli_ID());
            preparedStatement.setInt(4, obj.getMedecin().getMed_ID());
            preparedStatement.setInt(5, obj.getSpecialiste().getSpe_ID());
            preparedStatement.setInt(6, obj.getOrd_ID());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public Ordonnance find(Integer pId) {
        DAOClient daoClient = new DAOClient();
        DAOMedecin daoMedecin = new DAOMedecin();
        DAOSpecialiste daoSpecialiste = new DAOSpecialiste();
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from ordonnance ");
        sqlInsertUtilisateur.append("where Ord_ID = ?");

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setInt(1, pId);

            ResultSet resultSet = preparedStatement.executeQuery();

            Ordonnance o;
            while(resultSet.next()) {
                return new Ordonnance(resultSet.getInt("Ord_ID"),
                        resultSet.getString("Ord_Num"),
                        daoClient.find(resultSet.getInt("Cli_ID")),
                        daoMedecin.find(resultSet.getInt("Med_ID")),
                        daoSpecialiste.find(resultSet.getInt("Spe_ID")),
                        resultSet.getString("Ord_Date"));
            }
        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return null;
    }

    @Override
    public List<Ordonnance> findALL() {
        DAOClient daoClient = new DAOClient();
        DAOMedecin daoMedecin = new DAOMedecin();
        DAOSpecialiste daoSpecialiste = new DAOSpecialiste();
        ArrayList<Ordonnance> ordonnance = new ArrayList<Ordonnance>();
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from ordonnance");

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
            ordonnance.add(new Ordonnance(
                    resultSet.getInt("Ord_ID"),
                    resultSet.getString("Ord_Num"),
                    daoClient.find(resultSet.getInt("Cli_ID")),
                    daoMedecin.find(resultSet.getInt("Med_ID")),
                    daoSpecialiste.find(resultSet.getInt("Spe_ID")),
                    resultSet.getString("Ord_Date")));
            }
        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return ordonnance;
    }

    /*ResultSet resultSet = statement.executeQuery(test);

            while (resultSet.next()){
                System.out.println("Resultat : " + resultSet.getInt("Per_ID") + "-" + resultSet.getString("Per_Prenom"));
            }*/
}
