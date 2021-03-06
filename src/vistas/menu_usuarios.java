
package vistas;

import Conector.usuarios;
import db.conexion;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Javier
 */
public class menu_usuarios extends javax.swing.JFrame {
    DefaultTableModel modelo;
    
    
    //constructor de de tabla
    public menu_usuarios() {
        initComponents();
        
        String[]columnas={"ID","Nombre","Apellido","Telefono","Correo","nombre de usuario","Contraseña","Contraseña"};
        modelo = new DefaultTableModel(null,columnas);
        tabla_usuarios.setModel(modelo);
        
        mostrar_datos();
    }
    
    //muestra los datos en la tabla 
    public void mostrar_datos(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        conexion objconexion = new conexion();
         try {
            ResultSet pregunta = objconexion.consulta("SELECT * FROM personas");
            while (pregunta.next()) {
                //System.out.println(pregunta.getString("nombre"));
                Object[] nusuario={pregunta.getString("id"),pregunta.getString("nombre"),pregunta.getString("apellido"),
                pregunta.getString("tel"),pregunta.getString("correo"),pregunta.getString("nom_usuario"),pregunta.getString("contra"),pregunta.getString("contra_2")};
                
                modelo.addRow(nusuario);
            }
        } catch (Exception e) {
        }
    }
    ////
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        boton_atras = new javax.swing.JButton();
        botton_registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_usuarios);

        boton_atras.setBackground(new java.awt.Color(153, 255, 153));
        boton_atras.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        boton_atras.setText("Atras");
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });

        botton_registrar.setBackground(new java.awt.Color(204, 255, 204));
        botton_registrar.setFont(new java.awt.Font("Haettenschweiler", 0, 15)); // NOI18N
        botton_registrar.setText("Registrar");
        botton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_registrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 20)); // NOI18N
        jLabel1.setText("Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(botton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Hace que se puedan selecionar elementos de la tabla 
    private void tabla_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuariosMouseClicked
        usuarios musuario = new usuarios();
        funciones_usuario rt = new funciones_usuario();
        if(evt.getClickCount()==1){
            JTable receptor = (JTable)evt.getSource();
            
            String id =(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            int id2 = Integer.parseInt(id);
            
            musuario.setId(id2);
            musuario.setNombre(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            musuario.setApellido(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
            musuario.setTel(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
            musuario.setCorreo(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
            musuario.setNom_usuario(receptor.getModel().getValueAt(receptor.getSelectedRow(),5).toString());
            musuario.setContr(receptor.getModel().getValueAt(receptor.getSelectedRow(),6).toString());
            musuario.setContr2(receptor.getModel().getValueAt(receptor.getSelectedRow(),7).toString());
            
            String[] datos = new String[7];
            int pasaid = musuario.getId();
            datos[0] = musuario.getNombre();
            datos[1] = musuario.getApellido();
            datos[2] = musuario.getTel();
            datos[3] = musuario.getCorreo();
            datos[4] = musuario.getNom_usuario();
            datos[5] = musuario.getContr();
            datos[6] = musuario.getContr2();
           
            rt.setVisible(true);
            this.dispose(); 
            rt.mostrar_datos(datos,pasaid);
            mostrar_datos();
            
        }
        
    }//GEN-LAST:event_tabla_usuariosMouseClicked

    private void botton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_registrarActionPerformed
        registro_persona obj = new registro_persona();
        obj.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_botton_registrarActionPerformed

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        menu obj = new menu();
        obj.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_boton_atrasActionPerformed
   
    //Elimina datos 
    
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
            java.util.logging.Logger.getLogger(menu_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton botton_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}
