package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class conexion {

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nutridevops","root","");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local" + e);
        }
        return null;
    }

}