
package sisplanperguntas;


public class Resposta {
    String usuario;
    String tempo;
    int codpergunta;
    String pergunta;
    String alternativa_escolhida;
    String certa_errada;
    String nivel;   
    

    Resposta(String usuario, String tempo, int codpergunta, String pergunta, String alternativa_escolhida, String certa_errada, String nivel) {

        this.usuario = usuario;
        this.tempo = tempo;
        this.codpergunta = codpergunta;
        this.pergunta = pergunta;
        this.alternativa_escolhida = alternativa_escolhida;
        this.certa_errada = certa_errada;
        this.nivel = nivel;
    }

    

    

    public void Inserir() {
        CadastroResposta.Cadastrar(usuario, tempo, codpergunta, pergunta, alternativa_escolhida, certa_errada, nivel);

    }
}
