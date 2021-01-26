/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;

/**
 *
 * @author José Fernando Chan
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLTitulo = new javax.swing.JLabel();
        JLSubtitulo1 = new javax.swing.JLabel();
        JLSubtitulo2 = new javax.swing.JLabel();
        JBsiguiente = new javax.swing.JToggleButton();
        JLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLTitulo.setFont(new java.awt.Font("Sitka Text", 1, 60)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(0, 0, 0));
        JLTitulo.setText("Bienvenido");
        getContentPane().add(JLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        JLSubtitulo1.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        JLSubtitulo1.setForeground(new java.awt.Color(0, 0, 0));
        JLSubtitulo1.setText("a consejería de resina");
        getContentPane().add(JLSubtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 280, 70));

        JLSubtitulo2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        JLSubtitulo2.setForeground(new java.awt.Color(0, 0, 0));
        JLSubtitulo2.setText("automática");
        getContentPane().add(JLSubtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 50));

        JBsiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JBsiguiente.setText("Siguiente");
        JBsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBsiguienteMouseClicked(evt);
            }
        });
        JBsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(JBsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 100, 50));

        JLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoPrincipal.jpg"))); // NOI18N
        getContentPane().add(JLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBsiguienteActionPerformed

    private void JBsiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBsiguienteMouseClicked
        // TODO add your handling code here:
        EleccionPersonajes FRMEleccion = new EleccionPersonajes();
        FRMEleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBsiguienteMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JBsiguiente;
    private javax.swing.JLabel JLFondo;
    private javax.swing.JLabel JLSubtitulo1;
    private javax.swing.JLabel JLSubtitulo2;
    private javax.swing.JLabel JLTitulo;
    // End of variables declaration//GEN-END:variables
}
