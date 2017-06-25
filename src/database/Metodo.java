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
public class Metodo {
    private int id;
    private int diagnostico;
    private String descricao;
    private String efetividade;

    public void setId(int id) {
        this.id = id;
    }
    public void setDiagnostico(int diagnostico) {
        this.diagnostico = diagnostico;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setEfetividade(String efetividade){
        this.efetividade = efetividade;
    }  

    public int getId() {
        return id;
    }    
    public int getDiagnostico() {
        return diagnostico;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getEfetividade() {
        return efetividade;
    }
}
