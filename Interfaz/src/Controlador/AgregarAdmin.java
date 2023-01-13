package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;
/**
 *
 * @author Raul
 */
public class AgregarAdmin {
    
    private static Connection connection = null;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        
        AgregarAdmin agregarAdmin = new AgregarAdmin();
        try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        String dbURL = "jdbc:oracle:thin:@localhost:1521:BASES2023";
        String username = "pr"; 
        String password = "pr";
        connection = DriverManager.getConnection(dbURL,username, password);
        
        System.out.println("Enter choice");
        System.out.println("1. Insert record");   
        System.out.println("2. Callable Statement: Select record"); 
        int choice = Integer.parseInt(scanner.nextLine());
        
        switch (choice){
        case 1:
            agregarAdmin.insertRecord();
            break;
        case 2: 
            agregarAdmin.getProcedure();
        default:
            break;
                    }
    } catch (Exception e){
         
    }
    
  }
  private void insertRecord() throws SQLException {
      System.out.println("inside insert record()");
      
      String sql = "INSERT INTO PERSON(id_person,first_name, last_name, date_of_birth,id_photo, gender, id_adress,id_audit) VALUES(s_person.nextval,'Cristiano', 'Ronaldo', '14-SEP-2000', 1, 'masculine', 1,NULL);  ";
      
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      int rows = preparedStatement.executeUpdate();
      
      if(rows > 0){
          System.out.println("Record inserted succesfully");
      }
  }
  
  private void getProcedure() throws SQLException {
      System.out.println("Soy get procedure");
      try {
      long millis = System.currentTimeMillis();
      java.sql.Date date = new java.sql.Date(millis);
      PreparedStatement cStmt = connection.prepareCall( "{call adminPerson.insertPerson(?,?,?,?,?)}");
      cStmt.setString(1,"Maro");
      cStmt.setString(2,"wak");
      cStmt.setString(3,"23-JAN-22");
      cStmt.setInt(4,1);
      cStmt.setInt(5,100000);
      cStmt.execute();   
      System.out.println("Datos insertados");
      } catch(SQLException ex){
          System.out.print(ex);
      }
    }
}
