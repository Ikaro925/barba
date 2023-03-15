package Model;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class DBCconexion {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private static final String URL = "jdbc:MySql://localhost:3306/barberia?ServerTimeZone=AmericaBogota";

    private static DBCconexion instancia = null;
    private static BasicDataSource pool;

    public DBCconexion() {
        pool = new BasicDataSource();
        pool.setUrl(URL);
        pool.setUsername(USERNAME);
        pool.setPassword(PASSWORD);
        pool.setInitialSize(8);
        pool.setMinIdle(8);
        pool.setMaxIdle(20);
        pool.setMaxTotal(20);
    }

    public static DBCconexion getInstance() throws SQLException {
        if (instancia == null) {
            instancia = new DBCconexion();
        }
        return instancia;
    }

    public Connection getConnection() throws SQLException {
        return pool.getConnection();
    }
}




















    /*
    public BasicDataSource getInstance() throws SQLException{

        //Arranque del servidor
        if (pool==null){

            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USERNAME);
            pool.setPassword(PASSWORD);


            //Conexiones que manejara el sistema
            pool.setInitialSize((8));
            pool.setMinIdle(8);
            pool.setMaxIdle(20);
            pool.setMaxTotal(20);

            if (instancia==null){
                instancia = new DBCconexion();

            }

        }


        return pool;



    }
    public static Connection getConnection() throws SQLException{

    return pool.getConnection();

    }


public static void main(String[] args){

        try {
            Connection connection = DBCconexion.getConnection();
            if (connection!=null){
                System.out.println("Conectado");


            }else {
                System.out.println("No conectado");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

}



    /*
    private Connection con;


        public DBCconexion (){

            try {

            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);


            }catch (Exception e){

            System.err.println("Error" + e);


            }


    }

        public Connection getDBCconexion() {
            return con;

            }

        //Prueba de conexion
        public static void main (String[] args){
            DBCconexion con = new DBCconexion();


        }

*/



