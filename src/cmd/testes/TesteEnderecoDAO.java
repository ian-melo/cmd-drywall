/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.testes;

import Entidade.Endereco;
import cmd.DAO.EnderecoDAO;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TesteEnderecoDAO {

    public static void main(String[] args) {
        testar_busca(8);
        //testar_inserir();
        //testar_listar();
        //testar_update();
        //testar_deletar();
    }

    private static void testar_busca(int id) {
        EnderecoDAO eDAO = new EnderecoDAO();
        Endereco e = new Endereco();
        
        e.setId(id);
        e = eDAO.buscarId(e);
        System.out.println("+++++++++++++++++++++");
        System.out.println(e.getComplemento());
        System.out.println(e.getCidade());

    }

    private static void testar_inserir() {
        EnderecoDAO eDAO = new EnderecoDAO();
        Endereco e = new Endereco();

        e.setBairro("bairro5");
        e.setCep("555");
        e.setCidade("cidade5");
        e.setComplemento("Complemento5");
        e.setLogradouro("Logradouro5");
        e.setNumero(55);
        e.setUf("SP");

        eDAO.Inserir(e);
    }

    private static void testar_listar() {
        ArrayList<Endereco> enderecos = null;
        EnderecoDAO eDAO = new EnderecoDAO();

        enderecos = (ArrayList<Endereco>) eDAO.ListaEnderecos();

        for (Endereco o : enderecos) {
            //Exibição do Endereços
            System.out.println("-----------------");
            System.out.println(o.getId());
            System.out.println(o.getLogradouro());
            System.out.println(o.getComplemento());
            System.out.println(o.getCep());
            System.out.println(o.getNumero());
            System.out.println(o.getBairro());
            System.out.println(o.getCidade());
            System.out.println(o.getUf());
        }

    }

    private static void testar_update() {
        EnderecoDAO eDAO = new EnderecoDAO();
        Endereco e = new Endereco();
        e.setId(5);

        e.setBairro("_bairro5");
        e.setCep("555");
        e.setCidade("_cidade5");
        e.setComplemento("_Complemento5");
        e.setLogradouro("_Logradouro5");
        e.setNumero(33);
        e.setUf("SP");
        eDAO.Update(e);
    }

    private static void testar_deletar() {
        EnderecoDAO eDAO = new EnderecoDAO();
        Endereco e = new Endereco();
        e.setId(6);

        eDAO.Deletar(e);
    }

}
