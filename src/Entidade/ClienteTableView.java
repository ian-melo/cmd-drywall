/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author fe_mm
 */
public class ClienteTableView 
{
    private SimpleIntegerProperty Id;
    private SimpleStringProperty Nome;
    private SimpleStringProperty Endereço;
    private SimpleStringProperty Cpf;
    private SimpleStringProperty Projeto;
    private SimpleIntegerProperty Protocolo;
    private SimpleStringProperty Telefone;
    private SimpleStringProperty Email;

    public ClienteTableView(int id, String nome, String cpf, String endereço, String projeto, int protocolo, String telefone, String email)
    {
        this.Id = new SimpleIntegerProperty(id);
        this.Nome = new SimpleStringProperty(nome);
        this.Cpf = new SimpleStringProperty(cpf);
        this.Endereço = new SimpleStringProperty(endereço);
        this.Projeto = new SimpleStringProperty(projeto);
        this.Protocolo = new SimpleIntegerProperty(protocolo);
        this.Telefone = new SimpleStringProperty(telefone);
        this.Email = new SimpleStringProperty(email);
    }
    
    public Integer getId()
    {
        return this.Id.getValue();
    }
    public String getNome()
    {
        return this.Nome.getValue();
    }
    public String getCpf()
    {
        return this.Cpf.getValue();
    }
    public String getEndereço()
    {
        return this.Endereço.getValue();
    }
    public String getProjeto()
    {
        return this.Projeto.getValue();
    }
    public Integer getProtocolo()
    {
        return this.Protocolo.getValue();
    }
    public String getTelefone()
    {
        return this.Telefone.getValue();
    }
    public String getEmail()
    {
        return this.Email.getValue();
    }
    
    
}
