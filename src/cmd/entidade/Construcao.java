package cmd.entidade;
// Generated 23/05/2017 06:48:11 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Construcao generated by hbm2java
 */
public class Construcao implements java.io.Serializable {

    private Integer codConstrucao;//BD

    private String descricao;
    private String detalhes;
    private Integer qualidade;
    
    //private Set items = new HashSet(0);//?????????
    private Set<Material> materials = new HashSet(0);
    private Forro forro;
    private Parede parede;

    private Boolean xdead;//BD

    public Construcao() {
    }

    //public Construcao(String descricao, String detalhes, Integer qualidade, Boolean xdead, Set items, Forro forro, Set materials, Parede parede) {
    public Construcao(String descricao, String detalhes, Integer qualidade, Boolean xdead, Forro forro, Set materials, Parede parede) {
        this.descricao = descricao;
        this.detalhes = detalhes;
        this.qualidade = qualidade;
        this.xdead = xdead;
        //this.items = items;
        this.forro = forro;
        this.materials = materials;
        this.parede = parede;
    }

    public Integer getCodConstrucao() {
        return this.codConstrucao;
    }

    public void setCodConstrucao(Integer codConstrucao) {
        this.codConstrucao = codConstrucao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDetalhes() {
        return this.detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public Integer getQualidade() {
        return this.qualidade;
    }

    public void setQualidade(Integer qualidade) {
        this.qualidade = qualidade;
    }

    public Boolean getXdead() {
        return this.xdead;
    }

    public void setXdead(Boolean xdead) {
        this.xdead = xdead;
    }

//    public Set getItems() {
//        return this.items;
//    }
//
//    public void setItems(Set items) {
//        this.items = items;
//    }

    public Forro getForro() {
        return this.forro;
    }

    public void setForro(Forro forro) {
        this.forro = forro;
    }

    public Set getMaterials() {
        return this.materials;
    }

    public void setMaterials(Set materials) {
        this.materials = materials;
    }

    public Parede getParede() {
        return this.parede;
    }

    public void setParede(Parede parede) {
        this.parede = parede;
    }

}
