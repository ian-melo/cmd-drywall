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
import cmd.conexao.ConnectionFactory;
import Entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
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
            stat = con.prepareStatement("SELECT * from funcionario WHERE Login = ? and Senha = ?");
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
            ConnectionFactory.fecharConexao(con, stat, rs);
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
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("C.M.D");
            alerta.setHeaderText("C.M.D Informa!!!");
            alerta.setContentText("Dados cadastrados com sucesso");
            alerta.showAndWait();
        }
        catch(SQLException ex)
        {
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("C.M.D");
            alerta1.setHeaderText("C.M.D Informa!!!");
            alerta1.setContentText("Dados não cadastrados com sucesso");
            alerta1.showAndWait();
        }
        finally
        {
            ConnectionFactory.fecharConexao(con, stat);
        }
        
    }
    
}
