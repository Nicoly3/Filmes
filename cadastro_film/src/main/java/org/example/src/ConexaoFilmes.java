package org.example;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;


public class ConexaoFilmes {

    public static Connection conecta(){

        try {

            final String url = "jdbc:mysql://localhost:3306?user=root&password=root";

            Connection conn = DriverManager

                    .getConnection(url);

            return conn;

        } catch (SQLException e) {

            System.out.println("Erro conexão" + e.getMessage());

            return null;


        }

    }

}