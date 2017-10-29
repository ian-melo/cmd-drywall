package cmd.entidade;
// Generated 29/10/2017 11:08:24 by Hibernate Tools 4.3.1



/**
 * Telefone generated by hbm2java
 */
public class Telefone  implements java.io.Serializable {


     private TelefoneId id;
     private Cliente cliente;
     private Boolean xdead;

    public Telefone() {
    }

	
    public Telefone(TelefoneId id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }
    public Telefone(TelefoneId id, Cliente cliente, Boolean xdead) {
       this.id = id;
       this.cliente = cliente;
       this.xdead = xdead;
    }
   
    public TelefoneId getId() {
        return this.id;
    }
    
    public void setId(TelefoneId id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Boolean getXdead() {
        return this.xdead;
    }
    
    public void setXdead(Boolean xdead) {
        this.xdead = xdead;
    }




}


