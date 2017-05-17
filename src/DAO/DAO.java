package DAO;

/**
 * Interface DAO para persistência de dados
 * @author voce
 * @param <K> Genérico de item a ser atuado na persistência
 */
public interface DAO <K> {
    public boolean inserir(K item);
    public boolean alterar(K item);
    public boolean excluir(K item);
    public K buscar();
    public java.util.List<K> listar();
}
