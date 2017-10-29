package cmd.entidade;
// Generated 29/10/2017 11:08:24 by Hibernate Tools 4.3.1



/**
 * RegistroOrcamento generated by hbm2java
 */
public class RegistroOrcamento  implements java.io.Serializable {


     private int codRegistro;
     private RegistroAtividade registroAtividade;
     private String atividade;
     private String tabela;
     private String detalhe;

    public RegistroOrcamento() {
    }

	
    public RegistroOrcamento(RegistroAtividade registroAtividade) {
        this.registroAtividade = registroAtividade;
    }
    public RegistroOrcamento(RegistroAtividade registroAtividade, String atividade, String tabela, String detalhe) {
       this.registroAtividade = registroAtividade;
       this.atividade = atividade;
       this.tabela = tabela;
       this.detalhe = detalhe;
    }
   
    public int getCodRegistro() {
        return this.codRegistro;
    }
    
    public void setCodRegistro(int codRegistro) {
        this.codRegistro = codRegistro;
    }
    public RegistroAtividade getRegistroAtividade() {
        return this.registroAtividade;
    }
    
    public void setRegistroAtividade(RegistroAtividade registroAtividade) {
        this.registroAtividade = registroAtividade;
    }
    public String getAtividade() {
        return this.atividade;
    }
    
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public String getTabela() {
        return this.tabela;
    }
    
    public void setTabela(String tabela) {
        this.tabela = tabela;
    }
    public String getDetalhe() {
        return this.detalhe;
    }
    
    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }




}


