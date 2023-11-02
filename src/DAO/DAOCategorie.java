package DAO;

import gestion.Categorie;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAOCategorie extends DAO<Categorie> {


    @Override
    public boolean create(Categorie obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("insert into categorie");
        sqlInsertUtilisateur.append("Cat_ID, Cat_Categorie");
        sqlInsertUtilisateur.append("values (null,?)");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                this.connect.prepareStatement(sqlInsertUtilisateur.toString())) {

            preparedStatement.setString(1, obj.getCat_Categorie());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public boolean delete(Categorie obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Delete from categorie");
        sqlInsertUtilisateur.append("where cat_ID = ?");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setInt(1, obj.getCat_ID());

            preparedStatement.executeUpdate();
            requeteok = true;
        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public boolean update(Categorie obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Update categorie");
        sqlInsertUtilisateur.append("set Cat_Categorie = ?");
        sqlInsertUtilisateur.append("where Cat_ID = ? ");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setString(1,obj.getCat_Categorie());
            preparedStatement.setInt(2, obj.getCat_ID());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public Categorie find(Integer pId) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from categorie");
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
    public List findALL() {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from categorie");

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
