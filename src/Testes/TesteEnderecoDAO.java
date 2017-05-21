/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Clientes.Endereco;
import DAO.EnderecoDAO;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TesteEnderecoDAO {

    public static void main(String[] args) {
        ArrayList<Endereco> enderecos = null;

        EnderecoDAO eDAO = new EnderecoDAO();
        Endereco e = new Endereco();

        e.setBairro("bairro2");
        e.setCep("4444");
        e.setCidade("cidade2");
        e.setComplemento("Complemento2");
        e.setLogradouro("Logradouro2");
        e.setNumero(22);
        e.setUf("SP");

        //eDAO.Inserir(e);
        enderecos = (ArrayList<Endereco>) eDAO.ListaEnderecos();

        for (Endereco x : enderecos) {
            //Exibição do Endereços
            System.out.println("-----------------");
            System.out.println(x.getId());
            System.out.println(x.getLogradouro());
            System.out.println(x.getComplemento());
            System.out.println(x.getCep());
            System.out.println(x.getNumero());
            System.out.println(x.getBairro());
            System.out.println(x.getCidade());
            System.out.println(x.getUf());
        }
    }

}
