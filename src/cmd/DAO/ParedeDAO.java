//TODO: Implementar
package cmd.DAO;

import cmd.entidade.Construcao;
import cmd.entidade.Parede;
import cmd.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Classe de DAO para Parede
 * @author voce
 */
public class ParedeDAO implements DAO<Parede> {

    @Override
    public boolean inserir(Parede item) {
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
    public boolean alterar(Parede item) {
        return false;
    }

    @Override
    public boolean excluir(Parede item) {
        return false;
    }

    @Override
    public Parede buscar(String consulta) {
        return null;
    }

    @Override
    public List<Parede> listar() {
        return null;
    }
    
}
