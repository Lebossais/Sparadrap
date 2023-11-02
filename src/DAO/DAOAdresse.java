package DAO;

import utilitaire.Adresse;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAOAdresse extends DAO<Adresse> {
    @Override
    public boolean create(Adresse obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("insert into adresse");
        sqlInsertUtilisateur.append("Adr_Numero_Rue, Adr_Nom_Rue, Adr_Code_Postal, Adr_Ville, Adr_ID");
        sqlInsertUtilisateur.append("values (?, ?, ?, ?, null)");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())) {

            preparedStatement.setInt(1, obj.getNumero_rue());
            preparedStatement.setString(2, obj.getNom_rue());
            preparedStatement.setInt(3, obj.getCodePostal());
            preparedStatement.setString(4, obj.getVille());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public boolean delete(Adresse obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Delete from adresse");
        sqlInsertUtilisateur.append("where Adr_ID = ?");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setInt(1, obj.getAdr_ID());

            preparedStatement.executeUpdate();
            requeteok = true;
        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }


        return requeteok;
    }

    @Override
    public boolean update(Adresse obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Update adresse");
        sqlInsertUtilisateur.append("set Adr_Numero_Rue = ?");
        sqlInsertUtilisateur.append(",Adr_Nom_Rue = ?");
        sqlInsertUtilisateur.append(",Adr_Code_Postal = ?");
        sqlInsertUtilisateur.append(",Adr_Ville = ?");
        sqlInsertUtilisateur.append("where Cat_ID = ? ");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setInt(1,obj.getNumero_rue());
            preparedStatement.setString(2, obj.getNom_rue());
            preparedStatement.setInt(3,obj.getCodePostal());
            preparedStatement.setString(4,obj.getVille());
            preparedStatement.setInt(5,obj.getAdr_ID());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public Adresse find(Integer pId) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from adresse");
        sqlInsertUtilisateur.append("where Adr_ID = ?");

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
    public List<Adresse> findALL() {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from adresse");

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
