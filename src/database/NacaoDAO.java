/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class NacaoDAO {
    

    private Connection conn;
    public NacaoDAO(){        
        conn = new Conexao().getConn();
    }
public List<Nacao> getNacao() throws SQLException{
        List<Nacao> list = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;   
        String query = "SELECT * FROM NACAO";
        Nacao p;   
        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);

            while(rs.next()){
                p = convertRowToObject(rs);
                list.add(p);  
            }
            return list;
        }finally{
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
    } 
    private Nacao convertRowToObject(ResultSet rs)throws SQLException{
        Nacao p = new Nacao();
        String nronacao = rs.getString("NRONACAO"); 
        String nome = rs.getString("NOME");
        String continente = rs.getString("CONTINENTE");
        int numatletas = rs.getInt("NUMATLETAS");
        String esporte = rs.getString("ESPORTE");
        URL bandeira = rs.getURL("BANDEIRA");
        String hino = rs.getString("HINO");
        p.setId(nronacao);
        p.setNome(nome);
        p.setContinente(continente);
        p.setNumAtletas(numatletas);
        p.setEsporte(esporte);
        p.setBandeira(bandeira);
        p.setHino(hino);

        return p;
    }
    public void closeConn() throws SQLException {
        conn.close();
    }
}
