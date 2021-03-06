
package vistas;

import Conector.almacen;
import db.conexion;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javier
 */
public class menu_almacen extends javax.swing.JFrame {
    DefaultTableModel modelo;

    
    public menu_almacen() {
        initComponents();
        
        String[]columnas={"ID","Nombre","Marca","Categoria","Precio","Catidad"};
        modelo = new DefaultTableModel(null,columnas);
        tabla_almacen.setModel(modelo);
        
        mostrar_datos();
    }
    //muestra los datos en la tabla 
    public void mostrar_datos(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        conexion objconexion = new conexion();
         try {
            ResultSet pregunta = objconexion.consulta("SELECT * FROM almacen");
            while (pregunta.next()) {
                
                Object[] nusuario={pregunta.getString("id"),pregunta.getString("nombre"),pregunta.getString("marca"),
                pregunta.getString("categoria"),pregunta.getString("precio"),pregunta.getString("cantidad")};
                
                modelo.addRow(nusuario);
            }
        } catch (Exception e) {
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_almacen = new javax.swing.JTable();
        boton_atras = new javax.swing.JButton();
        boton_nuevo = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_almacen.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_almacenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_almacen);

        boton_atras.setText("Atras");
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });

        boton_nuevo.setText("Nuevo");
        boton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevoActionPerformed(evt);
            }
        });

        txt1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevoActionPerformed
        registro_almacen obj = new registro_almacen();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_nuevoActionPerformed

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        menu obj = new menu();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_atrasActionPerformed

    private void tabla_almacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_almacenMouseClicked
        almacen mproducto = new almacen();
        funciones_almacen  rt = new funciones_almacen();
        if(evt.getClickCount()==1){
            JTable receptor = (JTable)evt.getSource();
            
            String id =(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            String precio =(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
            String cantidad = (receptor.getModel().getValueAt(receptor.getSelectedRow(),5).toString());
            int id2 = Integer.parseInt(id);
            int precio2 = Integer.parseInt(precio);
            int cantidad2 = Integer.parseInt(cantidad);
            
            mproducto.setId(id2);
            mproducto.setNombre(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            mproducto.setMarca(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
            mproducto.setCategoria(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
            mproducto.setPrecio(precio2);
            mproducto.setCantidad(cantidad2);
            
            String[] datosstr= new String[3];
            int[] datosint= new int[3];
            
            datosint[0]= mproducto.getId();
            datosint[1]= mproducto.getPrecio();
            datosint[2]= mproducto.getCantidad();
            datosstr[0]= mproducto.getNombre();
            datosstr[1]= mproducto.getMarca();
            datosstr[2]= mproducto.getCategoria();
            
            rt.mostrar_datos(datosstr, datosint);
            rt.setVisible(true);
            this.dispose();
            mostrar_datos();
            
    }//GEN-LAST:event_tabla_almacenMouseClicked

    
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
            java.util.logging.Logger.getLogger(menu_almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton boton_nuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_almacen;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
