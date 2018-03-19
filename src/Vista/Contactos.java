
package Vista;

import Controlador.ConectarBD;
import Esquema.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Contactos extends javax.swing.JFrame {

    public Contactos() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBAnterior = new javax.swing.JButton();
        jBSiguiente = new javax.swing.JButton();
        JtxtSiguiente = new javax.swing.JTextField();
        JtxtAnterior = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JtxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JtxtEmaill = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JtxtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JtxtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JtxtApellido = new javax.swing.JTextField();
        jPanel_NombreB = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JtxtBuscarNombre = new javax.swing.JTextField();
        jBinsertar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAnterior.setText("Anterior");
        jBAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAnteriorMouseClicked(evt);
            }
        });
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(jBAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jBSiguiente.setText("Siguiente");
        jBSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSiguienteMouseClicked(evt);
            }
        });
        jBSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(jBSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));
        jPanel1.add(JtxtSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 40, 30));

        JtxtAnterior.setText("1");
        JtxtAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(JtxtAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 40, 30));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("Agenda Telefonica");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos contacto:"));

        jLabel2.setText("Nombres:");

        JtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Email/Correo:");

        JtxtEmaill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtEmaillActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono:");

        jLabel6.setText("Id");

        jLabel7.setText("Apellido");

        JtxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtApellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addComponent(JtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JtxtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(JtxtID, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(JtxtApellido))))
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JtxtEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtxtEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 330, 240));

        jPanel_NombreB.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Contacto:"));

        jLabel5.setText("Nombres:");

        javax.swing.GroupLayout jPanel_NombreBLayout = new javax.swing.GroupLayout(jPanel_NombreB);
        jPanel_NombreB.setLayout(jPanel_NombreBLayout);
        jPanel_NombreBLayout.setHorizontalGroup(
            jPanel_NombreBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NombreBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addComponent(JtxtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel_NombreBLayout.setVerticalGroup(
            jPanel_NombreBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_NombreBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_NombreBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JtxtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel_NombreB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 330, 80));

        jBinsertar.setText("Insertar");
        jBinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinsertarActionPerformed(evt);
            }
        });
        jPanel1.add(jBinsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ConectarBD con = new ConectarBD();
    Connection cn = con.ConectarDB();
    private void jBinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinsertarActionPerformed
        // TODO add your handling code here:
        int ID = Integer.parseInt(JtxtID.getText());
        String nombres = JtxtNombre.getText();
        String Apellidos= JtxtApellido.getText();
        String emailL = JtxtEmaill.getText();
        String teléfono = JtxtTelefono.getText();
        Persona registrar = new Persona(ID, nombres, emailL, teléfono);
        try {
            PreparedStatement insertar = cn.prepareStatement("INSERT INTO contactos(contacto_id,nombre,apellido,correo, telefono) VALUES(?,?,?,?,?)");
            insertar.setInt(1, ID);
            insertar.setString(2, nombres);
            insertar.setString(3, Apellidos);
            insertar.setString(4, emailL);
            insertar.setString(5, teléfono);
            int d = insertar.executeUpdate();
            if (d > 0) {
                JOptionPane.showMessageDialog(null, "   Registro Guardado");
                borrarDatos();
            } else {
                JOptionPane.showMessageDialog(null, "   Registro no  Guardado");
            }
        } catch (Exception e) {
            System.out.println("Datos no encontrados en la base de datos"+e);
        }
    }//GEN-LAST:event_jBinsertarActionPerformed
        void borrarDatos(){
        JtxtID.setText("");  
        JtxtNombre.setText("");
        JtxtApellido.setText("");
        JtxtEmaill.setText("");
        JtxtTelefono.setText("");
       
    }
    void consulta(String nombre){
        try {
            Statement comando = cn.createStatement();
            ResultSet registro = comando.executeQuery("select CONTACTO_ID,NOMBRE,APELLIDO,CORREO,TELEFONO from CONTACTOS where NOMBRE='" + nombre+"'");
            if (registro.next() == true) {
                JtxtID.setText(registro.getString("CONTACTO_ID"));
                JtxtNombre.setText(registro.getString("NOMBRE"));
                JtxtApellido.setText(registro.getString("APELLIDO"));
                JtxtEmaill.setText(registro.getString("CORREO"));
                JtxtTelefono.setText(registro.getString("TELEFONO"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un artículo con dicho código");
            }
            cn.close();
        } catch (SQLException ex) {
            setTitle(ex.toString());
        }
    }
    
    void consultaId(int ID){
        try {
            Statement comando = cn.createStatement();
            ResultSet registro = comando.executeQuery("select *from CONTACTOS where Contacto_ID = " + ID +" ");
            if (registro.next() == true) { 
                JtxtID.setText(registro.getString("CONTACTO_ID"));
                JtxtNombre.setText(registro.getString("NOMBRE"));
                JtxtApellido.setText(registro.getString("APELLIDO"));
                JtxtEmaill.setText(registro.getString("CORREO"));
                JtxtTelefono.setText(registro.getString("TELEFONO"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un registro con ese nombre");
            }
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        consulta(JtxtBuscarNombre.getText().trim());
    }//GEN-LAST:event_jBBuscarActionPerformed
    int n;
    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        // TODO add your handling code here:
        n=Integer.parseInt(JtxtAnterior.getText().trim());
        consultaId(n);
        n=n-1;
        JtxtAnterior.setText(String.valueOf(n));
        
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteActionPerformed
        // TODO add your handling code here:
        
        n=Integer.parseInt(JtxtAnterior.getText().trim());//el metodo trim quita los estapios
        consultaId(n);
        n=n+1;
        JtxtSiguiente.setText(String.valueOf(n));
        JtxtAnterior.setText(String.valueOf(n));
    }//GEN-LAST:event_jBSiguienteActionPerformed

    private void JtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtNombreActionPerformed

    private void JtxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtApellidoActionPerformed

    private void JtxtEmaillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtEmaillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtEmaillActionPerformed
     //evento de raton por clik
    private void jBSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSiguienteMouseClicked
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jBSiguienteMouseClicked

    private void jBAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAnteriorMouseClicked
       
        //TODO add your handling code here:
    }//GEN-LAST:event_jBAnteriorMouseClicked

    private void JtxtAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtAnteriorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contactos().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtxtAnterior;
    private javax.swing.JTextField JtxtApellido;
    private javax.swing.JTextField JtxtBuscarNombre;
    private javax.swing.JTextField JtxtEmaill;
    private javax.swing.JTextField JtxtID;
    private javax.swing.JTextField JtxtNombre;
    private javax.swing.JTextField JtxtSiguiente;
    private javax.swing.JTextField JtxtTelefono;
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JButton jBinsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_NombreB;
    // End of variables declaration//GEN-END:variables
}
