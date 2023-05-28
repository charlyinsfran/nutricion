package vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexion.conexion;
import controlador.control_pacientes;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Pacientes;

public class internal_pacientes_view extends javax.swing.JInternalFrame {
    
    private int idpacientes;
    private int obteneridciudadcombo = 0;
    
    public internal_pacientes_view() {
        initComponents();
        this.setSize(new Dimension(997, 596));
        this.setTitle("Gestionar Pacientes");
        this.CargarTablaPacientes();
        this.cargarcomboboxciudades();
        this.deshabilitar_botones();
        this.deshabilitarcampos();

        //establecer una imagen de fondo----------------------------------------------------
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jlabel_wallpaper.setIcon(icono);
        this.repaint();
        //----------------------------------------------------------------------------------

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jlabel_wallpaper = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_ocupacion = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        jComboBox_estadocivil = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTABLE_PACIENTES = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(997, 596));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRAR PACIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_actualizar.setBackground(new java.awt.Color(51, 204, 0));
        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 130, 80));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 920, 120));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("DIRECCION:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 270, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("TELEFONO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Ocupacion:");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("CORREO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("APELLIDO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("C.I / RUC:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("CIUDAD:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ESTADO CIVIL:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 130, -1));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 420, -1));

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 130, -1));

        txt_ocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ocupacionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 500, 30));

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 160, -1));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 160, -1));

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 190, -1));

        jComboBox_estadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Estado Civil:", "Soltero", "Casado", "Divorciado", "Viudo", "Union Libre" }));
        getContentPane().add(jComboBox_estadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 190, 25));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ciudad:" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 190, 25));

        JTABLE_PACIENTES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTABLE_PACIENTES.setFocusable(false);
        jScrollPane1.setViewportView(JTABLE_PACIENTES);
        if (JTABLE_PACIENTES.getColumnModel().getColumnCount() > 0) {
            JTABLE_PACIENTES.getColumnModel().getColumn(0).setResizable(false);
            JTABLE_PACIENTES.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 820, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        /*if (txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty() || txt_cedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos obligatorios..");
        } else {
            Cliente cliente = new Cliente();
            CTR_Cliente controlcliente = new CTR_Cliente();

            cliente.setNombre(txt_nombre.getText().trim());
            cliente.setApellido(txt_apellido.getText().trim());
            cliente.setCedula(Integer.parseInt(txt_cedula.getText()));
            cliente.setTelefono(txt_telefono.getText().trim());
            cliente.setDireccion(txt_direccion.getText().trim());
            cliente.setCorreo(txt_correo.getText().trim());

            if (controlcliente.actualizar(cliente, idClientes)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado..");
                this.deshabilitar_botones();
                this.LimpiarCampos();
                this.deshabilitarcampos();
                this.CargarTablaClientes();
            } else {

                JOptionPane.showMessageDialog(null, "Error al guardar");

            }

        }*/
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        /* int respuesta = JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar el registro?", "Confirm", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            Cliente cliente = new Cliente();
            CTR_Cliente controlcliente = new CTR_Cliente();

            if (idClientes == 0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente..");

            } else {
                if (!controlcliente.eliminar(idClientes)) {
                    JOptionPane.showMessageDialog(null, "Eliminado");
                    this.deshabilitar_botones();
                    this.LimpiarCampos();
                    this.deshabilitarcampos();
                    this.CargarTablaClientes();

                } else {
                }
            }

        } else if (respuesta == JOptionPane.NO_OPTION) {
            internal_pacientes_view formulario = new internal_pacientes_view();
            formulario.initComponents();
            this.deshabilitar_botones();
            this.deshabilitarcampos();
            this.LimpiarCampos();

        }

         */
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_ocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ocupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ocupacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable JTABLE_PACIENTES;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox_estadocivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel_wallpaper;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_ocupacion;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
        
    String descripcionciudad;

    private void CargarTablaPacientes() {
        Connection con = (Connection) conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT p.idpacientes,p.nombre,p.apellido,p.cedula,p.direccion,p.telefono,p.correo,\n"
                + "p.estadocivil,p.ocupacion,c.descripcion FROM pacientes p, ciudades c where p.ciudades_idciudades = c.idciudades;";
        Statement st;
        
        try {
            st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            internal_pacientes_view.JTABLE_PACIENTES = new JTable(model);
            internal_pacientes_view.jScrollPane1.setViewportView(internal_pacientes_view.JTABLE_PACIENTES);
            
            model.addColumn("Codigo");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("C.I / RUC");
            model.addColumn("Direccion");
            model.addColumn("Telefono");
            model.addColumn("Correo");
            model.addColumn("Estado Civil");
            model.addColumn("Ocupacion");
            model.addColumn("Ciudad");
            
            while (rs.next()) {
                Object fila[] = new Object[10];
                
                for (int i = 0; i < 10; i++) {
                    
                    fila[i] = rs.getObject(i + 1);
                }
                
                model.addRow(fila);
            }
            
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar grilla + e");
        }
        
        JTABLE_PACIENTES.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = JTABLE_PACIENTES.rowAtPoint(e.getPoint());
                int columna_point = 0;
                habilitarcampos();
                habilitar_botones();
                if (fila_point > -1) {
                    idpacientes = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosClienteSeleccionado(idpacientes);
                }
            }
        });
        
    }
    
    private void EnviarDatosClienteSeleccionado(int idpacientes) {
        try {
            Connection con = (Connection) conexion.conectar();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement("select * from pacientes where idpacientes = '" + idpacientes
                    + "'");
            
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                this.txt_nombre.setText(rs.getString("nombre"));
                this.txt_apellido.setText(rs.getString("apellido"));
                this.txt_cedula.setText(rs.getString("cedula"));
                this.txt_telefono.setText(rs.getString("telefono"));
                this.txt_direccion.setText(rs.getString("direccion"));
                this.txt_correo.setText(rs.getString("correo"));
                /*---------------------------------------------------------------*/
                int ciudad = rs.getInt("ciudades_idciudades");
                this.jComboBox1.setSelectedItem(relacionarcategorias(ciudad));
                
                String estadocivil = rs.getString("estadocivil");
                
                switch (estadocivil) {
                    case "Soltero":
                        this.jComboBox_estadocivil.setSelectedItem("Soltero");
                        break;
                    
                    case "Casado":
                        this.jComboBox_estadocivil.setSelectedItem("Casado");
                        break;
                    
                    case "Divorciado":
                        this.jComboBox_estadocivil.setSelectedItem("Divorciado");
                        break;
                    
                    case "Viudo":
                        this.jComboBox_estadocivil.setSelectedItem("Viudo");
                        break;
                    
                    case "Union Libre":
                        this.jComboBox_estadocivil.setSelectedItem("Union Libre");
                        break;                    
                    
                    default:
                        this.jComboBox_estadocivil.setSelectedItem("Seleccione Estado Civil:");
                        break;
                }
                /*-----------------------------------------------------------------------------*/
                
                
                this.txt_ocupacion.setText(rs.getString("ocupacion"));
                
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar categoria");
        }
    }
    
    private String relacionarcategorias(int ideciudad) {
        
        String sql = "Select descripcion from ciudades where idciudades ='" + ideciudad + "'";
        Statement st;
        
        try {
            Connection cn = (Connection) conexion.conectar();
            st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                descripcionciudad = rs.getString("descripcion");
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Error al obtener el id de categorias");
        }
        return descripcionciudad;
    }
    
    public void cargarcomboboxciudades() {
        Connection con = (Connection) conexion.conectar();
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
            System.out.println("Error al cargar ciudades");
        }
    }
    
    private void LimpiarCampos() {
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_cedula.setText("");
        this.txt_telefono.setText("");
        this.txt_direccion.setText("");
        this.txt_correo.setText("");
        this.txt_ocupacion.setText("");
        this.jComboBox1.setSelectedItem("Seleccione ciudad:");
        this.jComboBox_estadocivil.setSelectedItem("Seleccione Estado Civil:");
    }
    
    public void habilitar_botones() {
        this.btn_actualizar.setEnabled(true);
        this.btn_eliminar.setEnabled(true);
    }
    
    private void deshabilitar_botones() {
        this.btn_actualizar.setEnabled(false);
        this.btn_eliminar.setEnabled(false);
    }
    
    private void deshabilitarcampos() {
        this.txt_nombre.setEnabled(false);
        this.txt_apellido.setEnabled(false);
        this.txt_cedula.setEnabled(false);
        this.txt_telefono.setEnabled(false);
        this.txt_direccion.setEnabled(false);
        this.txt_correo.setEnabled(false);
        this.txt_ocupacion.setEnabled(false);
    }
    
    public void habilitarcampos() {
        
        this.txt_nombre.setEnabled(true);
        this.txt_apellido.setEnabled(true);
        this.txt_cedula.setEnabled(true);
        this.txt_telefono.setEnabled(true);
        this.txt_direccion.setEnabled(true);
        this.txt_correo.setEnabled(true);
        this.txt_ocupacion.setEnabled(true);
        
    }
    
}
