
package modelo;


public class Pacientes {
    private int idpacientes;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String telefono;
    private String correo;
    private String estado_civil;
    private String ocupacion;
    private int idciudad;
   
    
    
    public Pacientes(){
   idpacientes = 0;
   nombre = "";
   apellido = "";
   cedula = "" ;
   direccion = "";
   telefono = "";
   correo = "";
   estado_civil = "";
   ocupacion = "";
   idciudad = 0;
    }

    public Pacientes(int idpacientes, String nombre, String apellido, String cedula, String direccion, String telefono, String correo, String estado_civil, String ocupacion, int idciudad) {
        this.idpacientes = idpacientes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estado_civil = estado_civil;
        this.ocupacion = ocupacion;
        this.idciudad = idciudad;
    }

    public int getIdpacientes() {
        return idpacientes;
    }

    public void setIdpacientes(int idpacientes) {
        this.idpacientes = idpacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }
    
    
    
    
    
    
}
