//TODO: Completar
//TODO: Testar
package cmd.DAO;

import cmd.util.HibernateUtil;
import org.hibernate.Session;
import java.util.List;
import cmd.entidade.Cliente;
import org.hibernate.HibernateException;


/**
 * Classe DAO para Cliente
 * @author ian-melo
 */
public class ClienteDAO implements DAO<Cliente> {
    
    @Override
    public boolean inserir(Cliente item) {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(item);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch(HibernateException e) {
            return false;
        }
    }

    @Override
    public boolean alterar(Cliente item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Cliente item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscar(String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
