
package fr.solutec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AccessDB {
     protected static String DRIVER_NAME = "com.mysql.jdbc.driver";
    protected static String DB_NAME = "bdpoids2";
    protected static String URL = "jdbc:mysql://localhost/"+DB_NAME;
    protected static String USER = "root";
    protected static String PASSWORD = "";
    
    static{
        //Chargement pilote
        try {
            Class.forName(DRIVER_NAME).newInstance();
        } catch (Exception e) {
            System.out.println("Erreur chargement driver : " + e.getMessage());
        }
    }
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
