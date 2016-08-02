
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CriandoTabelaRanking {
    public static void main ( String args[])
   {
       Connection connection = null;
       Statement statement = null;
       try {
           Class.forName("org.sqlite.JDBC");
           connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
           System.out.println("Banco de dados aberto com sucesso!");
           
           statement = connection.createStatement();
           String sql = "CREATE TABLE RANKING " +
                   "(NUMERO INTEGER ," +
                   "NOME CHAR(100) ," +
                   "QTDE_PERGUNTAS_REALIZADAS INTEGER INTEGER," +
                   "TEMPO_TOTAL CHAR(10) ," +
                   "TEMPO_MEDIO CHAR(10) ," + 
                   "QTDE_ACERTOS INTEGER )";
           
           statement.executeUpdate(sql); //comando que executa a criação da tabela
           statement.close();
           connection.close();
       } catch (Exception e) {
           System.err.println (e.getClass().getName() + "Erro na Creat table Ranking " + e.getMessage());
           
        }
       System.out.println("Tabela criada com sucesso! ");
   }
}
