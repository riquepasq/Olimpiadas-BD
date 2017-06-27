/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.net.URL;

/**
 *
 * @author Henrique
 */
public class Nacao {
    private String id;
    private String nome;
    private String continente;
    private int numatletas;
    private String esporte;
    private URL bandeira;
    private String hino;

    public void setId(String id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setContinente(String continente) {
        this.continente = continente;
    }
    public void setNumAtletas(int numatletas) {
        this.numatletas = numatletas;
    }   
    public void setEsporte(String esporte){
        this.esporte = esporte;
    }  
    public void setBandeira(URL bandeira) {
        this.bandeira = bandeira;
    }
    public void setHino(String hino) {
        this.hino = hino;
    }
    
    public String getId() {
        return id;
    }    
    public String getNome() {
        return nome;
    }
    public String getContinente() {
        return continente;
    }
    public int getNumAtletas() {
        return numatletas;
    }
    public String getEsporte() {
        return esporte;
    }
    public URL getBandeira() {
        return bandeira;
    }
    public String getHino() {
        return hino;
    }
}
