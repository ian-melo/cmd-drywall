//TODO: Implementar
package cmd.DAO;

import cmd.entidade.Construcao;
import cmd.entidade.Forro;
import cmd.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Classe de DAO para Forro
 * @author voce
 */
public class ForroDAO implements DAO<Forro> {

    @Override
    public boolean inserir(Forro item) {
        /*
        try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("from Construcao");
        List resultList = q.list();
        System.out.println(resultList.indexOf(0));
        session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        */
        return false;
    }

    @Override
    public boolean alterar(Forro item) {
        return false;
    }

    @Override
    public boolean excluir(Forro item) {
        return false;
    }

    @Override
    public Forro buscar(String consulta) {
        return null;
    }

    @Override
    public List<Forro> listar() {
        return null;
    }
    
}
