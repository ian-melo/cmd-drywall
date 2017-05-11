/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexão.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import tela_cadastro_materiais.Materiais;
import tela_cadastro_materiais.MaterialTable;

/**
 *
 * @author fe_mm
 */
public class MaterialDAO 
{
    public void Create(Materiais m)
    {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        
        try
        {
            stat = con.prepareStatement("INSERT INTO materiais(Id,Nome,Quantidade,Preco) VALUES(?,?,?,?)");
            stat.setInt(1,m.getId());
            stat.setString(2,m.getNome());
            stat.setInt(3,m.getQuantidade());
            stat.setFloat(4,m.getPreço());
            stat.executeUpdate();
            Alert dialogo1 = new Alert(Alert.AlertType.INFORMATION);
            dialogo1.setTitle("C.M.D");
            dialogo1.setHeaderText("C.M.D Informa!!!");
            dialogo1.setContentText("Dados Inseridos com Sucesso");
            dialogo1.showAndWait();
        }
        catch(SQLException e)
        {
            Alert dialogo = new Alert(Alert.AlertType.ERROR);
            dialogo.setTitle("C.M.D");
            dialogo.setHeaderText("C.M.D Informa!!!");
            dialogo.setContentText("Erro ao gravar informações: \n" + e);
            dialogo.showAndWait();
        }
        finally
        {
            ConnectionFactory.fechaConexão(con, stat);
        }
    }
    @SuppressWarnings("Unchecked")
    public List<Materiais> Listmateriais()
    {
        List<Materiais> list = new ArrayList<Materiais>();
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        ResultSet rs = null;
        
        try
        {
            stat = con.prepareStatement("SELECT * from materiais");
            rs = stat.executeQuery();
            
            while(rs.next())
            {
                Materiais m = new Materiais();
                m.setId(rs.getInt("Id"));
                m.setNome(rs.getString("Nome"));
                m.setQuantidade(rs.getInt("Quantidade"));
                m.setPreço(rs.getFloat("Preco"));
                list.add(m);
            }
            
        }
        catch(SQLException ex)
        {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            ConnectionFactory.fechaConexão(con, stat, rs);
        }
        return list;
    }
    public void Update(Materiais m)
    {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        
        try
        {
            stat = con.prepareStatement("UPDATE materiais SET Nome = ?, Quantidade = ?, Preco = ? WHERE Id = ?");
            stat.setString(1, m.getNome());
            stat.setInt(2, m.getQuantidade());
            stat.setFloat(3, m.getPreço());
            stat.setInt(4, m.getId());
            stat.executeUpdate();
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("C.M.D");
            alerta.setHeaderText("C.M.D Informa!!!");
            alerta.setContentText("Dados alterados com sucesso");
            alerta.showAndWait();
        }
        catch(SQLException e)
        {
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("C.M.D");
            alerta1.setHeaderText("C.M.D Informa!!!");
            alerta1.setContentText("Dados não alterados com sucesso");
            alerta1.showAndWait();
            
        }
        finally
        {
            ConnectionFactory.fechaConexão(con, stat); 
        }
    }
}
