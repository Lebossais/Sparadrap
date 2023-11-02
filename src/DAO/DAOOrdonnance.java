package DAO;

import gestion.Ordonnance;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from ordonnance");
        sqlInsertUtilisateur.append("where Ord_ID = ?");

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setInt(1, pId);

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return null;
    }

    @Override
    public List<Ordonnance> findALL() {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from ordonnance");

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.executeUpdate();

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }

        return null;
    }
}
