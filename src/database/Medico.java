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
public class Medico {
    private String id;
    private String CRM;
    private String endereco;


    public void setId(String id) {
        this.id = id;
    }
    public void setCRM(String CRM) {
        this.CRM = CRM;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getId() {
        return id;
    }    
    public String getCRM() {
        return CRM;
    }
    public String getEndereco() {
        return endereco;
    }
}
