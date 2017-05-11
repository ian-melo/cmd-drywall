/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clientes.Clientes;
import Conexão.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import tela_cadastro_materiais.Materiais;

/**
 *
 * @author fe_mm
 */
public class ClienteDAO {
    
    public void Create(Clientes cli)
    {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        
        try
        {
            stat = con.prepareStatement("INSERT INTO cliente(Id,Nome,Endereco,Cpf,Projeto,Protocolo,Telefone,Email) VALUES(?,?,?,?,?,?,?,?)");
            stat.setInt(1, cli.getId());
            stat.setString(2, cli.getNome());
            stat.setString(3, cli.getEndereço());
            stat.setString(4, cli.getCpf_cnpj());
            stat.setString(5, cli.getNome_projeto());
            stat.setInt(6, cli.getNumero_protocolo());
            stat.setString(7, cli.getTelefone());
            stat.setString(8, cli.getEmail());
            stat.executeUpdate();
            Alert dialogo1 = new Alert(Alert.AlertType.INFORMATION);
            dialogo1.setTitle("C.M.D");
            dialogo1.setHeaderText("C.M.D Informa!!!");
            dialogo1.setContentText("Dados Inseridos com Sucesso");
            dialogo1.showAndWait();
            
        }
        catch(SQLDataException e)
        {
            Alert dialogo = new Alert(Alert.AlertType.ERROR);
            dialogo.setTitle("C.M.D");
            dialogo.setHeaderText("C.M.D Informa!!!");
            dialogo.setContentText("Erro ao gravar informações: \n" + e);
            dialogo.showAndWait();
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
           ConnectionFactory.fechaConexão(con, stat);
        }
    }
    @SuppressWarnings("Unchecked")
    public List<Clientes> ListClientes()
    {
        List<Clientes> list = new ArrayList<Clientes>();
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        ResultSet rs = null;
        
        try
        {
            stat = con.prepareStatement("SELECT * from cliente");
            rs = stat.executeQuery();
            
            while(rs.next())
            {
                Clientes m = new Clientes();
                m.setId(rs.getInt("Id"));
                m.setNome(rs.getString("Nome"));
                m.setEndereço(rs.getString("Endereco"));
                m.setCpf_cnpj(rs.getString("Cpf"));
                m.setNome_projeto(rs.getString("Projeto"));
                m.setNumero_protocolo(rs.getInt("Protocolo"));
                m.setTelefone(rs.getString("Telefone"));
                m.setEmail(rs.getString("email"));
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
    
    
}
