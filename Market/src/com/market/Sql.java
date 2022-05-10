/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.market;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Sql {
    
    protected Connection connect() {

        String url = "jdbc:sqlite:db.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public void A101 (String isAd, String tesvir, String izzah, String tarix, int x, String isibasladan){
        String sql = "INSERT INTO is1(ad, tesvir, izzah, basla, xususiyyet, isibasladan) VALUES (?,?,?,?,?,?)";
        
        try(Connection conn = this.connect();
                PreparedStatement pr = conn.prepareStatement(sql)){
            pr.setString(1, isAd);
            pr.setString(2, tesvir);
            pr.setString(3, izzah);
            pr.setString(4, tarix);
            pr.setInt(5, x);
            pr.setString(6, isibasladan);
            
            pr.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void is2 (String id2, String id3, String is1, String user, String sira, String veziyyet, String teyinEden){
        String sql = "INSERT INTO is2(id2, id3, is1, user, sira, veziyyet, teyinEden) VALUES (?,?,?,?,?,?,?)";
        
        try(Connection conn = this.connect();
                PreparedStatement pr = conn.prepareStatement(sql)){
            pr.setString(1, id2);
            pr.setString(2, id3);
            pr.setString(3, is1);
            pr.setString(4, user);
            pr.setString(5, sira);
            pr.setString(6, veziyyet);
            pr.setString(7, teyinEden);
            
            pr.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void A103Update(String idal, String is1, String terif, String izzah)
    {
        String sql = "UPDATE is1 SET ad=?, tesvir=?, izzah=? where id=?";
        try(Connection conn = this.connect();
                PreparedStatement pr = conn.prepareStatement(sql))
        {
            pr.setString(1, is1);
            pr.setString(2, terif);
            pr.setString(3, izzah);
            pr.setString(4, idal);
            
            pr.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void A104Update(String id, String sira)
    {
        String sql = "UPDATE is2 SET sira=? where id=?";
        try(Connection conn = this.connect();
                PreparedStatement pr = conn.prepareStatement(sql))
        {
            pr.setString(1, sira);
            pr.setString(2, id);
            
            pr.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void A105Update(String id, String basla, int xususiyyet)
    {
        String sql = "UPDATE is1 SET bitis=?, xususiyyet=? where id=?";
        try(Connection conn = this.connect();
                PreparedStatement pr = conn.prepareStatement(sql))
        {
            pr.setString(1, basla);
            pr.setInt(2, xususiyyet);
            pr.setString(3, id);
            
            pr.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void B102Insert (String fayl, String real, String id, String izzah){
        String sql = "INSERT INTO fayllar(fayl, sahibi, id2, izzah) VALUES (?,?,?,?)";
        
        try(Connection conn = this.connect();
                PreparedStatement pr = conn.prepareStatement(sql)){
            pr.setString(1, fayl);
            pr.setString(2, real);
            pr.setString(3, id);
            pr.setString(4, izzah);
            
            pr.executeUpdate();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
