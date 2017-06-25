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
public class Rotina {
    private String id;
    private String preparador;
    private String diaSemana;
    private int repeticao;
    private String descricao;
    private String atleta;

    public void setId(String id) {
        this.id = id;
    }
    public void setPreparador(String preparador) {
        this.preparador = preparador;
    }
    public void setdiaSemana(String diaSemana){
        this.diaSemana = diaSemana;
    }
    public void setRepeticao(int repeticao){
        this.repeticao = repeticao;
    }  
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setAtleta(String atleta){
        this.atleta = atleta;
    }  
    public String getId() {
        return id;
    }    
    public String getPreparador() {
        return preparador;
    }
    public String getdiaSemana() {
        return diaSemana;
    }
    public int getRepeticao() {
        return repeticao;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getAtleta() {
        return atleta;
    }
}
