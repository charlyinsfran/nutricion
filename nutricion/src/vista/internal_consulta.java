package vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.conexion;
//import controlador.CTR_Producto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
//import modelo.Producto;

public class internal_consulta extends javax.swing.JInternalFrame {

    int obteneridpacientescombo = 0;
    String imprimir;

    public internal_consulta() {
        initComponents();
        this.setSize(new Dimension(783, 476));
        this.setTitle("FICHA PACIENTE");
        this.CargarComboBoxPacientes();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        combobox_pacientes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        altura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        imc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        PACIENTESNUEVO = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(783, 476));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Paciente:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        combobox_pacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione paciente:" }));
        combobox_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combobox_pacientesMouseClicked(evt);
            }
        });
        getContentPane().add(combobox_pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, -1));

        jLabel10.setText("Edad:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 90, -1));

        jLabel2.setText("Peso Actual:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        getContentPane().add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, -1));

        jLabel3.setText("kg");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel4.setText("Peso Habitual:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 90, -1));

        jLabel5.setText("kg");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel6.setText("Peso Ajustado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 90, -1));

        jLabel7.setText("kg");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        jLabel11.setText("Estatura:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                alturaKeyPressed(evt);
            }
        });
        getContentPane().add(altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 70, -1));

        jLabel12.setText("cm");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        imc.setEnabled(false);
        getContentPane().add(imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 150, -1));

        jLabel13.setText("I.M.C");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel14.setText("%");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        jLabel15.setText("Cia Muñeca ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 70, -1));

        jLabel16.setText("cm");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel17.setText("cm");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jLabel18.setText("Cia Cintura");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 70, -1));

        jLabel20.setText("Act. Fisica:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione opcion:", "Nula", "Poca", "Moderada", "Frecuente", "Deporte" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 170, -1));

        jLabel21.setText("Biotipo:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione opcion:", "Ectomorfo", "Mesomorto", "Endomorfo" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 130, -1));

        jLabel1.setText("Peso Ideal:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 70, -1));

        jLabel19.setText("kg");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));

        jLabel22.setText("% Peso Ideal:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        jLabel23.setText("Ant. Familiares:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 160, -1));

        jLabel24.setText("DX Médico: ");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 240, -1));

        jLabel25.setText("DX Nutricional:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 240, -1));

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        jButton2.setText("CANCELAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("CONSULTA");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 290, -1));
        getContentPane().add(PACIENTESNUEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 130, -1));

        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //this.idpacientes();
        this.calcularimc();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combobox_pacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combobox_pacientesMouseClicked

    }//GEN-LAST:event_combobox_pacientesMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.BUSCARPacientes();
       this.combobox_pacientes.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void alturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alturaKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                  this.calcularimc();
                }
    }//GEN-LAST:event_alturaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PACIENTESNUEVO;
    private javax.swing.JTextField altura;
    private javax.swing.JComboBox<String> combobox_pacientes;
    private javax.swing.JTextField imc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField peso;
    // End of variables declaration//GEN-END:variables

    
    private void LimpiarCampos(){
        /*this.txtnombre.setText("");
        this.txtcantidad.setText("");
        this.txtprecio.setText("");
        this.txtdescripcion.setText("");
        this.txtnombre.requestFocus();*/
    }
    
    private void deshabilitarcampos(){
        
    }
    
    
    

    private void CargarComboBoxPacientes() {
        Connection con = (Connection) conexion.conectar();
        String sql = "SELECT idpacientes,nombre from pacientes";
        Statement st;
        
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            combobox_pacientes.removeAllItems();
            combobox_pacientes.addItem("Seleccione paciente:");

            while (rs.next()) {
                combobox_pacientes.addItem(rs.getString("nombre"));  
            }

            con.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar pacientes");
        }
    }
  private int idpacientes() {
        
       
        String sql = "Select * from pacientes where nombre = '" + this.combobox_pacientes.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = (Connection) conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                obteneridpacientescombo = rs.getInt("idpacientes");
                imprimir = String.valueOf(obteneridpacientescombo);
                System.out.println(imprimir);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener id pacientes");
        }
        return obteneridpacientescombo;
   
    }
  
  private void BUSCARPacientes() {
        Connection con = (Connection) conexion.conectar();
        String sql = "SELECT * from pacientes where cedula = '" + PACIENTESNUEVO.getText() + "'";
        Statement st;
        
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                this.PACIENTESNUEVO.setText(rs.getString("nombre") + " " + rs.getString("apellido")); 
                obteneridpacientescombo = rs.getInt("idpacientes");
                System.out.println(obteneridpacientescombo);
            }

            con.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar pacientes");
        }
    }
  
  
  public void calcularimc(){
      double estatura = 0.0;
      double pesovalor = 0.0;
        double imcvalor = 0.0 ;
       
      estatura = Double.parseDouble(altura.getText());
      pesovalor = Double.parseDouble(peso.getText());
      
      double valorneto = estatura * estatura;
      
      imcvalor = pesovalor / (estatura*estatura);
      DecimalFormat df =new DecimalFormat("#.##");
      
      this.imc.setText((df.format(imcvalor)));
      
      System.out.println(estatura);
      System.out.println(valorneto);
      System.out.println(imcvalor);
      
      
      
  }
  
}
