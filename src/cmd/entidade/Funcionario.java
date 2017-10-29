package cmd.entidade;
// Generated 29/10/2017 11:08:24 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Funcionario generated by hbm2java
 */
public class Funcionario  implements java.io.Serializable {


     private Integer codFuncionario;
     private String login;
     private String senha;
     private Boolean xdead;
     private Set registroAtividades = new HashSet(0);

    public Funcionario() {
    }

    public Funcionario(String login, String senha, Boolean xdead, Set registroAtividades) {
       this.login = login;
       this.senha = senha;
       this.xdead = xdead;
       this.registroAtividades = registroAtividades;
    }
   
    public Integer getCodFuncionario() {
        return this.codFuncionario;
    }
    
    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Boolean getXdead() {
        return this.xdead;
    }
    
    public void setXdead(Boolean xdead) {
        this.xdead = xdead;
    }
    public Set getRegistroAtividades() {
        return this.registroAtividades;
    }
    
    public void setRegistroAtividades(Set registroAtividades) {
        this.registroAtividades = registroAtividades;
    }




}


