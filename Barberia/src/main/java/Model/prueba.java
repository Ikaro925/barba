package Model;

import java.sql.Connection;
import java.sql.SQLException;

public class prueba  {
    public static void main(String[] args) {
        try {
            Connection conn = DBCconexion.getInstance().getConnection();
            System.out.println("Conexión exitosa a la base de datos.");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
        }
    }

}
