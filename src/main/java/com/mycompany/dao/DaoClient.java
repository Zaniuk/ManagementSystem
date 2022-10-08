/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.models.Academy;
import com.mycompany.models.Client;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerok
 */

public class DaoClient {
    private class Config {
        String DB_NAME = "education_system";
        String DB_PASSWORD = "lsOer1CiYUIDEA36i2ep";
        String DB_USER = "root";
        String DB_HOST = "localhost";
        String DB_PORT = "3306";
        String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
        String URL_CONNECTION = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME + "?useSSL=false";
    }
    public Connection getConnection () throws ClassNotFoundException{
        Config config = new Config(); 
        try{
            Class.forName(config.DB_DRIVER);
            return DriverManager.getConnection(config.URL_CONNECTION, config.DB_USER, config.DB_PASSWORD);
        }catch(SQLException ex){
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
       
    public void saveAcademy(Academy academy){
        Config config = new Config();  
        //Connection connection = null;
       
        
        try {
            
             Connection connection = getConnection();
            
            //String sql = String.format("INSERT INTO Academies (name, phone, web, id) values (%s , %s ,  % s,  null)" , academy.getName(), academy.getPhone(), academy.getWeb());
            Object[] params = new Object[]{academy.getName(), academy.getPhone(), academy.getWeb()};
            String sql = MessageFormat.format("INSERT INTO Academies (name, phone, web, id) values ( \"{0}\" , \"{1}\" ,  \"{2}\",  null );" , params);
            System.out.println(sql);
            PreparedStatement ps  = connection.prepareStatement(sql);
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public ResultSet getAcademies(){
        Config config = new Config();
        try {
            Connection connection = getConnection();            
            String sql = "SELECT * FROM academies;";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            return rs;
        } catch (Exception ex) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
        
    }
}
