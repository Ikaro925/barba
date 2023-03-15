package Model;

//Encapsular datos
public class User {
    private int idUsuarios;
    private String usu_Nombre;
    private String usu_Apellido;
    private String usu_Correo;
    private String usu_Password;
    private int Roles_idRole;


    //Constructores
    /*
    public User(String usu_Correo) {
        //Constructor vacio
    }

*/
    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getUsu_Nombre() {
        return usu_Nombre;
    }

    public void setUsu_Nombre(String usu_Nombre) {
        this.usu_Nombre = usu_Nombre;
    }

    public String getUsu_Apellido() {
        return usu_Apellido;
    }

    public void setUsu_Apellido(String usu_Apellido) {
        this.usu_Apellido = usu_Apellido;
    }

    public String getUsu_Correo() {
        return usu_Correo;
    }

    public void setUsu_Correo(String usu_Correo) {
        this.usu_Correo = usu_Correo;
    }

    public String getUsu_Password() {
        return usu_Password;
    }

    public void setUsu_Password(String usu_Password) {
        this.usu_Password = usu_Password;
    }

    public int getRoles_idRole() {
        return Roles_idRole;
    }

    public void setRoles_idRole(int roles_idRole) {
        Roles_idRole = roles_idRole;
    }
}


