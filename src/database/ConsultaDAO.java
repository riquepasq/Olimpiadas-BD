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
public class ConsultaDAO {
    

    private Connection conn;
    public ConsultaDAO(){        
        conn = new Conexao().getConn();
    }
    
    public List<Consulta> getConsultas() throws SQLException {
        Statement st = null;
        ResultSet rs = null;  
        List<Consulta> consultas = new ArrayList<>();
        Consulta consulta;
        String query = "SELECT * FROM ATENDIMENTO_CONSULTA";
   
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
            while (rs.next()) {  
                consulta = convertRowToObject(rs);
                //System.out.println(number);
                consultas.add(consulta);
            }
            return consultas;
        }finally{
            if(st != null)
                st.close();
            if(rs != null)
                rs.close();
        }
        
    }
    private Consulta convertRowToObject(ResultSet rs)throws SQLException{
        Consulta r = new Consulta();
        String nroconsulta = rs.getString("NROCONSULTA"); 
        String atleta = rs.getString("ATLETA");    
        String medico = rs.getString("MEDICO");
        String data = rs.getString("DATA");
        r.setId(nroconsulta);
        r.setAtleta(atleta);
        r.setMedico(medico);
        r.setData(data);
        
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
            
            st.executeUpdate("UPDATE ROTINA SET REPETICAO = " + rep +
                    ", DESCRICAO = '" + descricao +
                    "' WHERE PREPARADOR = " + nroprep +
                    " AND DIASEMANA = '" + diaSemana +
                    "' AND ATLETA = " + nroatleta);
            return true;
        }finally{
            if(st != null)
                st.close();
        }
    }
   public boolean deletarRotina(String prep, String dia) throws SQLException{
       
       Statement st = null;
        ResultSet rs = null;
        //int rot = Integer.parseInt(rotina);
        try {
            st = conn.createStatement();
            
            st.executeUpdate("DELETE FROM ROTINA WHERE PREPARADOR = " + prep + " AND DIASEMANA = '" + dia + "'");
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
