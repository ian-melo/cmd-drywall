/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author Usuario
 */
public class PessoaJuridica {

    private int id;
    private String Cnpj;
    private String RazaoSocial;
    private String RamoAtuacao;
    private String DataFundacao;
    //private int protocolo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getRamoAtuacao() {
        return RamoAtuacao;
    }

    public void setRamoAtuacao(String RamoAtuacao) {
        this.RamoAtuacao = RamoAtuacao;
    }

    public String getDataFundacao() {
        return DataFundacao;
    }

    public void setDataFundacao(String DataFundacao) {
        this.DataFundacao = DataFundacao;
    }

}
