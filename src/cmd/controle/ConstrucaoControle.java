//TODO: Implementar
package cmd.controle;

import cmd.entidade.Construcao;
import cmd.entidade.Forro;
import cmd.entidade.Parede;

/**
 * Classe de controle para CRUD de construção
 * @author voce
 */
public class ConstrucaoControle {
    
    /**
     * Insere um forro
     * @param f Forro a ser inserido
     * @return true, caso a operação seja concluída<br/>false, caso contrário
     */
    public boolean inserirForro(Forro f) {
        return false;
    }
    
    /**
     * Altera um forro
     * @param f Forro a ser alterado
     * @return true, caso a operação seja concluída<br/>false, caso contrário
     */
    public boolean alterarForro(Forro f) {
        return false;
    }
    
    /**
     * Exclui um forro
     * @param f Forro a ser excluído
     * @return true, caso a operação seja concluída<br/>false, caso contrário
     */
    public boolean excluirForro(Forro f) {
        return false;
    }
    
    /**
     * Busca um forro
     * @param codigo Código do forro a ser buscado
     * @return Forro, caso encontre<br/>null, caso contrário
     */
    public Forro buscarForro(String codigo) {
        return null;
    }
    
    /**
     * Insere uma parede
     * @param p Parede a ser inserida
     * @return true, caso a operação seja concluída<br/>false, caso contrário
     */
    public boolean inserirParede(Parede p) {
        
        return false;
    }
    
    /**
     * Altera uma parede
     * @param p Parede a ser alterada
     * @return true, caso a operação seja concluída<br/>false, caso contrário
     */
    public boolean alterarParede(Parede p) {
        return false;
    }
    
    /**
     * Exclui uma parede
     * @param p Parede a ser excluída
     * @return true, caso a operação seja concluída<br/>false, caso contrário
     */
    public boolean excluirParede(Parede p) {
        return false;
    }
    
    /**
     * Busca uma parede
     * @param codigo Código da parede a ser buscado
     * @return Parede, caso encontre<br/>null, caso contrário
     */
    public Parede buscarParede(String codigo) {
        return null;
    }
}
