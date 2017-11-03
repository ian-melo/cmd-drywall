/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.novo.controle;

import cmd.DAO.DAO;
import cmd.entidade.Endereco;
import cmd.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Usuario
 */
public class CadastroEnderecoControle implements DAO<Endereco> {

    @Override
    public boolean inserir(Endereco item) {
        try {
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            s.save(item);
            s.getTransaction().commit();
            s.close();
            return true;
        } catch (HibernateException e) {
            return false;
        }
    }

    @Override
    public boolean alterar(Endereco item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Endereco item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Endereco buscar(String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Endereco> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
