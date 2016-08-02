
package sisplanperguntas;


public class Ranking {
    int numero;
    String nome;
    int qtde_perguntas_realizadas;
    String tempo_total;
    String tempo_medio;
    int qtde_acertos;
    

    Ranking(int numero, String nome, int qtde_perguntas_realizadas, String tempo_total, String tempo_medio, int qtde_acertos) {
        this.numero = numero;
        this.nome = nome;
        this.qtde_perguntas_realizadas = qtde_perguntas_realizadas;
        this.tempo_total = tempo_total;
        this.tempo_medio = tempo_medio;
        this.qtde_acertos = qtde_acertos;
    }

    

    

    public void Inserir() {
        CadastroRanking.Cadastrar(numero, nome, qtde_perguntas_realizadas, tempo_total, tempo_medio, qtde_acertos);

    }
}
