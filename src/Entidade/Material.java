/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author fe_mm
 */
public class Material 
{
    private int Id;
    private String Nome;
    private int Quantidade;
    private float Preço;
    private String Tipo;
    private String Unidade;
    private int cod_construl;
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getPreço() {
        return Preço;
    }

    public void setPreço(float Preço) {
        this.Preço = Preço;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getUnidade() {
        return Unidade;
    }

    public void setUnidade(String Unidade) {
        this.Unidade = Unidade;
    }

    public int getCod_construl() {
        return cod_construl;
    }

    public void setCod_construl(int cod_construl) {
        this.cod_construl = cod_construl;
    }
    
}
