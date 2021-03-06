
package vistas;

import Conector.usuarios;
import db.conexion;
import static db.conexion.conexion_login;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Dewri
 */
public class funciones_usuario extends javax.swing.JFrame {

    public funciones_usuario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        en_id = new javax.swing.JTextField();
        boton_actualiza = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        en_nombre = new javax.swing.JTextField();
        en_apellido = new javax.swing.JTextField();
        en_telefono = new javax.swing.JTextField();
        en_correo = new javax.swing.JTextField();
        boton_atras = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        en_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        en_contra = new javax.swing.JPasswordField();
        en_contra2 = new javax.swing.JPasswordField();
        boton_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_actualiza.setBackground(new java.awt.Color(153, 255, 153));
        boton_actualiza.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        boton_actualiza.setText("Actualizar");
        boton_actualiza.setPreferredSize(new java.awt.Dimension(93, 25));
        boton_actualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizaActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Haettenschweiler", 0, 20)); // NOI18N
        txt1.setText("Registro");

        boton_atras.setBackground(new java.awt.Color(153, 255, 153));
        boton_atras.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        boton_atras.setText("Atras");
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        txt2.setText("Nombre:");

        txt3.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        txt3.setText("Apellido:");

        txt4.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        txt4.setText("Telefono:");

        txt5.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        txt5.setText("Correo:");

        txt6.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        txt6.setText("Contrase??a:");

        txt7.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        txt7.setText("Confirme contrase??a:");

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        jLabel1.setText("Nombre de usuario:");

        boton_eliminar.setBackground(new java.awt.Color(204, 255, 204));
        boton_eliminar.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        boton_eliminar.setText("Eliminar");
        boton_eliminar.setPreferredSize(new java.awt.Dimension(80, 25));
        boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(en_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(en_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(en_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(en_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt5)
                            .addComponent(txt6)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(en_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(en_contra)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(en_contra2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boton_atras)
                        .addGap(18, 18, 18)
                        .addComponent(boton_actualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2)
                    .addComponent(en_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3)
                    .addComponent(en_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4)
                    .addComponent(en_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(en_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5)
                    .addComponent(en_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6)
                    .addComponent(en_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7)
                    .addComponent(en_contra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton_atras)
                        .addComponent(boton_actualiza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //boton de registro
    private void boton_actualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizaActionPerformed
        conexion objconexion = new conexion();
        usuarios nusuario =  atrapar_datos();
        String centenciasql = String.format("UPDATE personas SET nombre='%s', apellido='%s', tel='%s', correo='%s', nom_usuario='%s',contra= '%s',contra_2='%s' WHERE id=%d"
                ,nusuario.getNombre(),nusuario.getApellido(),nusuario.getTel(),nusuario.getCorreo(),nusuario.getNom_usuario(),nusuario.getContr(),nusuario.getContr2(),nusuario.getId());
        objconexion.provar_centencia(centenciasql);
        menu_usuarios obj = new menu_usuarios();
        obj.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_boton_actualizaActionPerformed

    private void boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarActionPerformed
        eliminar_datos();
    }//GEN-LAST:event_boton_eliminarActionPerformed

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        menu_usuarios obj = new menu_usuarios();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_atrasActionPerformed
    
    ///Seleciona los datos para despues usarse 
    public usuarios atrapar_datos(){
        usuarios nusuario = new usuarios();
        int id =(en_id.getText().isEmpty())?0 : Integer.parseInt(en_id.getText());
        if(en_contra.getText().equals( en_contra2.getText())){
            nusuario.setId(id);
            nusuario.setNombre(en_nombre.getText());
            nusuario.setApellido(en_apellido.getText());
            nusuario.setTel(en_telefono.getText());
            nusuario.setCorreo(en_correo.getText());
            nusuario.setNom_usuario(en_usuario.getText());
            nusuario.setContr(en_contra.getText());
            nusuario.setContr2(en_contra2.getText());
            return nusuario;
        }else{
            JOptionPane.showMessageDialog(null, "La contrase??as no coinsiden", "Error",JOptionPane.WARNING_MESSAGE);
            
        }
        
        return nusuario;
    }
     ///Muestra los datos para editas
    public void mostrar_datos(String[] datos,int pasaid){
        String id = String.valueOf(pasaid);
        en_id.setText(id);
        en_nombre.setText(datos[0]);
        en_apellido.setText(datos[1]);
        en_telefono.setText(datos[2]);
        en_correo.setText(datos[3]);
        en_usuario.setText(datos[4]);
        en_contra.setText(datos[5]);
        en_contra2.setText(datos[6]);
        
    }
    
    //Eliminar datos 
    public void eliminar_datos(){
        conexion objconexion = new conexion();
        usuarios nusuario =  atrapar_datos();
        String centenciasql = String.format("DELETE FROM personas WHERE id =%d",nusuario.getId());
        objconexion.provar_centencia(centenciasql); 
        menu_usuarios obj = new menu_usuarios();
        obj.setVisible(true);
        this.dispose();
    }
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
            java.util.logging.Logger.getLogger(registro_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro_persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro_persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_actualiza;
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton boton_eliminar;
    private javax.swing.JTextField en_apellido;
    private javax.swing.JPasswordField en_contra;
    private javax.swing.JPasswordField en_contra2;
    private javax.swing.JTextField en_correo;
    private javax.swing.JTextField en_id;
    private javax.swing.JTextField en_nombre;
    private javax.swing.JTextField en_telefono;
    private javax.swing.JTextField en_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    // End of variables declaration//GEN-END:variables
}
