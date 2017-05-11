/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author fe_mm
 */
import Conexão.ConnectionFactory;
import Usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class UsuárioDAO 
{
    public boolean CheckLogin(String nome, String senha)
    {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        ResultSet rs = null;
        boolean check = false;
        
        try
        {
            stat = con.prepareStatement("SELECT * from login WHERE Nome = ? and Senha = ?");
            stat.setString(1, nome);
            stat.setString(2, senha);
            rs = stat.executeQuery();
            
            if(rs.next())
            {
                check = true;
            }
        }
        catch(SQLException ex)
        {
             Logger.getLogger(UsuárioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            ConnectionFactory.fechaConexão(con, stat, rs);
        }
        return check;
    }
    
    public void create(Usuario u)
    {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        
        try
        {
            stat = con.prepareStatement("INSERT INTO login(Id,Nome,Senha) VALUES(?,?,?)");
            stat.setInt(1,u.getId_user());
            stat.setString(2,u.getNome());
            stat.setString(3,u.getSenha());
            stat.executeUpdate();
            System.out.println("Salvo com sucesso");
        }
        catch(SQLException ex)
        {
            System.out.println("Erro ao salvar" + ex);
        }
        finally
        {
            ConnectionFactory.fechaConexão(con, stat);
        }
        
    }
    
}
