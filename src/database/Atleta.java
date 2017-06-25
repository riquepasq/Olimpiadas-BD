/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.List;

/**
 *
 * @author Henrique
 */
public class Atleta {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cidade;
    private String estado;
    private String data;
    private String sexo;
    private String tipoid;
    private String CPF;
    private String passaporte;

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }   
    public void setCidade(String cidade){
        this.cidade = cidade;
    }  
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setTipoIdent(String tipoid) {
        this.tipoid = tipoid;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
    
    public int getId() {
        return id;
    }    
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getData() {
        return data;
    }
    public String getSexo() {
        return sexo;
    }
    public String getTipoIdent() {
        return tipoid;
    }
    public String getCPF() {
        return CPF;
    }
    public String getPassaporte() {
        return passaporte;
    }
}
