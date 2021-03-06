package cmd.entidade;
// Generated 29/10/2017 11:08:24 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orcamento generated by hbm2java
 */
public class Orcamento  implements java.io.Serializable {


     private Integer codOrcamento;
     private Cliente cliente;
     private Endereco endereco;
     private Date dataHora;
     private Boolean xdead;
     private Set items = new HashSet(0);

    public Orcamento() {
    }

    public Orcamento(Cliente cliente, Endereco endereco, Date dataHora, Boolean xdead, Set items) {
       this.cliente = cliente;
       this.endereco = endereco;
       this.dataHora = dataHora;
       this.xdead = xdead;
       this.items = items;
    }
   
    public Integer getCodOrcamento() {
        return this.codOrcamento;
    }
    
    public void setCodOrcamento(Integer codOrcamento) {
        this.codOrcamento = codOrcamento;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Date getDataHora() {
        return this.dataHora;
    }
    
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    public Boolean getXdead() {
        return this.xdead;
    }
    
    public void setXdead(Boolean xdead) {
        this.xdead = xdead;
    }
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }




}


