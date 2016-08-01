
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CadastroRandom {
    public static void Cadastrar(int random, int qtde_pergunta, int qtde_realizada) {

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
            connection.setAutoCommit(false);
            System.out.println("Banco de dados aberto com sucesso!");

            statement = connection.createStatement();
            String sql = "INSERT INTO RANDOM (RANDOM,QTDE_PERGUNTA,QTDE_REALIZADA)"
                    + "VALUES ("+ random +","+ qtde_pergunta +","+ qtde_realizada +")";

            statement.executeUpdate(sql);

            statement.close();
            connection.commit();
            connection.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + "Erro no Insert classe(CadastroRandom) " + e.getMessage());
        }
        System.out.println("Dados armazenados com sucesso!");

    }
}
