
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CadastroResposta {
    public static void Cadastrar(String usuario, String tempo, int codpergunta, String pergunta, String alternativa_escolhida, String certa_errada, String nivel) {

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
            connection.setAutoCommit(false);
            System.out.println("Banco de dados aberto com sucesso!");

            statement = connection.createStatement();
            String sql = "INSERT INTO RESPOSTA (USUARIO,TEMPO,CODPERGUNTA,PERGUNTA,ALTERNATIVA_ESCOLHIDA,CERTA_ERRADA,NIVEL)"
                    + "VALUES ('"+ usuario +"','"+ tempo +"',"+ codpergunta +",'"+ pergunta +"','"+ alternativa_escolhida +"','"+ certa_errada +"','"+ nivel +"')";

            statement.executeUpdate(sql);

            statement.close();
            connection.commit();
            connection.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + "Erro no Insert classe(CadastroResposta) " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro Inesperado no Insert Class CadastroResposta ");
        }
        System.out.println("Dados armazenados com sucesso!");

    }
}
