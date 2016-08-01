
package sisplanperguntas;


public class CadPergunta {
    String pergunta;
    String alternativa1;
    String alternativa2;
    String alternativa3;
    String alternativa4;
    String alternativa5;
    String certa1;
    String certa2;
    String certa3;
    String certa4;
    String certa5;
    String nivel;
    

    CadPergunta(String pergunta, String alternativa1, String alternativa2, String alternativa3, String alternativa4, String alternativa5, String certa1, String certa2, String certa3, String certa4, String certa5, String nivel) {

        this.pergunta = pergunta;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
        this.alternativa5 = alternativa5;
        this.certa1 = certa1;
        this.certa2 = certa2;
        this.certa3 = certa3;
        this.certa4 = certa4;
        this.certa5 = certa5;
        this.nivel = nivel;
    }

    

    

    public void Inserir() {
        CadastroCadPergunta.Cadastrar(pergunta, alternativa1, alternativa2, alternativa3, alternativa4, alternativa5, certa1, certa2, certa3, certa4, certa5, nivel);

    }
}
