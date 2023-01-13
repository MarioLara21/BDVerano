
package Modelo;


import Controlador.AdmSignUp;
import java.sql.SQLException;
public class SignUpModel {
    
    AdmSignUp admsu=new AdmSignUp();
    public static String encode(String password){
        
        return "";
    }
    
    
    public static boolean Register(String user, String pass) throws ClassNotFoundException, SQLException{
        boolean flag;
        
        flag = "insertado".equals(AdmSignUp.registerUser(user,pass));
        return flag;
}}
