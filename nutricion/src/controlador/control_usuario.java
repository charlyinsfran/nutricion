
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import conexion.conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;


public class control_usuario {
    //metodo para iniciar sesion

   public boolean LOGINUSER(Usuario objeto){
        boolean respuesta = false;
        
        Connection cn = (Connection) conexion.conectar();
        String sql = "Select usuario,password from usuarios where usuario ='" + objeto.getUsuario() +"' and password='" + objeto.getPassword() + "'";
        Statement st;
  
        try{  
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);     
            while(rs.next()){
                respuesta = true;
            }           
        }catch(SQLException e){      
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null,"Error al Iniciar Sesion");
        }
       return respuesta;
    } 
   
   
   public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = (Connection) conexion.conectar();
        try {
            PreparedStatement consultar = cn.prepareStatement("Insert into usuarios(nombre,apellido,correo,telefono,usuario,password) VALUES (?,?,?,?,?,?)");
            consultar.setString(1, objeto.getNombre());
            consultar.setString(2, objeto.getApellido());
            consultar.setString(3, objeto.getCorreo());
            consultar.setString(4, objeto.getTelefono());
            consultar.setString(5, objeto.getUsuario());
            consultar.setString(6, objeto.getPassword());

            if (consultar.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar datos" + e);
        }
        return respuesta;
    }
   
   
    public boolean existeusuario(String usuario) {
        boolean respuesta = false;
        String sql = "SELECT usuario from usuarios where usuario = '" + usuario + "'";
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
   
    
    public boolean actualizar(Usuario objeto, int idUsuarios) {
        boolean respuesta = false;
        Connection cn = (Connection) conexion.conectar();
        try {
            PreparedStatement consultar = cn.prepareStatement("update usuarios set nombre = ? , apellido = ? , telefono = ? ,correo = ?, usuario = ?, password = ?  where idusuarios = '" + idUsuarios + "'" );
            consultar.setString(1, objeto.getNombre());
            consultar.setString(2,objeto.getApellido());
            consultar.setString(3,objeto.getTelefono());
            consultar.setString(4,objeto.getCorreo());
            consultar.setString(5, objeto.getUsuario());
            consultar.setString(6, objeto.getPassword());
            
            if (consultar.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar datos" + e);
        }
        return respuesta;
    }
    
    
    public boolean eliminar( int idUsuarios) {
        boolean respuesta = false;
        Connection cn = (Connection) conexion.conectar();
        try {
            PreparedStatement consultar = cn.prepareStatement("delete from usuarios where idusuarios = '" + idUsuarios + "'");
            consultar.executeUpdate();
            

            if (consultar.executeUpdate() > 0) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar datos" + e);
        }
        return respuesta;
    }
    

   
}
