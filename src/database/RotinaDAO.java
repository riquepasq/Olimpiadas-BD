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
public class RotinaDAO {
    

    private Connection conn;
    public RotinaDAO(){        
        conn = new Conexao().getConn();
    }
    public List<Rotina> getRotinas() throws SQLException {
        Statement st = null;
        ResultSet rs = null;  
        List<Rotina> rotinas = new ArrayList<>();
        Rotina rotina;
        String query = "SELECT * FROM ROTINA";
   
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
            while (rs.next()) {  
                rotina = convertRowToObject(rs);
                //System.out.println(number);
                rotinas.add(rotina);
            }
            return rotinas;
        }finally{
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
        
    }
    private Rotina convertRowToObject(ResultSet rs)throws SQLException{
        Rotina r = new Rotina();
        String nrorotina = rs.getString("NROROTINA"); 
        String preparador = rs.getString("PREPARADOR");    
        String diaSemana = rs.getString("DIASEMANA");
        int repeticao = rs.getInt("REPETICAO");
        String descricao = rs.getString("DESCRICAO");
        String atleta = rs.getString("ATLETA");
        r.setId(nrorotina);
        r.setPreparador(preparador);
        r.setdiaSemana(diaSemana);
        r.setRepeticao(repeticao);
        r.setDescricao(descricao);
        r.setAtleta(atleta);
        
        return r;
    }
    public boolean inserirRotina(String preparador, String diaSemana, String repeticao, String descricao, String atleta) throws SQLException{
        Statement st = null;
        ResultSet rs = null;
        int ID = getLastId();
        int rep = Integer.parseInt(repeticao);
        int nroprep = Integer.parseInt(preparador);
        int nroatleta = Integer.parseInt(atleta);
        try {
            st = conn.createStatement();
            
            st.executeUpdate("INSERT INTO ROTINA(NroRotina, Preparador, diaSemana, Repeticao, Descricao, Atleta) VALUES("
                    + (ID+1) + ","
                    + nroprep + ",'"
                    + diaSemana + "',"
                    + rep + ",'"
                    + descricao + "',"
                    + nroatleta + ")");
            return true;
        }finally{
            if(st != null)
                st.close();
        }
    }
    
   public boolean alterarRotina(String preparador, String diaSemana, String repeticao, String descricao, String atleta) throws SQLException{
        Statement st = null;
        ResultSet rs = null;
        int rep = Integer.parseInt(repeticao);
        int nroprep = Integer.parseInt(preparador);
        int nroatleta = Integer.parseInt(atleta);
        try {
            st = conn.createStatement();
            
            st.executeUpdate("UPDATE ROTINA SET PREPARADOR = " + nroprep + 
                    ", DIASEMANA = '" + diaSemana +
                    "', REPETICAO = " + rep +
                    ", DESCRICAO = '" + descricao +
                    "', ATLETA = " + nroatleta);
            return true;
        }finally{
            if(st != null)
                st.close();
        }
    }
   public boolean deletarRotina(String rotina) throws SQLException{
       
       Statement st = null;
        ResultSet rs = null;
        int rot = Integer.parseInt(rotina);
        try {
            st = conn.createStatement();
            
            st.executeUpdate("DELETE FROM ROTINA WHERE NROROTINA = " + rot);
            return true;
        }finally{
            if(st != null)
                st.close();
        }
    }
   public void commitTransaction() throws SQLException {
       Statement st = null;
       ResultSet rs = null;
       String query = "COMMIT";
       try {
            st = conn.createStatement();
            rs = st.executeQuery(query);         
        }finally{
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
   } 
   
    public int getLastId() throws SQLException {
        Statement st = null;
        ResultSet rs = null;
        String query = "SELECT COUNT(*) FROM ROTINA";
        int number=-1;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
            while (rs.next()) {  
                number = rs.getInt("COUNT(*)");
                System.out.println(number);
            }
            return number;
        }finally{
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
    }
    public void closeConn() throws SQLException {
        conn.close();
    }
}
