
package modelo;


public class Consulta {
    
    private int idconsulta;
    private int idpaciente;
    private String fecha;
    private int edad;
    private int peso;
    private int peso_habitual;
    private int peso_ajustado;
    private double estatura;
    private double imc;
    private int cia_muñeca;
    private int cia_cintura;
    private String actividad_fisica;
    private String biotipo;
    private int peso_ideal;
    private int porcentaje_pe_ideal;
    private String antc_familiares;
    private String dx_medico;
    private String dx_nutricional;
    
    public Consulta(){
      idconsulta = 0;
    idpaciente = 0 ;
    fecha = "";
    edad = 0;
    peso = 0;
    peso_habitual = 0;
    peso_ajustado = 0;
    estatura = 0.0;
    imc = 0.0;
    cia_muñeca = 0;
    cia_cintura = 0;
   actividad_fisica= "";
    biotipo= "";
    peso_ideal= 0;
    porcentaje_pe_ideal = 0;
    antc_familiares= "";
    dx_medico= "";
    dx_nutricional= "";
        
    }

    public int getIdconsulta() {
        return idconsulta;
    }

    public void setIdconsulta(int idconsulta) {
        this.idconsulta = idconsulta;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso_habitual() {
        return peso_habitual;
    }

    public void setPeso_habitual(int peso_habitual) {
        this.peso_habitual = peso_habitual;
    }

    public int getPeso_ajustado() {
        return peso_ajustado;
    }

    public void setPeso_ajustado(int peso_ajustado) {
        this.peso_ajustado = peso_ajustado;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public int getCia_muñeca() {
        return cia_muñeca;
    }

    public void setCia_muñeca(int cia_muñeca) {
        this.cia_muñeca = cia_muñeca;
    }

    public int getCia_cintura() {
        return cia_cintura;
    }

    public void setCia_cintura(int cia_cintura) {
        this.cia_cintura = cia_cintura;
    }

    public String getActividad_fisica() {
        return actividad_fisica;
    }

    public void setActividad_fisica(String actividad_fisica) {
        this.actividad_fisica = actividad_fisica;
    }

    public String getBiotipo() {
        return biotipo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public int getPeso_ideal() {
        return peso_ideal;
    }

    public void setPeso_ideal(int peso_ideal) {
        this.peso_ideal = peso_ideal;
    }

    public int getPorcentaje_pe_ideal() {
        return porcentaje_pe_ideal;
    }

    public void setPorcentaje_pe_ideal(int porcentaje_pe_ideal) {
        this.porcentaje_pe_ideal = porcentaje_pe_ideal;
    }

    public String getAntc_familiares() {
        return antc_familiares;
    }

    public void setAntc_familiares(String antc_familiares) {
        this.antc_familiares = antc_familiares;
    }

    public String getDx_medico() {
        return dx_medico;
    }

    public void setDx_medico(String dx_medico) {
        this.dx_medico = dx_medico;
    }

    public String getDx_nutricional() {
        return dx_nutricional;
    }

    public void setDx_nutricional(String dx_nutricional) {
        this.dx_nutricional = dx_nutricional;
    }

    public Consulta(int idconsulta, int idpaciente, String fecha, int edad, int peso, int peso_habitual, int peso_ajustado, double estatura, double imc, int cia_muñeca, int cia_cintura, String actividad_fisica, String biotipo, int peso_ideal, int porcentaje_pe_ideal, String antc_familiares, String dx_medico, String dx_nutricional) {
        this.idconsulta = idconsulta;
        this.idpaciente = idpaciente;
        this.fecha = fecha;
        this.edad = edad;
        this.peso = peso;
        this.peso_habitual = peso_habitual;
        this.peso_ajustado = peso_ajustado;
        this.estatura = estatura;
        this.imc = imc;
        this.cia_muñeca = cia_muñeca;
        this.cia_cintura = cia_cintura;
        this.actividad_fisica = actividad_fisica;
        this.biotipo = biotipo;
        this.peso_ideal = peso_ideal;
        this.porcentaje_pe_ideal = porcentaje_pe_ideal;
        this.antc_familiares = antc_familiares;
        this.dx_medico = dx_medico;
        this.dx_nutricional = dx_nutricional;
    }
  
}
