
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CriandoTabelaRandom {
    public static void main ( String args[])
   {
       Connection connection = null;
       Statement statement = null;
       try {
           Class.forName("org.sqlite.JDBC");
           connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
           System.out.println("Banco de dados aberto com sucesso!");
           
           statement = connection.createStatement();
           String sql = "CREATE TABLE RANDOM " +
                   "(RANDOM INTEGER ," +
                   "QTDE_PERGUNTA INTEGER ," +
                   "QTDE_REALIZADA INTEGER )";
           
           statement.executeUpdate(sql); //comando que executa a criação da tabela
           statement.close();
           connection.close();
       } catch (Exception e) {
           System.err.println (e.getClass().getName() + "Erro na Creat table CadPerguntas " + e.getMessage());
           
        }
       System.out.println("Tabela criada com sucesso! ");
   }
}
