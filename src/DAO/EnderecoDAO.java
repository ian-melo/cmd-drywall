/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidade.Endereco;
import cmd.conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EnderecoDAO {

    private String sql;

    public void Inserir(Endereco e) {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;

        try {

            sql = "INSERT INTO Endereco VALUES(NULL,?,?,?,?,?,?,?,FALSE)";
            stat = con.prepareStatement(sql);

            stat.setString(1, e.getLogradouro());
            stat.setInt(2, e.getNumero());
            stat.setString(3, e.getComplemento());
            stat.setString(4, e.getCep());
            stat.setString(5, e.getBairro());
            stat.setString(6, e.getCidade());
            stat.setString(7, e.getUf());

            stat.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso \n");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Dados não cadastrados com sucesso");
            //Mensagem_Alerta("Dados não cadastrados com sucesso");
            System.out.println("Erro: " + ex);

        } finally {
            ConnectionFactory.fecharConexao(con, stat);
        }
    }

    @SuppressWarnings("Unchecked")
    public List<Endereco> ListaEnderecos() {
        List<Endereco> es = new ArrayList<>();
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            stat = con.prepareStatement("SELECT * from Endereco WHERE XDEAD = 0");
            rs = stat.executeQuery();

            while (rs.next()) {
                Endereco e = new Endereco();
                e.setId(rs.getInt("CodEndereco"));
                e.setLogradouro(rs.getString("Logradouro"));
                e.setNumero(rs.getInt("Numero"));
                e.setComplemento(rs.getString("Complemento"));
                e.setCep(rs.getString("Cep"));
                e.setBairro(rs.getString("Bairro"));
                e.setCidade(rs.getString("Cidade"));
                e.setUf(rs.getString("Uf"));

                es.add(e);
            }

        } catch (SQLException ex) {
            /*
             Alert alerta1 = new Alert(Alert.AlertType.INFORMATION);
             alerta1.setTitle("C.M.D");
             alerta1.setHeaderText("C.M.D Informa!!!");
             alerta1.setContentText("Erro ao listar" + ex);
             alerta1.showAndWait();
             */
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.fecharConexao(con, stat, rs);
        }
        return es;
    }

    public void Update(Endereco e) {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;

        try {

            sql = "UPDATE Endereco SET Logradouro = ?, Numero = ?, Complemento = ?, Cep = ?, Bairro = ?, Cidade = ?, Uf = ? WHERE CodEndereco = ? AND XDEAD = 0";
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

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            //Mensagem_Alerta_Info("Dados alterados com sucesso");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Dados não alterados com sucesso");
            //Mensagem_Alerta_Info("Dados não alterados com sucesso");

            System.out.println(ex);

        } finally {
            ConnectionFactory.fecharConexao(con, stat);
        }
    }

    public void Deletar(Endereco e) {
        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;

        try {

            sql = "UPDATE Endereco SET XDEAD = 1 WHERE CodEndereco = ? AND XDEAD = 0";
            stat = con.prepareStatement(sql);

            stat.setInt(1, e.getId());

            stat.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dado apagado com sucesso");
            //Mensagem_Alerta_Info("Dados alterados com sucesso");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Dado não apagado");
            //Mensagem_Alerta_Info("Dados não alterados com sucesso");

            System.out.println(ex);

        } finally {
            ConnectionFactory.fecharConexao(con, stat);
        }
    }

    public Endereco buscarId(Endereco e) {

        Connection con = ConnectionFactory.getConexao();
        PreparedStatement stat = null;

        try {
            sql = "SELECT * FROM Endereco WHERE CodEndereco=? AND XDEAD=0";
            stat = con.prepareStatement(sql);

            stat.setInt(1, e.getId());

            ResultSet rs;

            rs = stat.executeQuery();

            Endereco end = new Endereco();
            if (rs.next()) {
                end = new Endereco();

                end.setLogradouro(rs.getString("Logradouro"));
                end.setNumero(rs.getInt("Numero"));
                end.setComplemento(rs.getString("Complemento"));
                end.setCep(rs.getString("Cep"));
                end.setBairro(rs.getString("Bairro"));
                end.setCidade(rs.getString("Cidade"));
                end.setUf(rs.getString("Uf"));

            }
            if (end == null) {
                ConnectionFactory.fecharConexao(con, stat);
            }
            
            return end;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Dado não encontrado");
            //Mensagem_Alerta("Dados não cadastrados com sucesso");
            System.out.println("Erro: " + ex);

        } finally {
            ConnectionFactory.fecharConexao(con, stat);
        }
        return null;
    }

    private void Mensagem_Alerta(String conteudo) {
        Alert dialogo = new Alert(Alert.AlertType.INFORMATION);
        dialogo.setTitle("C.M.D");
        dialogo.setHeaderText("C.M.D Informa!!!");
        dialogo.setContentText(conteudo + " \n");
        dialogo.showAndWait();
    }

    private void Mensagem_Alerta_Info(String conteudo) {
        Alert dialogo = new Alert(Alert.AlertType.INFORMATION);
        dialogo.setTitle("C.M.D");
        dialogo.setHeaderText("C.M.D Informa!!!");
        dialogo.setContentText(conteudo);
        dialogo.showAndWait();
    }

}
