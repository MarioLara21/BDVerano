
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Scanner;
import oracle.jdbc.OracleTypes;



public class AdmSignUp {
    private static Connection connection = null;
  
    
    
    
    public static String registerUser(String first_name, String last_name, String date_of_birth, int id_photo, String email, 
            String gender,  int phoneNum, int pais, int estado, int city, String direccion, String user, String pass) throws ClassNotFoundException, SQLException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        
      String dbURL = "jdbc:oracle:thin:@localhost:1521:BASES2022";
      String username = "pr";
      String password = "pr";
      connection = DriverManager.getConnection(dbURL,username, password);  
      CallableStatement sql = connection.prepareCall( "{?=call REGISTERUSER(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
     
      sql.registerOutParameter(1, OracleTypes.VARCHAR);
      sql.setString(2,first_name);
      sql.setString(3,last_name);
      sql.setString(4, date_of_birth);
      sql.setInt(5, id_photo);
      sql.setString(6, email);
      sql.setString(7, gender);
      sql.setInt(8, phoneNum);
      sql.setInt(9, pais);
      sql.setInt(10, estado);
      sql.setInt(11, city);
      sql.setString(12, direccion);
      sql.setString(13, user);
      sql.setString(14, pass);
      sql.execute();
      System.out.println(sql.getObject(1));
      
      return (String) sql.getObject(1);
    }
}
