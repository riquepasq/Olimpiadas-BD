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
public class PreparadorDAO {
    

    private Connection conn;
    public PreparadorDAO(){        
        conn = new Conexao().getConn();
    }
    public List<Participante> getAllPreparador() throws SQLException{
        List<Participante> list = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;   
        String query = "SELECT * FROM PARTICIPANTE WHERE TIPO = 'preparador'";
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
    
    public boolean inserirPreparador(String nome, String email, String senha, String cidade, String estado, String data, String sexo, String tipoid, String identidade) throws SQLException{
        Statement st = null;
        ResultSet rs = null;
        int ID = getLastId();
        try {
            st = conn.createStatement();
            
            if (tipoid.equals("brasileiro")) {
                st.executeUpdate("INSERT INTO PREPARADOR(NroPreparador, Email, Senha, Cidade, Estado, Data_Nasc, Sexo, TipoIdent, CPF, Equipe) VALUES("
                        + (ID+1) + ",'"
                        + email + "','"
                        + senha + "','"
                        + cidade + "','"
                        + estado + "',TO_DATE('"
                        + data + "','dd/mm/yyyy'),'"
                        + sexo + "','"
                        + "bra','"
                        + identidade + "')");
            }
            else if (tipoid.equals("estrangeiro")) {
                st.executeUpdate("INSERT INTO PREPARADOR(NroPreparador, Email, Senha, Cidade, Estado, Data_Nasc, Sexo, TipoIdent, Passaporte) VALUES("
                        + (ID+1) + ",'"
                        + email + "','"
                        + senha + "','"
                        + cidade + "','"
                        + estado + "',TO_DATE('"
                        + data + "','dd/mm/yyyy'),'"
                        + sexo + "','"
                        + "est','"
                        + identidade + "')");
            }
            st.executeUpdate("INSERT INTO PARTICIPANTE (NroPar, Nome, Tipo) VALUES("
                    + (ID+1) + ",'"
                    + nome + "','"
                    + "preparador')");
            return true;
        }finally{
            if(st != null)
                st.close();
        }
    }
    
    public boolean alterarPreparador(String nome, String email, String senha, String cidade, String data, String sexo, String tipoid, String identidade, String equipe) throws SQLException{
        Statement st = null;
        ResultSet rs = null;
        int nropar = -1;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT NROPAR FROM PARTICIPANTE WHERE NOME = '" + nome + "'");
            
            while (rs.next()) {
                nropar = rs.getInt("NROPAR");
            }
           
            if (tipoid.equals("brasileiro")) {
                st.executeUpdate("UPDATE PREPARADOR SET Email = '" + email + "',"
                                   + "Senha = '" + senha + "',"
                                   + "Cidade = '" + cidade + "',"
                                   + "Data_Nasc = TO_DATE('" + data + "', 'yyyy/mm/dd'),"
                                   + "Sexo = '" + sexo + "',"
                                   + "TipoId = '" + tipoid + "',"
                                   + "CPF = '" + identidade + "',"
                                   + "Equipe = " + equipe + "WHERE NroPreparador = " + nropar);
            }
            else if (tipoid.equals("estrangeiro")) {
                st.executeUpdate("UPDATE PREPARADOR SET Email = '" + email + "',"
                                   + "Senha = '" + senha + "',"
                                   + "Cidade = '" + cidade + "',"
                                   + "Data_Nasc = TO_DATE('" + data + "', 'yyyy/mm/dd'),"
                                   + "Sexo = '" + sexo + "',"
                                   + "TipoId = '" + tipoid + "',"
                                   + "Passaporte = '" + identidade + "',"
                                   + "Equipe = " + equipe + "WHERE NroPreparador = " + nropar);
            }
            st.executeUpdate("UPDATE PARTICIPANTE SET NOME = '" + nome + "' WHERE NROPAR = " + nropar);
            return true;
        }finally{
            if(st != null)
                st.close();
        } 
    }
    
    public int getLastId() throws SQLException {
        Statement st = null;
        ResultSet rs = null;
        String query = "SELECT COUNT(*) FROM PARTICIPANTE";
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
}
