package vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import controlador.control_pacientes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.Pacientes;

public class ficha_pacientesview extends javax.swing.JInternalFrame {

    int obteneridciudadcombo = 0;

    public ficha_pacientesview() {
        initComponents();
        this.setSize(new Dimension(860, 427));
        this.setTitle("FICHA PACIENTES");
        //this.CargarComboBoxCiudades();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        archivo1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(860, 427));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("FICHA PACIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel2.setText("C.I.N°:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jTextField1.setEnabled(false);
        jTextField1.setFocusable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 200, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 100, -1));

        jTextField3.setEnabled(false);
        jTextField3.setFocusable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 200, -1));

        jLabel3.setText("PACIENTE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setText("ANALISIS LABORATORIALES:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jButton1.setText("SELECCIONAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 150, -1));
        getContentPane().add(archivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 140, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 530, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser fc = new JFileChooser();
       int seleccion = fc.showOpenDialog(this);
       if(seleccion == JFileChooser.APPROVE_OPTION){
           File fichero = fc.getSelectedFile();
           archivo1.setText(fichero.getAbsolutePath());
           try(FileReader fr = new FileReader(fichero)){
               String cadena = "";
               int valor = fr.read();
               while(valor != -1){
                   cadena = cadena + (char) valor;
                   valor = fr.read();
               }
               this.jTextArea1.setText(cadena);
                    
           }catch (IOException el){
               el.printStackTrace();
           }
   
       }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField archivo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    

    

    /*private void CargarComboBoxCiudades() {
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
*/
}
