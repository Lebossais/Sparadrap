package DAO;

import gestion.Medicament;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAOMedicament extends DAO<Medicament> {

    @Override
    public boolean create(Medicament obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("insert into medicament");
        sqlInsertUtilisateur.append("Medi_ID, Medi_Nom, Medi_Prix, Medi_DateMiseService, Cat_ID");
        sqlInsertUtilisateur.append("values (null, ?, ?, ?, ?)");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())) {

            preparedStatement.setString(1, obj.getNom());
            preparedStatement.setInt(2, obj.getPrix());
            preparedStatement.setString(3, obj.getDate_Mise_en_Service());
            preparedStatement.setInt(4, obj.getCategorie().getCat_ID());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public boolean delete(Medicament obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Delete from medicament");
        sqlInsertUtilisateur.append("where Medi_ID = ?");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setInt(1, obj.getMedi_ID());

            preparedStatement.executeUpdate();
            requeteok = true;
        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public boolean update(Medicament obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Update medicament");
        sqlInsertUtilisateur.append("set Medi_Nom = ?, Medi_Prix = ?, Medi_DateMiseService = ?, Cat_ID = ?");
        sqlInsertUtilisateur.append("where Medi_ID = ? ");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setString(1,obj.getNom());
            preparedStatement.setInt(2, obj.getPrix());
            preparedStatement.setString(3,obj.getDate_Mise_en_Service());
            preparedStatement.setInt(4, obj.getCategorie().getCat_ID());
            preparedStatement.setInt(5, obj.getMedi_ID());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public Medicament find(Integer pId) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from medicament");
        sqlInsertUtilisateur.append("where Medi_ID = ?");

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
    public List<Medicament> findALL() {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from medicament");

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
