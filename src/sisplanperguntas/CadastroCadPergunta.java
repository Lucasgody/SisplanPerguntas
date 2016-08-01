
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CadastroCadPergunta {
    public static void Cadastrar(String pergunta, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String alternativa5, String certa1, String certa2, String certa3, String certa4, String certa5, String nivel) {

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
            connection.setAutoCommit(false);
            System.out.println("Banco de dados aberto com sucesso!");

            statement = connection.createStatement();
            String sql = "INSERT INTO CADPERGUNTAS (PERGUNTA,ALTERNATIVA1,ALTERNATIVA2,ALTERNATIVA3,ALTERNATIVA4,ALTERNATIVA5,CERTA1,CERTA2,CERTA3,CERTA4,CERTA5,NIVEL)"
                    + "VALUES ('"+ pergunta +"','"+ alternativa1 +"','"+ alternativa2 +"','"+ alternativa3 +"','"+ alternativa4 +"','"+ alternativa5 +"','"+ certa1 +"','"+ certa2 +"','"+ certa3 +"','"+ certa4 +"','"+ certa5 +"','"+ nivel +"')";

            statement.executeUpdate(sql);

            statement.close();
            connection.commit();
            connection.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + "Erro no Insert classe(CadPerguntas) " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro Inesperado no Insert Class CadPerguntas");
        }
        System.out.println("Dados armazenados com sucesso!");

    }
}
