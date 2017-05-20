/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Clientes.Endereco;
import DAO.EnderecoDAO;

/**
 *
 * @author Usuario
 */
public class TesteEnderecoDAO {
    
    public static void main(String[] args) {
        EnderecoDAO eDAO = new EnderecoDAO();
        Endereco e = new Endereco();
        
        e.setBairro("bairro");
        e.setCep("2222");
        e.setCidade("cidade");
        e.setComplemento("Complemento");
        e.setLogradouro("Logradouro");
        e.setNumero(90);
        e.setUf("SP");
        
        eDAO.Create(e);
    }
    
}
