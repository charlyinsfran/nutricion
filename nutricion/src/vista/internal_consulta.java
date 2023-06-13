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
    double valorusadoimc = 0.0;

    public internal_consulta() {
        initComponents();
        this.setSize(new Dimension(875, 555));
        this.setTitle("FICHA PACIENTE");
        this.CargarComboBoxPacientes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        combobox_pacientes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        SP_EDAD = new javax.swing.JSpinner();
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
        txt_altura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        imc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_cia_muñeca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jComboBox_biotipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_pesoideal = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_porcentaje_ppi = new javax.swing.JTextField();
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
        jLabel27 = new javax.swing.JLabel();
        sexocombo = new javax.swing.JComboBox<>();
        txt_valorac_nutricional = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(875, 555));
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

        jLabel10.setText("SEXO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));
        getContentPane().add(SP_EDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 90, -1));

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

        txt_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_alturaKeyPressed(evt);
            }
        });
        getContentPane().add(txt_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 70, -1));

        jLabel12.setText("cm");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        imc.setEnabled(false);
        getContentPane().add(imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 150, -1));

        jLabel13.setText("I.M.C");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jLabel14.setText("%");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabel15.setText("Cia Muñeca ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        txt_cia_muñeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cia_muñecaActionPerformed(evt);
            }
        });
        txt_cia_muñeca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cia_muñecaKeyPressed(evt);
            }
        });
        getContentPane().add(txt_cia_muñeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 70, -1));

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

        jComboBox_biotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione opcion:", "Pequeña", "Mediana", "Grande" }));
        getContentPane().add(jComboBox_biotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 130, -1));

        jLabel1.setText("Peso Ideal:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        txt_pesoideal.setEnabled(false);
        getContentPane().add(txt_pesoideal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 70, -1));

        jLabel19.setText("kg");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));

        jLabel22.setText("PPI:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));
        getContentPane().add(txt_porcentaje_ppi, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 110, -1));

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

        PACIENTESNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PACIENTESNUEVOActionPerformed(evt);
            }
        });
        PACIENTESNUEVO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PACIENTESNUEVOKeyPressed(evt);
            }
        });
        getContentPane().add(PACIENTESNUEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 130, -1));

        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jLabel27.setText("Edad:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        sexocombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sexo:", "F", "M" }));
        getContentPane().add(sexocombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));
        getContentPane().add(txt_valorac_nutricional, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 240, -1));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, -1));

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

    private void txt_alturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_alturaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.calcularimc();
          this.calculartipodeobesidad();
            System.out.println("el imc es: " + this.imc.getText());
        }
    }//GEN-LAST:event_txt_alturaKeyPressed

    private void txt_cia_muñecaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cia_muñecaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.calcularcontextura();
            this.calcularpesoideal();
            
        }
    }//GEN-LAST:event_txt_cia_muñecaKeyPressed

    private void txt_cia_muñecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cia_muñecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cia_muñecaActionPerformed

    private void PACIENTESNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PACIENTESNUEVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PACIENTESNUEVOActionPerformed

    private void PACIENTESNUEVOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PACIENTESNUEVOKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.BUSCARPacientes();
        this.combobox_pacientes.setEnabled(false);
            
        }
    }//GEN-LAST:event_PACIENTESNUEVOKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       TablaPorcentajeideal tablaporce = new TablaPorcentajeideal();
       tablaporce.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PACIENTESNUEVO;
    private javax.swing.JSpinner SP_EDAD;
    private javax.swing.JComboBox<String> combobox_pacientes;
    private javax.swing.JTextField imc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox_biotipo;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField peso;
    private javax.swing.JComboBox<String> sexocombo;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_cia_muñeca;
    private javax.swing.JTextField txt_pesoideal;
    private javax.swing.JTextField txt_porcentaje_ppi;
    private javax.swing.JTextField txt_valorac_nutricional;
    // End of variables declaration//GEN-END:variables

    private void LimpiarCampos() {
        /*this.txtnombre.setText("");
        this.txtcantidad.setText("");
        this.txtprecio.setText("");
        this.txtdescripcion.setText("");
        this.txtnombre.requestFocus();*/
    }

    private void deshabilitarcampos() {

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

    
    public void calculartipodeobesidad(){
        
       
            if (valorusadoimc < 18.50) {
                this.txt_valorac_nutricional.setText("Peso Insuficiente".toUpperCase());
            } 
           else if (valorusadoimc >= 18.50 && valorusadoimc <= 24.90) {
                this.txt_valorac_nutricional.setText("Normopeso".toUpperCase());

            } else if (valorusadoimc >= 25.00 && valorusadoimc <= 29.90) {
                this.txt_valorac_nutricional.setText("Sobrepeso".toUpperCase());

            } else if (valorusadoimc >= 30.00 && valorusadoimc <= 34.90) {
                this.txt_valorac_nutricional.setText("Obesidad Grado I".toUpperCase());
            } else if (valorusadoimc >= 35.0 && valorusadoimc <= 39.90) {
                this.txt_valorac_nutricional.setText("Obesidad Grado II".toUpperCase());
            } else if (valorusadoimc > 40.00) {
                this.txt_valorac_nutricional.setText("Obesidad Grado III".toUpperCase());

            }  
    }
    
    
    
    
    
    public void calcularimc() {
        double estatura = 0.0;
        double pesovalor = 0.0;
        double imcvalor = 0.0;
        estatura = Double.parseDouble(txt_altura.getText());
        pesovalor = Double.parseDouble(peso.getText());

        double valorneto = estatura * estatura;

        imcvalor = pesovalor / (estatura * estatura);
        valorusadoimc = imcvalor;
        DecimalFormat df = new DecimalFormat("#.##");

        this.imc.setText((df.format(imcvalor)));

            /*System.out.println(estatura);
      System.out.println(valorneto);
      System.out.println(imcvalor);**/
        }

    

    public void calcularcontextura() {
        double talla = 0.0;
        double cia_muñeca = 0.0;
        double biotipo = 0.0;
        double multiplo = 100.0;

        String impresion = "";

        talla = Double.parseDouble(txt_altura.getText());
        cia_muñeca = Double.parseDouble(txt_cia_muñeca.getText());

        biotipo = (talla / (cia_muñeca)) * 100.0;

        DecimalFormat dfor = new DecimalFormat("#.##");

        if (this.sexocombo.getSelectedItem().equals("Sexo:")) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR EL SEXO DEL PACIENTE");
        } else {
            if (this.sexocombo.getSelectedItem().equals("M")) {
                if (biotipo > 10.40) {
                    this.jComboBox_biotipo.setSelectedItem("Pequeña");
                } else if (biotipo > 9.60 && biotipo < 10.40) {
                    this.jComboBox_biotipo.setSelectedItem("Mediana");
                } else if (biotipo < 9.60) {
                    this.jComboBox_biotipo.setSelectedItem("Grande");
                }
            } else if (this.sexocombo.getSelectedItem().equals("F")) {
                if (biotipo > 11) {
                    this.jComboBox_biotipo.setSelectedItem("Pequeña");
                } else if (biotipo > 10.10 && biotipo < 11) {
                    this.jComboBox_biotipo.setSelectedItem("Mediana");
                } else if (biotipo < 10.10) {
                    this.jComboBox_biotipo.setSelectedItem("Grande");
                }
            }

            impresion = dfor.format(biotipo);
            System.out.println(talla);
            System.out.println(cia_muñeca);
            System.out.println("el biotipo es: " + impresion);

        }

    }

    public void calcularpesoideal() {
        double altura = 0.0;
        double peso_kg = 0.0;
        double imcval_ = 0.0;
        double pesoideal = 0.0;
        double ppi = 0.0;
        DecimalFormat dfe = new DecimalFormat("#.##");

        altura = Double.parseDouble(txt_altura.getText());
        peso_kg = Double.parseDouble(peso.getText());
        if (this.sexocombo.getSelectedItem().equals("F")) {
            imcval_ = 21.5;
            pesoideal = imcval_ * (altura * altura);
            ppi = ((peso_kg * 100.0) / pesoideal);
            this.txt_pesoideal.setText(dfe.format(pesoideal));
            this.txt_porcentaje_ppi.setText(dfe.format(ppi));
        } else if (this.sexocombo.getSelectedItem().equals("M")) {
            imcval_ = 22.5;
            pesoideal = imcval_ * (altura * altura);
            ppi = ((peso_kg * 100.0) / pesoideal);
            this.txt_pesoideal.setText(dfe.format(pesoideal));
            this.txt_porcentaje_ppi.setText(dfe.format(ppi));
        }

    }
}
