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
 * @author Henrique
 */
public class AtletaDAO {
    

    private Connection conn;
    public AtletaDAO(){        
        conn = new Conexao().getConn();
    }
    public List<Participante> getAtletas(String preparador) throws SQLException{
        List<Participante> list = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;   
        String query = "SELECT P.* FROM ATLETA A JOIN PARTICIPANTE P ON A.NROATLETA = P.NROPAR WHERE A.PREPARADOR = " + preparador;
        Participante p;   
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
    private Participante convertRowToObject(ResultSet rs)throws SQLException{
        Participante p = new Participante();
        String nropar = rs.getString("NROPAR"); 
        String nome = rs.getString("NOME");    
        String tipo = rs.getString("TIPO");
        p.setId(nropar);
        p.setNome(nome);
        p.setTipo(tipo);
        return p;
    }
    public void closeConn() throws SQLException {
        conn.close();
    }
}
