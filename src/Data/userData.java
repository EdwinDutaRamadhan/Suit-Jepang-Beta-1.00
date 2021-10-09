/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import Connection.userConnection;
import Controller.userInterface;
import Model.userModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class userData implements userInterface{
    userModel player;
    private Connection koneksi = null;
    
    public userData() {
        this.koneksi = new userConnection().getConnection();
    }


    @Override
    public boolean saveUserHistory(userModel player) {
    boolean result = false;
        try{
            PreparedStatement ps = koneksi.prepareStatement("INSERT INTO db_userhistory"
            + " VALUES (?,?,?,?)");
            ps.setString(1, player.getMatch());
            ps.setString(2, player.getHasil());
            ps.setString(3, player.getAddPoint());
            ps.setString(4, player.getPointSementara());
            ps.executeUpdate();
            result = true;
        }catch(SQLException e){
            System.out.println("Save User Error \n" +e.getMessage());
        }
        return result;
    }

    @Override
    public boolean deleteUserHistory(userModel player) {
        boolean result = false;
        try{
            PreparedStatement ps = koneksi.prepareStatement("DELETE FROM `db_userhistory` WHERE `db_userhistory`.`MATCH` = ?;");
            ps.setString(1, player.getMatch());
            ps.executeUpdate();
            result = true;
        }catch(SQLException e){
            System.out.println("Delete Error\n" +e.getMessage());
        }
        
        return result;
    }

    @Override
    public List<userModel> getAll() {
        List<userModel> ls = new ArrayList<>();
        
        try {
            PreparedStatement ps = koneksi.prepareStatement("SELECT * FROM db_userhistory");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                player = new userModel();
                player.setMatch(rs.getString(1));
                player.setHasil(rs.getString(2));
                player.setAddPoint(rs.getString(3));
                player.setPointSementara(rs.getString(4));
                ls.add(player); 
            }
        } catch (Exception e) {
            System.out.println("Show Result Error :"+e.getMessage());
        }
        return ls;
    }

}
