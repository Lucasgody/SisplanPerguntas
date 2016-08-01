
package sisplanperguntas;


public class CadGrupo {
    String descricao;
    
    

    CadGrupo(String descricao) {

        this.descricao = descricao;
    }

    

    

    public void Inserir() {
        CadastroCadGrupo.Cadastrar(descricao);

    }
}
