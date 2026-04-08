package org.example;



import java.sql.Connection;
public class TesteConexaoFilmes {




    public static void main(String[] args) {

        Connection conn= ConexaoFilmes.conecta();

        if (conn!=null){

            System.out.println("conectado");


        }

        else{

            System.out.println("erro de conexão");

        }

    }

}





