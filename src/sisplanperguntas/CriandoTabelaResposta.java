
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CriandoTabelaResposta {
    public static void main ( String args[])
   {
       Connection connection = null;
       Statement statement = null;
       try {
           Class.forName("org.sqlite.JDBC");
           connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
           System.out.println("Banco de dados aberto com sucesso!");
           
           statement = connection.createStatement();
           String sql = "CREATE TABLE RESPOSTA " +
                   "(USUARIO CHAR(100),"+
                   "TEMPO    CHAR(20)    ," +
                   "CODPERGUNTA INTEGER ," +
                   "PERGUNTA CHAR(500)  ," + 
                   "ALTERNATIVA_ESCOLHIDA CHAR(500)  ," +
                   "CERTA_ERRADA CHAR(6) ," +
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
