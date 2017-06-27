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
    public List<Atleta> getAtletas() throws SQLException{
        List<Atleta> list = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;   
        String query = "SELECT * FROM ATLETA";
        Atleta p;   
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
    private Atleta convertRowToObject(ResultSet rs)throws SQLException{
        Atleta p = new Atleta();
        String nroatle = rs.getString("NROATLETA"); 
        String situacao = rs.getString("SITUACAO");
        String passaporte = rs.getString("PASSAPORTE");
        String sexo = rs.getString("SEXO");
        String peso = rs.getString("PESO");
        String altura = rs.getString("ALTURA");
        String data = rs.getString("DATA_NASC");
        String preparador = rs.getString("PREPARADOR");
        String nacao = rs.getString("NACAO");
        String modalidade = rs.getString("MODALIDADE");
        p.setId(nroatle);
        p.setSituacao(situacao);
        p.setPassaporte(passaporte);
        p.setSexo(sexo);
        p.setPeso(peso);
        p.setAltura(altura);
        p.setData(data);
        p.setPreparador(preparador);
        p.setNacao(nacao);
        p.setModalidade(modalidade);
        return p;
    }
    public void closeConn() throws SQLException {
        conn.close();
    }
}
