/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Henrique
 */
public class Atleta {
    private String id;
    private String situacao;
    private String passaporte;
    private String sexo;
    private String peso;
    private String altura;
    private String data;
    private String preparador;
    private String nacao;
    private String modalidade;

    public void setId(String id) {
        this.id = id;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }   
    public void setPeso(String peso){
        this.peso = peso;
    }  
    public void setAltura(String altura){
        this.altura = altura;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setPreparador(String preparador) {
        this.preparador = preparador;
    }
    public void setNacao(String nacao) {
        this.nacao = nacao;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    public String getId() {
        return id;
    }    
    public String getSituacao() {
        return situacao;
    }
    public String getPassaporte() {
        return passaporte;
    }
    public String getSexo() {
        return sexo;
    }
    public String getPeso() {
        return peso;
    }
    public String getAltura() {
        return altura;
    }
    public String getData() {
        return data;
    }
    public String getPreparador() {
        return preparador;
    }
    public String getNacao() {
        return nacao;
    }
    public String getModalidade() {
        return modalidade;
    }
}
