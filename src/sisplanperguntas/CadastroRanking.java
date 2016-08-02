
package sisplanperguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class CadastroRanking {
    public static void Cadastrar(int numero, String nome, int qtde_perguntas_realizadas, String tempo_total, String tempo_medio, int qtde_acertos) {

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Perguntas.db");
            connection.setAutoCommit(false);
            System.out.println("Banco de dados aberto com sucesso!");

            statement = connection.createStatement();
            String sql = "INSERT INTO RANKING (NUMERO,NOME,QTDE_PERGUNTAS_REALIZADAS,TEMPO_TOTAL,TEMPO_MEDIO,QTDE_ACERTOS)"
                    + "VALUES ("+ numero +","+ nome +","+ qtde_perguntas_realizadas +",'"+ tempo_total +"','"+ tempo_medio +"',"+ qtde_acertos +")";

            statement.executeUpdate(sql);

            statement.close();
            connection.commit();
            connection.close();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + "Erro no Insert classe(CadastroRanking) " + e.getMessage());
        }
        System.out.println("Dados armazenados com sucesso!");

    }
}
