/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

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
public class ModalidadeDAO {
    

    private Connection conn;
    public ModalidadeDAO(){        
        conn = new Conexao().getConn();
    }
    public List<Modalidade> getModalidades() throws SQLException {
        Statement st = null;
        ResultSet rs = null;  
        List<Modalidade> modalidades = new ArrayList<>();
        Modalidade modalidade;
        String query = "SELECT * FROM MODALIDADE";
   
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
            while (rs.next()) {  
                modalidade = convertRowToObject(rs);
                modalidades.add(modalidade);
            }
            return modalidades;
        }finally{
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
        
    }
    private Modalidade convertRowToObject(ResultSet rs)throws SQLException{
        Modalidade r = new Modalidade();
        String nromodalidade = rs.getString("NROMODALIDADE"); 
        String nome = rs.getString("NOME");    
        String descricao = rs.getString("DESCRICAO");
        r.setId(nromodalidade);
        r.setNome(nome);
        r.setDescricao(descricao);
        
        return r;
    }
    public void closeConn() throws SQLException {
        conn.close();
    }
}
