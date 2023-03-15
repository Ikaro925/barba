package Model;

import javax.crypto.SecretKey;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;

public class Consulta extends DBCconexion{

    private static final String SECRET_KEY = "my-secret-key";
    public boolean autenticacion(User user){
        PreparedStatement pst = null;
        ResultSet rs = null;

        //Para concectar la base de datos
        try{
            String query = "select * from usuarios where usu_Correo = ? and usu_Password = AES_ENCRYPT(?, ?)";
            pst = getConnection().prepareStatement(query);
            pst.setString(1, user.getUsu_Correo());
            pst.setString(2, user.getUsu_Password());
            pst.setString(3, SECRET_KEY);
            rs = pst.executeQuery(); //Guardar y ejecutar la consulta usuario y password


            //Verificar el registro

            if (rs.absolute(1)){
                return true;


            }

        }catch (Exception e){

            System.err.println("Error"+ e);


        }finally { //Cierre de conexion
            try{
                if (getConnection() != null) getConnection().close();
                    if (pst != null) pst.close();
                    if (rs != null) rs.close();
            }catch (Exception e){

                System.err.println("Error"+ e);


            }


        }


        return false;

    }

    //Probar consulta

   //Registro
    public boolean registrar (User user){

        PreparedStatement pst = null;

        String encryptedPassword = Base64.getEncoder().encodeToString(user.getUsu_Password().getBytes());

        try{

            String query = "insert into usuarios (usu_Nombre, usu_Apellido, usu_Correo, usu_Password) values (?,?,?,?,?)";
            pst = getConnection().prepareStatement(query);
            pst.setString(1, user.getUsu_Nombre());
            pst.setString(2, user.getUsu_Apellido());
            pst.setString(3, user.getUsu_Correo());
            pst.setString(4, user.getUsu_Password());
            pst.setString(5, SECRET_KEY);

                if(pst.executeUpdate()==1 ){

                    return true;
                }



        }catch (Exception e){
            System.err.println("Error" + e);


        }finally {
            try {
                if (getConnection() != null) getConnection().close();
                if (pst != null) pst.close();
            }catch (Exception e){
                System.err.println("Error" + e);


            }

        }
        return  false;


    }


    private String desencriptar (String passwordEncriptacion){
        String descryptedPassword = null;
        try {
            byte[] decodeBytes = Base64.getDecoder().decode(passwordEncriptacion);
            descryptedPassword = new String(decodeBytes);
        }catch (Exception e){

            System.err.println("Error al desencriptar la contraseña");

        }

            return descryptedPassword;
        }




    }


