/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author dnlal
 */
public class AdmPais {
    private static Connection connection = null;
    
    public static String registerPais (String country) throws ClassNotFoundException, SQLException{
  
       Class.forName("oracle.jdbc.driver.OracleDriver");
        
      String dbURL = "jdbc:oracle:thin:@localhost:1521:BASES2022";
      String username = "pr";
      String password = "pr";
      connection = DriverManager.getConnection(dbURL,username, password);   
     
     
      CallableStatement sql = connection.prepareCall( "{?=call RegisterCountry(?)}");
      sql.registerOutParameter(1, OracleTypes.VARCHAR);
      sql.setString(2,country);
      sql.execute();
      System.out.println(sql.getObject(1));
      return (String) sql.getObject(1);
        }
    
     public static String removeCountry (String country) throws ClassNotFoundException, SQLException{
  
      Class.forName("oracle.jdbc.driver.OracleDriver");
        
      String dbURL = "jdbc:oracle:thin:@localhost:1521:BASES2022";
      String username = "pr";
      String password = "pr";
      connection = DriverManager.getConnection(dbURL,username, password);   
     
     
      CallableStatement sql = connection.prepareCall( "{?=call DeleteCountry(?)}");
      sql.registerOutParameter(1, OracleTypes.VARCHAR);
      sql.setString(2,country);
      sql.execute();
      System.out.println(sql.getObject(1));
      return (String) sql.getObject(1);
        }
    }
   
