/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author MayuKogi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class JdbcConn{
        /**
         * @param args the command line arguments
         */
        // JDBC driver name and database URL
        static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost:3306/library?useSSL=false";

        //  Database credentials
        static final String USER = "root";
        static final String PASS = "root";

        public static void main(String[] args) throws SQLException {
            try {
                Connection conn = null;
                Statement stmt = null;

                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                //STEP 3: Open a connection
                System.out.println("Connecting to a selected database...");
                conn = DriverManager.getConnection(DB_URL, "root", "root");
                System.out.println("Connected database successfully...");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(library.JdbcConn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }


