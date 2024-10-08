/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import tools.Utils;

/**
 *
 * @author stag
 */
public final class MariaDbConnection {

    //Objet Connection - Singleton
    private static Connection connection;

    //Constructeur privé pour éviter l'instanciation
    private MariaDbConnection() {
    }

    /**
     * Méthode qui va nous retourner notre instance et la créer si elle n'existe
     * pas (lazy singleton)
     *
     * @return la connexion vers la base de donnée ou null
     */
    public static Connection getInstance() throws RuntimeException {
        if (connection == null) {
            // La connexion n'existe pas encore, je la crée
            try { // charger le driver. Inutile en principe...
                Properties config = Utils.loadConfig();
                Class.forName("org.mariadb.jdbc.Driver");
                String url = "jdbc:" + config.getProperty("sgbd")
                        + "://" + config.getProperty("host")
                        + ":" + config.getProperty("port")
                        + "/" + config.getProperty("dbname");
                connection = DriverManager.getConnection(url, config);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(MariaDbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }

    //Ferme le singleton de connexion proprement.
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(MariaDbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
