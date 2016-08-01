
package sisplanperguntas;


public class Temporaria {
    String data;
    String nivel;
    int codpergunta;
    String pergunta;  
    String usuario;

    Temporaria(String data, String nivel, int codpergunta, String pergunta, String usuario) {

        this.data = data;
        this.nivel = nivel;
        this.codpergunta = codpergunta;
        this.pergunta = pergunta;
        this.usuario = usuario;
    }

    

    

    public void Inserir() {
        CadastroTemporaria.Cadastrar(data, nivel, codpergunta, pergunta, usuario);

    }
}
