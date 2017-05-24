package cmd.entidade;
// Generated 23/05/2017 06:48:11 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * RegistroAtividade generated by hbm2java
 */
public class RegistroAtividade  implements java.io.Serializable {


     private Integer codRegistro;
     private Funcionario funcionario;
     private Date dataHora;
     private RegistroOrcamento registroOrcamento;
     private RegistroConstrucao registroConstrucao;

    public RegistroAtividade() {
    }

    public RegistroAtividade(Funcionario funcionario, Date dataHora, RegistroOrcamento registroOrcamento, RegistroConstrucao registroConstrucao) {
       this.funcionario = funcionario;
       this.dataHora = dataHora;
       this.registroOrcamento = registroOrcamento;
       this.registroConstrucao = registroConstrucao;
    }
   
    public Integer getCodRegistro() {
        return this.codRegistro;
    }
    
    public void setCodRegistro(Integer codRegistro) {
        this.codRegistro = codRegistro;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Date getDataHora() {
        return this.dataHora;
    }
    
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    public RegistroOrcamento getRegistroOrcamento() {
        return this.registroOrcamento;
    }
    
    public void setRegistroOrcamento(RegistroOrcamento registroOrcamento) {
        this.registroOrcamento = registroOrcamento;
    }
    public RegistroConstrucao getRegistroConstrucao() {
        return this.registroConstrucao;
    }
    
    public void setRegistroConstrucao(RegistroConstrucao registroConstrucao) {
        this.registroConstrucao = registroConstrucao;
    }




}

