package DAO;

import gestion.Personne;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAOPersonne extends DAO<Personne> {
    @Override
    public boolean create(Personne obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("insert into categorie");
        sqlInsertUtilisateur.append("Per_ID, Per_Prenom, Per_Nom, Per_Telephone, Per_Email, Adr_ID");
        sqlInsertUtilisateur.append("values (null, ?, ?, ?, ?, ?)");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())) {

            preparedStatement.setString(1, obj.getPrenom());
            preparedStatement.setString(2, obj.getName());
            preparedStatement.setString(3, obj.getTelephone());
            preparedStatement.setString(4, obj.getEmail());
            preparedStatement.setInt(5, obj.getAdresse().getAdr_ID());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        } ;

        return requeteok;
    }

    @Override
    public boolean delete(Personne obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Delete from personne");
        sqlInsertUtilisateur.append("where Per_ID = ?");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setInt(1, obj.getPer_ID());

            preparedStatement.executeUpdate();
            requeteok = true;
        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }


        return requeteok;
    }

    @Override
    public boolean update(Personne obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Update personne");
        sqlInsertUtilisateur.append("set Per_Prenom = ?, Per_Nom = ?," +
                " Per_Telephone = ?, Per_Email = ?, Adr_ID = ?");
        sqlInsertUtilisateur.append("where Per_ID = ? ");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setString(1, obj.getPrenom());
            preparedStatement.setString(2, obj.getName());
            preparedStatement.setString(3, obj.getTelephone());
            preparedStatement.setString(4, obj.getEmail());
            preparedStatement.setInt(5, obj.getAdresse().getAdr_ID());
            preparedStatement.setInt(6, obj.getPer_ID());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public Personne find(Integer pId) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from personne");
        sqlInsertUtilisateur.append("where Cat_ID = ?");

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
    public List<Personne> findALL() {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from personne");

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