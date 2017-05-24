package DAO;

import cmd.entidade.Construcao;
import cmd.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author voce
 */
public class ConstrucaoDAO implements DAO<Construcao> {

    @Override
    public boolean inserir(Construcao item) {
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
        return false;
    }

    @Override
    public boolean alterar(Construcao item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Construcao item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Construcao buscar(String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Construcao> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
