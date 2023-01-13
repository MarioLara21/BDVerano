
package Controlador;

//Conexiones y llamados a SP desde la Base de Datos para Login

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Scanner;
import oracle.jdbc.OracleTypes;


public class AdmLogin {
    
    private static Connection connection = null;
  
    
  public static String getProcedureLogin(String user, String pass) throws SQLException, ClassNotFoundException {
      Class.forName("oracle.jdbc.driver.OracleDriver");
     Class.forName("oracle.jdbc.driver.OracleDriver");
        
      String dbURL = "jdbc:oracle:thin:@localhost:1521:DBPRUEBA";
      String username = "pr";
      String password = "pr";
      connection = DriverManager.getConnection(dbURL,username, password);   
     
     
        CallableStatement sql = connection.prepareCall( "{?=call LogInRegisteredUser(?,?)}");
      sql.registerOutParameter(1, OracleTypes.VARCHAR);
      sql.setString(2,user);
      sql.setString(3,pass);
      sql.execute();
      System.out.println(sql.getObject(1));
      return (String) sql.getObject(1);
      
      
}
  
}