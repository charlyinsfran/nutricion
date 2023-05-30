package vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import controlador.control_pacientes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Pacientes;

public class internal_pacientes extends javax.swing.JInternalFrame {

    int obteneridciudadcombo = 0;

    public internal_pacientes() {
        initComponents();
        this.setSize(new Dimension(860, 427));
        this.setTitle("NUEVOS PACIENTES");
        this.txtnombre.requestFocus();
        this.CargarComboBoxCiudades();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        txt_correo = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_estadocivil = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_ocupacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_cancelar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(860, 427));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Apellido:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("C.I.N°/RUC");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Direccion:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Correo:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 210, 25));

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 210, 25));

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, 25));

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 130, 25));

        btn_guardar.setBackground(new java.awt.Color(0, 204, 204));
        btn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, 30));

        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, 25));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 210, 25));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Teléfono:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, 20));

        jComboBox_estadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Estado Civil:", "Soltero", "Casado", "Divorciado", "Viudo", "Union Libre" }));
        getContentPane().add(jComboBox_estadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 190, 25));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Ciudad:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        txt_ocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ocupacionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 520, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Ocupacion:");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Estado Civil:");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ciudad:" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, 25));

        btn_cancelar.setBackground(new java.awt.Color(255, 0, 51));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        control_pacientes pacientesctr = new control_pacientes();
        Pacientes pacientes = new Pacientes();

        if (!txtnombre.getText().isEmpty() || !txtapellido.getText().isEmpty() || !txtcedula.getText().isEmpty()) {

            pacientes.setNombre(txtnombre.getText().trim());
            pacientes.setApellido(txtapellido.getText().trim());
            pacientes.setCedula(txtcedula.getText().trim());
            pacientes.setDireccion(txt_direccion.getText().trim());
            pacientes.setTelefono(txt_telefono.getText().trim());
            pacientes.setCorreo(txt_correo.getText().trim());
            pacientes.setEstado_civil(jComboBox_estadocivil.getSelectedItem().toString().trim());
            pacientes.setOcupacion(txt_ocupacion.getText().trim());
            this.IdCiudades();
            pacientes.setIdciudad(obteneridciudadcombo);

            if (!pacientesctr.existepaciente(txtcedula.getText().trim())) {

                if (pacientesctr.guardar(pacientes)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    this.LimpiarCampos();
                    this.txtnombre.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo guardar el registro");

                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Numero de C.I registrado");
                this.txtcedula.requestFocus();
            }
            } 
        
        else {

            JOptionPane.showMessageDialog(null, "Campos obligatorios");
            this.txtnombre.requestFocus();
        }

        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_ocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ocupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ocupacionActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.Cancelar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox_estadocivil;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_ocupacion;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

    private void LimpiarCampos() {
        this.txtnombre.setText("");
        this.txtapellido.setText("");
        this.txtcedula.setText("");
        this.txt_telefono.setText("");
        this.txt_direccion.setText("");
        this.jComboBox_estadocivil.setSelectedItem("Seleccione Estado Civil:");
        this.txt_correo.setText("");
        this.jComboBox1.setSelectedItem("Seleccione ciudad:");
        this.txt_ocupacion.setText("");

    }

    private void Cancelar() {
        this.txtnombre.setText("");
        this.txtapellido.setText("");
        this.txtcedula.setText("");
        this.txt_telefono.setText("");
        this.txt_direccion.setText("");
        this.jComboBox_estadocivil.setSelectedItem("Seleccione Estado Civil:");
        this.txt_correo.setText("");
        this.jComboBox1.setSelectedItem("Seleccione ciudad:");
        this.txt_ocupacion.setText("");

    }

    private void CargarComboBoxCiudades() {
        Connection con = (Connection) conexion.conexion.conectar();
        String sql = "SELECT * from ciudades";
        Statement st;
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox1.removeAllItems();
            jComboBox1.addItem("Seleccione ciudad:");
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("descripcion"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar categorias");
        }
    }

    private int IdCiudades() {

        String sql = "Select * from ciudades where descripcion = '" + this.jComboBox1.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = (Connection) conexion.conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                obteneridciudadcombo = rs.getInt("idciudades");
            }

        } catch (SQLException e) {
            System.out.println("Error");
        }
        return obteneridciudadcombo;

    }

}
