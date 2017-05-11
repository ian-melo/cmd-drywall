/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela_cadastro_materiais;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author fe_mm
 */
public class MaterialTable 
{
    private SimpleIntegerProperty Id;
    private SimpleStringProperty Nome;
    private SimpleIntegerProperty quantidade;
    private SimpleFloatProperty preço;
    
    public Integer getId() {
        return Id.getValue();
    }

    public String getNome() {
        return Nome.getValue();
    }

    public Integer getQuantidade() {
        return quantidade.getValue();
    }

    public Float getPreço() {
        return preço.getValue();
    }

    public MaterialTable(int Id, String Nome, int quantidade, float preço) {
        this.Id = new SimpleIntegerProperty(Id);
        this.Nome = new SimpleStringProperty(Nome);
        this.quantidade = new SimpleIntegerProperty(quantidade);
        this.preço = new SimpleFloatProperty(preço);
    }    
}
