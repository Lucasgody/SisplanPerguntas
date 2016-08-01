
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CriandoTabelaCadPerguntas {
    public static void main ( String args[])
   {
       Connection connection = null;
       Statement statement = null;
       try {
           Class.forName("org.sqlite.JDBC");
           connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
           System.out.println("Banco de dados aberto com sucesso!");
           
           statement = connection.createStatement();
           String sql = "CREATE TABLE CADPERGUNTAS " +
                   "(NUMERO INTEGER PRIMARY KEY AUTOINCREMENT,"+
                   "PERGUNTA    CHAR(500)    ," +
                   "ALTERNATIVA1     CHAR(500)      ," +
                   "ALTERNATIVA2 CHAR(500)  ," + 
                   "ALTERNATIVA3 CHAR(500)  ," +
                   "ALTERNATIVA4 CHAR(500) ," +
                   "ALTERNATIVA5 CHAR(500) ," + 
                   "CERTA1 CHAR(6) ," +
                   "CERTA2 CHAR(6) ," +
                   "CERTA3 CHAR (6) ," +
                   "CERTA4 CHAR (6) ," +
                   "CERTA5 CHAR(6), " +
                   "NIVEL CHAR(8) )";
           
           statement.executeUpdate(sql); //comando que executa a criação da tabela
           statement.close();
           connection.close();
       } catch (Exception e) {
           System.err.println (e.getClass().getName() + "Erro na Creat table CadPerguntas " + e.getMessage());
           
        }
       System.out.println("Tabela criada com sucesso! ");
   }
}
