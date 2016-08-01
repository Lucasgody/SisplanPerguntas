
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;


public class BancoDeDados {
    public static void main (String args[]){
          Connection connection = null;
    try {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
    } catch (Exception e) {
        System.err.println (e.getClass().getName() + ": " + e.getMessage());
        System.exit(0);
        }
    System.out.println ("Banco criado com sucesso!");
      }
}
