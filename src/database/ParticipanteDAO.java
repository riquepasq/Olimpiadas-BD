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
public class ParticipanteDAO {
    

    private Connection conn;
    public ParticipanteDAO(){        
        conn = new Conexao().getConn();
    }
    

}
