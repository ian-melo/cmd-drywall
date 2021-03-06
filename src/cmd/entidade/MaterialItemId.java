package cmd.entidade;
// Generated 29/10/2017 11:08:24 by Hibernate Tools 4.3.1



/**
 * MaterialItemId generated by hbm2java
 */
public class MaterialItemId  implements java.io.Serializable {


     private int codMaterial;
     private int codItem;

    public MaterialItemId() {
    }

    public MaterialItemId(int codMaterial, int codItem) {
       this.codMaterial = codMaterial;
       this.codItem = codItem;
    }
   
    public int getCodMaterial() {
        return this.codMaterial;
    }
    
    public void setCodMaterial(int codMaterial) {
        this.codMaterial = codMaterial;
    }
    public int getCodItem() {
        return this.codItem;
    }
    
    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MaterialItemId) ) return false;
		 MaterialItemId castOther = ( MaterialItemId ) other; 
         
		 return (this.getCodMaterial()==castOther.getCodMaterial())
 && (this.getCodItem()==castOther.getCodItem());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodMaterial();
         result = 37 * result + this.getCodItem();
         return result;
   }   


}


