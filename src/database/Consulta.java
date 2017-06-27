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
public class Consulta {
    private String id;
    private String atleta;
    private String medico;
    private String data;

    public void setId(String id) {
        this.id = id;
    }
    public void setAtleta(String atleta){
        this.atleta = atleta;
    }  
    public void setMedico(String medico) {
        this.medico = medico;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getId() {
        return id;
    }    
    public String getAtleta() {
        return atleta;
    }
    public String getMedico() {
        return medico;
    }
    public String getData() {
        return data;
    }
}
