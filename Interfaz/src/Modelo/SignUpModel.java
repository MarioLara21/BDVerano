
package Modelo;


import Controlador.AdmSignUp;
import java.sql.SQLException;
public class SignUpModel {
    
    AdmSignUp admsu=new AdmSignUp();
    public static String encode(String password){
        
        return "";
    }
    
    
    public static boolean Register(String first_name, String last_name, String date_of_birth, int id_photo, String email, 
            String gender, int phoneNum,  int pais, int estado, int city, String direccion, String user, String pass) throws ClassNotFoundException, SQLException{
        boolean flag;
        
        flag = "insertado".equals(AdmSignUp.registerUser(first_name,last_name,date_of_birth,id_photo,email, 
            gender, phoneNum, pais,estado, city, direccion,user, pass));
        return flag;
}}
