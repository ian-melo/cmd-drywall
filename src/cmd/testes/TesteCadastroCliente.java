/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd.testes;

import cmd.entidade.Cliente;
import cmd.entidade.Endereco;
import cmd.entidade.PessoaJuridica;
import cmd.entidade.Telefone;
import cmd.entidade.TelefoneId;
import cmd.novo.controle.CadastroClientesControle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TesteCadastroCliente {

    public static void main(String[] args) {
        TesteCadastro();
    }

    public static void TesteCadastro() {

        CadastroClientesControle cadCliC = new CadastroClientesControle();
         cadCliC = new CadastroClientesControle();
        Cliente cli = new Cliente();
        Endereco end = new Endereco();
        PessoaJuridica pJur = new PessoaJuridica();
        Telefone tel = new Telefone();
        TelefoneId telId = new TelefoneId();

        end.setCodEndereco(2);
        end.setBairro("Bairro_Teste");
        end.setCep("04233-010");
        end.setCidade("Cidade_Teste");
        end.setComplemento("Complemento_Teste");
        end.setLogradouro("Logradouro_Teste");
        end.setNumero("10");
        end.setUf("TT");
        end.setXdead(false);
       
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataDate = new Date();
        String dS = "11/01/2002";
        try {
            dataDate = formato.parse(dS);
            System.out.println(dataDate);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        
// 78.846.292/0001-75
// 52.852.698/0001-77
// 79.664.724/0001-90
        pJur.setCnpj("78.846.292/0001-75");
        pJur.setDataFundacao(dataDate);
        pJur.setRamoAtuacao("Ramo Atuacao");
        pJur.setRazaoSocial("RazaoSocial");
        pJur.setXdead(false);

        telId.setNumero("(11)9898-0909");
        tel.setId(telId);

        
        cli.setCodCliente(null);
        cli.setOrcamentos(null);
        cli.setDataInscricao(dataDate);
        cli.setEndereco(end);
        cli.setPessoaJuridica(pJur);
        cli.setTelefones(null);//Quando for verificar o pq não esta cadastrando mais tel no BD começar por AQUI é um vetor
        cli.setXdead(true);

        
        if (cadCliC.inserir(cli) == true) {
            JOptionPane.showMessageDialog(null, "Cadastrado");

        }
        
        if (cadCliC.inserir(cli) == true) {
            JOptionPane.showMessageDialog(null, "Cadastrado");

        }
    }
}
