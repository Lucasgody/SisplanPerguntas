
package sisplanperguntas;


public class Random {
    int random;
    int qtde_pergunta;
    int qtde_realizada;
    

    Random(int random, int qtde_pergunta, int qtde_realizada) {

        this.random = random;
        this.qtde_pergunta = qtde_pergunta;
        this.qtde_realizada = qtde_realizada;
    }

    

    

    public void Inserir() {
        CadastroRandom.Cadastrar(random, qtde_pergunta, qtde_realizada);

    }
}
