
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.pacientes;


public class pacientes_controller {

    public boolean guardar(pacientes objeto) {
        boolean respuesta = false;
        Connection cn = (Connection) conexion.conectar();
        try {
            PreparedStatement consultar = cn.prepareStatement("Insert into clientes values (?,?,?,?,?,?,?)");
            
            /*consultar.setInt(1, 0);
            consultar.setString(2, objeto.getNombre());
            consultar.setString(3, objeto.getApellido());
            consultar.setInt(4, objeto.getCedula());
            consultar.setString(5, objeto.getTelefono());
            consultar.setString(6, objeto.getDireccion());
            consultar.setString(7,objeto.getCorreo());
            */
            if (consultar.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar datos" + e);
        }
        return respuesta;
    }
     
     public boolean existepaciente(String cedula) {
        boolean respuesta = false;
        String sql = "SELECT cedula from clientes where cedula = '" + cedula + "'";
        Statement st;
        try {
            Connection cn = (Connection) conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet Rs = st.executeQuery(sql);

        } catch (SQLException e) {
            System.out.println("Error al consultar" + e);
        }
        return respuesta;
    }    
     
     
     
     
     
     
        
}
