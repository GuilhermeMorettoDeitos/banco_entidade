package br.senai.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public static Connection getConexao() throws SQLException {

        final String URL = "jdbc:mysql://localhost:3306/primeira_api";
        final String USER = "root";
        final String PASSWORD = "Gotadesql123@";

        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            if(conexao != null){
                System.out.println("Me conectei!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conexao;
    }

}
