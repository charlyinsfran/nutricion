
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import conexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Pacientes;


public class control_pacientes {
    public boolean guardar(Pacientes objeto) {
        boolean respuesta = false;
        Connection cn = (Connection) conexion.conectar();
        try {
            PreparedStatement consultar = cn.prepareStatement("Insert into pacientes values (?,?,?,?,?,?,?,?,?,?)");
            
            consultar.setInt(1, 0);
            consultar.setString(2, objeto.getNombre());
            consultar.setString(3, objeto.getApellido());
            consultar.setString(4, objeto.getCedula());
            consultar.setString(5, objeto.getDireccion());
            consultar.setString(6, objeto.getTelefono());
            consultar.setString(7,objeto.getCorreo());
            consultar.setString(8, objeto.getEstado_civil());
            consultar.setString(9, objeto.getOcupacion());
            consultar.setInt(10, objeto.getIdciudad());
            
            if (consultar.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar datos" + e);
        }
        return respuesta;
    }
     
     /*public boolean existecliente(String cedula) {
        boolean respuesta = false;
        String sql = "SELECT cedula from clientes where cedula = '" + cedula + "'";
        Statement st;
        try {
            Connection cn = (Connection) conexion.Conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet Rs = st.executeQuery(sql);

        } catch (SQLException e) {
            System.out.println("Error al consultar" + e);
        }
        return respuesta;
    }    
     */
     
     /*public boolean actualizar(Cliente objeto, int idClientes) {
        boolean respuesta = false;
        Connection cn = (Connection) conexion.Conexion.conectar();
        try {
            PreparedStatement consultar = cn.prepareStatement("update clientes set nombre = ? , apellido = ? , cedula = ? ,telefono = ?, direccion = ?, correo = ?  where idclientes = '" + idClientes + "'" );
            consultar.setString(1, objeto.getNombre());
            consultar.setString(2,objeto.getApellido());
            consultar.setInt(3,objeto.getCedula());
            consultar.setString(4,objeto.getTelefono());
            consultar.setString(5, objeto.getDireccion());
            consultar.setString(6, objeto.getCorreo());
            
            if (consultar.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar datos" + e);
        }
        return respuesta;
    }
    
    
    public boolean eliminar( int idClientes) {
        boolean respuesta = false;
        Connection cn = (Connection) conexion.Conexion.conectar();
        try {
            PreparedStatement consultar = cn.prepareStatement("delete from clientes where idclientes = '" + idClientes + "'");
            consultar.executeUpdate();
            

            if (consultar.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar datos" + e);
        }
        return respuesta;
    }
     
     
     
     
  */   
}


