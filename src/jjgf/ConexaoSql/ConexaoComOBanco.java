/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JJGF.ConexaoSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author jadil
 */
public class ConexaoComOBanco {
    
    private Statement stmt;
    public Connection conn;
    private final String DRIVER_SQLSERVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String LOCAL_SERVIDOR = "DESKTOP-J2J1GKG" ;
    private final String BANCO_DE_DADOS = "JJGF1";
    private final String PORTA_BANCO = "1433";
    private final String USUARIO = "horus";
    private final String SENHA = "1234";

    public Connection conectar() throws Exception {
        return this.conectarSqlServer();
    }

    public void desconectar() throws SQLException {
        conn.close();
    }

   

    private Connection conectarSqlServer() throws Exception {
        Class.forName(DRIVER_SQLSERVER);
        String url = "jdbc:sqlserver://"+LOCAL_SERVIDOR+":"+PORTA_BANCO+";DatabaseName="+BANCO_DE_DADOS;
        conn = DriverManager.getConnection(url, USUARIO, SENHA);
        return conn;
    }

  
}
