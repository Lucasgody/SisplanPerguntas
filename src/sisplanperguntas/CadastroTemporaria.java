
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class CadastroTemporaria {
    public static void Cadastrar(String data, String nivel, int codpergunta, String pergunta, String usuario) {

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
            connection.setAutoCommit(false);
            System.out.println("Banco de dados aberto com sucesso!");

            statement = connection.createStatement();
            String sql = "INSERT INTO TEMPORARIA (DATA,NIVEL,CODPERGUNTA,PERGUNTA,USUARIO)"
                    + "VALUES ('"+ data +"','"+ nivel +"',"+ codpergunta +",'"+ pergunta +"','"+ usuario +"')";

            statement.executeUpdate(sql);

            statement.close();
            connection.commit();
            connection.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + "Erro no Insert classe(CadastroTemporaria) " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro Inesperado no Insert Class CadastroResposta ");
        }
        System.out.println("Dados armazenados com sucesso!");

    }
}
