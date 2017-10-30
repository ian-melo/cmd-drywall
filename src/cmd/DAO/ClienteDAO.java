/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.DAO;

import cmd.entidade.Cliente;
import cmd.conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;


/**
 *
 * @author fe_mm
 * modificado F
 */
public class ClienteDAO{
    private String sql;
    
    public void Create(Cliente c)
    {/*
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        
        try{
            sql = "INSERT INTO Cliente VALUES(NULL,?,?,?, FALSE)";
            stat = con.prepareStatement(sql);
            //hhgh
            stat.setInt(1, c.getId());
            stat.setString(2, c.getDataInscricao());
            stat.setString(3, c.getEndereco().toString());
          
            stat.executeUpdate();
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("C.M.D");
            alerta.setHeaderText("C.M.D Informa!!!");
            alerta.setContentText("Dados cadastrados com sucesso");
            alerta.showAndWait();
        }
        catch(SQLException e)
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
    */}
    @SuppressWarnings("Unchecked")
    public List<Cliente> ListaClientes()
    {/*
        List<Cliente> cli = new ArrayList<>();
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        ResultSet rs = null;
        
        try
        {
            stat = con.prepareStatement("SELECT * from cliente1");
            rs = stat.executeQuery();
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setId(rs.getInt("Id"));
                c.setNome(rs.getString("Nome"));
                c.setCpf(rs.getString("Cpf"));
                c.setEndereço(rs.getString("Endereco"));
                c.setProjeto(rs.getString("Projeto"));
                c.setProtocolo(rs.getInt("Protocolo"));
                c.setTelefone(rs.getString("Telefone"));
                c.setEmail(rs.getString("Email"));
                cli.add(c);
            }
            
        }
        catch(SQLException e)
        {
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("C.M.D");
            alerta1.setHeaderText("C.M.D Informa!!!");
            alerta1.setContentText("Erro ao listar" + e);
            alerta1.showAndWait();
        }
        finally
        {
           ConnectionFactory.fecharConexao(con, stat, rs);
        }
        return cli;
    */ return null;}
    public void Update(Cliente c)
    {/*
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        
        try
        {
            stat = con.prepareStatement("UPDATE cliente1 SET Nome = ?, Cpf = ?, Endereco = ?, Projeto = ?, Protocolo = ?, Telefone = ?, Email = ? WHERE Id = ? ");
            stat.setString(1, c.getNome());
            stat.setString(2, c.getCpf());
            stat.setString(3, c.getEndereço());
            stat.setString(4, c.getProjeto());
            stat.setInt(5, c.getProtocolo());
            stat.setString(6, c.getTelefone());
            stat.setString(7, c.getEmail());
            stat.setInt(8, c.getId());
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
            ConnectionFactory.fecharConexao(con, stat);
        }
    */}
}
