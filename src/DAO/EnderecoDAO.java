/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clientes.Clientes;
import Clientes.Endereco;
import Conexão.ConnectionFactory;
import Entidade.Entidadecliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;

/**
 *
 * @author Usuario
 */
public class EnderecoDAO {

    private String sql;

    public void Create(Endereco e) {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;

        try {
            sql = "INSERT INTO Endereco VALUES(NULL,?,?,?,?,?,?,?,FALSE)";
            stat = con.prepareStatement(sql);

            stat.setInt(1, e.getId());
            stat.setString(2, e.getLogradouro());
            stat.setInt(3, e.getNumero());
            stat.setString(4, e.getComplemento());
            stat.setString(5, e.getCep());
            stat.setString(6, e.getBairro());
            stat.setString(7, e.getCidade());
            stat.setString(8, e.getUf());

            stat.executeUpdate();

            Mensagem_Alerta_Info("Dados cadastrados com sucesso", Alert.AlertType.INFORMATION);

        } catch (SQLException ex) {

            Mensagem_Alerta_Info("Dados não cadastrados com sucesso", Alert.AlertType.INFORMATION);

            System.out.println(ex);

        } finally {
            ConnectionFactory.fecharConexao(con, stat);
        }
    }

    @SuppressWarnings("Unchecked")
    public List<Entidadecliente> ListaClientes() {
        List<Entidadecliente> cli = new ArrayList<>();
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            stat = con.prepareStatement("SELECT * from cliente1");
            rs = stat.executeQuery();

            while (rs.next()) {
                Entidadecliente c = new Entidadecliente();
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

        } catch (SQLException e) {
            Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
            alerta1.setTitle("C.M.D");
            alerta1.setHeaderText("C.M.D Informa!!!");
            alerta1.setContentText("Erro ao listar" + e);
            alerta1.showAndWait();
        } finally {
            ConnectionFactory.fecharConexao(con, stat, rs);
        }
        return cli;
    }

    public void Update(Endereco e) {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;

        try {
            
            
            sql = "UPDATE Endereco SET Logradouro = ?, Numero = ?, Complemento = ?, Cep = ?, Bairro = ?, Cidade = ?, Uf = ? WHERE CodEndereco = ? ";
            stat = con.prepareStatement(sql);
            
            stat.setString(1, e.getLogradouro());
            stat.setInt(2, e.getNumero());
            stat.setString(3, e.getComplemento());
            stat.setString(4, e.getCep());
            stat.setString(5, e.getBairro());
            stat.setString(6, e.getCidade());
            stat.setString(7, e.getUf());
            stat.setInt(8, e.getId());
            stat.executeUpdate();
            
            Mensagem_Alerta_Info("Dados alterados com sucesso", Alert.AlertType.INFORMATION);
            
        } catch (SQLException ex) {
            
            Mensagem_Alerta_Info("Dados não alterados com sucesso", Alert.AlertType.ERROR);
           
            System.out.println(ex);
            
        } finally {
            ConnectionFactory.fecharConexao(con, stat);
        }
    }

    private void Mensagem_Alerta_Info(String conteudo, Alert.AlertType ty) {
        Alert dialogo = new Alert(ty);
        dialogo.setTitle("C.M.D");
        dialogo.setHeaderText("C.M.D Informa!!!");
        dialogo.setContentText(conteudo + " \n");
        dialogo.showAndWait();
    }
}
