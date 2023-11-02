package DAO;

import gestion.Client;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAOClient extends DAO<Client> {
    @Override
    public boolean create(Client obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("insert into client");
        sqlInsertUtilisateur.append("Cli_ID, Cli_DateNaissance, Cli_NumSecu, Per_ID, Med_ID, Spe_ID, Mut_ID");
        sqlInsertUtilisateur.append("values (null, ?, ?, ?, ?, ?, ?)");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())) {

            preparedStatement.setString(1, obj.getDate_Naissance());
            preparedStatement.setString(2, obj.getNumero_Secu());
            preparedStatement.setInt(3, obj.getPersonne().getPer_ID());
            preparedStatement.setInt(4, obj.getMedecin_Traitant().getMed_ID());
            preparedStatement.setInt(5, obj.getSpecialiste().getSpe_ID());
            preparedStatement.setInt(6, obj.getMutuelle().getMut_ID());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public boolean delete(Client obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Delete from client");
        sqlInsertUtilisateur.append("where Cli_ID = ?");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setInt(1, obj.getCli_ID());

            preparedStatement.executeUpdate();
            requeteok = true;
        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public boolean update(Client obj) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("Update client");
        sqlInsertUtilisateur.append("set Cli_DateNaissance = ?, Cli_NumSecu = ?, " +
                "Per_ID = ?, Med_ID = ?, Spe_ID = ?, Mut_ID = ?");
        sqlInsertUtilisateur.append("where Cli_ID = ? ");

        boolean requeteok = false;

        try (PreparedStatement preparedStatement =
                     this.connect.prepareStatement(sqlInsertUtilisateur.toString())){

            preparedStatement.setString(1, obj.getDate_Naissance());
            preparedStatement.setString(2, obj.getNumero_Secu());
            preparedStatement.setInt(3, obj.getPersonne().getPer_ID());
            preparedStatement.setInt(4, obj.getMedecin_Traitant().getMed_ID());
            preparedStatement.setInt(5, obj.getSpecialiste().getSpe_ID());
            preparedStatement.setInt(6, obj.getMutuelle().getMut_ID());
            preparedStatement.setInt(7, obj.getCli_ID());

            preparedStatement.executeUpdate();
            requeteok = true;

        } catch (SQLException sqle) {
            System.out.println("RelationWithDB erreur" + sqle.getMessage()
                    + "[SQL error code :" + sqle.getSQLState() +"]");
        }
        return requeteok;
    }

    @Override
    public Client find(Integer pId) {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from client");
        sqlInsertUtilisateur.append("where Cli_ID = ?");

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
    public List<Client> findALL() {
        StringBuilder sqlInsertUtilisateur = new StringBuilder();
        sqlInsertUtilisateur.append("select * from client");

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
