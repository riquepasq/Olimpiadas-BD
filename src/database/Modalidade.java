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
public class Modalidade {
    private String id;
    private String nome;
    private String descricao;

    public void setId(String id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getId() {
        return id;
    }    
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
}
