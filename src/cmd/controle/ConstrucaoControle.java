package cmd.controle;

import cmd.entidade.Construcao;

/**
 * Classe de controle para CRUD de construção
 * @author voce
 */
public class ConstrucaoControle {
    
    /**
     * Salva uma construção, nova ou já existente
     * @param c Construção
     * @param novo true, se é um novo registro<br/>false, caso contrário
     * @return true, caso a operação seja concluída<br/>false, caso contrário
     */
    public boolean salvarConstrucao(Construcao c, boolean novo) {
        return true;
    }
    
    /**
     * Exclui uma construção já existente
     * @param c Construção
     * @return true, caso a operação seja concluída<br/>false, caso contrário
     */
    public boolean excluirConstrucao(Construcao c) {
        return true;
    }
    
    /**
     * Procura uma construção já existente a partir de código
     * @param id Id da construção
     * @return Construção, caso a operação seja concluída<br/>null, caso contrário
     */
    public Construcao buscarConstrucao(String id) {
        return null;
    }
}
