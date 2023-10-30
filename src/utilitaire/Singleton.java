package utilitaire;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Singleton {

    private static final String PATHCONF = ".src/confDB.properties";
    private static final Properties props = new Properties();
    private static Connection connection;

    private Singleton()
    {
        try {
            Class.forName( props.getProperty("jdbc.driver.class") );

            FileInputStream file = new FileInputStream(PATHCONF) ;
            props.load(file);
            props.setProperty("user", props.getProperty("jdbc.login"));
            props.setProperty("password", props.getProperty("jdbc.password"));

            connection = DriverManager.getConnection(props.getProperty("jdbc.url"),props);

        } catch (HeadlessException | IOException | SQLException | ClassNotFoundException e)
        {
            System.out.println("RelationwithDB connection " + e.getMessage());
        }

    }
    private static Connection getConnection() {
        return connection;
    }

    private static Connection getInstanceDB() {
        if (getConnection() == null) {
            new Singleton();
            System.out.println("RelationWithDB infos : Connection etablished");
        }
        else {
            System.out.println("RelationWithDB infos : Connection already existing");
        }
        return getConnection();
    }

    private static void closeInstanceDB() {
        try {
            Singleton.getConnection().close();
            System.out.println("RelationWithDB infos : Connection terminated");
        }
        catch (SQLException sqle){
            System.out.println("RelationWithDB erreur : " + sqle.getMessage() + " [SQL errore code : " + sqle.getSQLState() + " ] " );
        }
    }
}
