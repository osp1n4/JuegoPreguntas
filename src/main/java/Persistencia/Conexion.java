package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/preguntas_app", "root", "123456789");

    }catch (SQLException e){
            System.out.println(e);
    }
        return conection;
    }
}
