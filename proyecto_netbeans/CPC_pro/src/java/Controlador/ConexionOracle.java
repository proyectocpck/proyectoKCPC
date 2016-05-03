/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.util.jar.Pack200.Packer.PASS;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.driver.OracleDriver;

/**
 *
 * @author HARLIN
 */
public class ConexionOracle {

    private final String USUARIO = "CPCDB";
    private final String PASSWORD = "1234";
    private final String SID = "XE";
    private final String HOST = "localhost";
    private final int PUERTO = 1521;
    private Connection connection;

    public Connection geConexionOracle() {
        return connection;
    }

    public void registrarDriver() throws SQLException {
        OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(oracleDriver);
    }

    public void conectar() throws SQLException {
        if (connection == null || connection.isClosed() == true) {
            String cadenaCoenexion = "jdbc:oracle:thin:0"
                    + HOST + " : "
                    + PUERTO + " : "
                    + SID;

            registrarDriver();
            connection = DriverManager.getConnection(cadenaCoenexion, USUARIO, PASS);

        }
    }

    public void cerrar() throws SQLException {
        if (connection != null && connection.isClosed() == false) {
            connection.close();
        }
    }
    
    public static void main(String args[]) {

        ConexionOracle conexionOracle = new ConexionOracle();
        try {
            conexionOracle.conectar();
            Connection conn = conexionOracle.geConexionOracle();
            // driver@machineName:port:SID           ,  userid,  password
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("select BANNER from SYS.V_$VERSION");
            while (rset.next()) {
                System.out.println(rset.getString(1));   // Print col 1
            }
            stmt.close();
            conexionOracle.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionOracle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
