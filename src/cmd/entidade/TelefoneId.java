package cmd.entidade;
// Generated 23/05/2017 06:48:11 by Hibernate Tools 4.3.1



/**
 * TelefoneId generated by hbm2java
 */
public class TelefoneId  implements java.io.Serializable {


     private int codCliente;
     private String numero;

    public TelefoneId() {
    }

    public TelefoneId(int codCliente, String numero) {
       this.codCliente = codCliente;
       this.numero = numero;
    }
   
    public int getCodCliente() {
        return this.codCliente;
    }
    
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TelefoneId) ) return false;
		 TelefoneId castOther = ( TelefoneId ) other; 
         
		 return (this.getCodCliente()==castOther.getCodCliente())
 && ( (this.getNumero()==castOther.getNumero()) || ( this.getNumero()!=null && castOther.getNumero()!=null && this.getNumero().equals(castOther.getNumero()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodCliente();
         result = 37 * result + ( getNumero() == null ? 0 : this.getNumero().hashCode() );
         return result;
   }   


}

