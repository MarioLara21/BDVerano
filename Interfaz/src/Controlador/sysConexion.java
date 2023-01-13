
package Controlador;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;


public class sysConexion {
    
    public static Connection obtConection() throws ClassNotFoundException, SQLException{
        
        try{
            String myDb="jdbc:oracle:thin:@localhost:1521:BASES2023";
            String user="pr";

            String password="ge";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            java.sql.Connection connection= DriverManager.getConnection(myDb,user,password);
            return (Connection) connection;
        }catch(SQLException e){
            System.out.println("El error es: "+ e);
            return null;
        }   
    }
    public static ResultSet ejecutarStoredProcedure(CallableStatement cs) throws SQLException{
        return cs.executeQuery();
    }
}
