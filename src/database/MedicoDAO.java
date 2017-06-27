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
public class MedicoDAO {
    

    private Connection conn;
    public MedicoDAO(){        
        conn = new Conexao().getConn();
    }
    public List<Medico> getMedicos() throws SQLException{
        List<Medico> list = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;   
        String query = "SELECT * FROM MEDICO";
        Medico p;   
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
    private Medico convertRowToObject(ResultSet rs)throws SQLException{
        Medico p = new Medico();
        String nromed = rs.getString("NROMEDICO"); 
        String CRM = rs.getString("CRM");
        String endereco = rs.getString("ENDERECO");
        p.setId(nromed);
        p.setCRM(CRM);
        p.setEndereco(endereco);

        return p;
    }
    public void closeConn() throws SQLException {
        conn.close();
    }
}
