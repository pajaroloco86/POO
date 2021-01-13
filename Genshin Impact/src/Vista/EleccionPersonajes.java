/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author José Fernando Chan
 */
public class EleccionPersonajes extends javax.swing.JFrame {

    /**
     * Creates new form EleccionPersonajes
     */
    public EleccionPersonajes() {
        initComponents();
        botonesTransparentes();
    }
    
    //Metodo que pone todos los botones transparente
    public void botonesTransparentes(){
    JBpersonaje1.setOpaque(false);
    JBpersonaje1.setContentAreaFilled(false);
    JBpersonaje1.setBorderPainted(false);
    
    JBpersonaje2.setOpaque(false);
    JBpersonaje2.setContentAreaFilled(false);
    JBpersonaje2.setBorderPainted(false);
    
    JBpersonaje3.setOpaque(false);
    JBpersonaje3.setContentAreaFilled(false);
    JBpersonaje3.setBorderPainted(false);
    
    JBpersonaje4.setOpaque(false);
    JBpersonaje4.setContentAreaFilled(false);
    JBpersonaje4.setBorderPainted(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBPer2 = new javax.swing.JButton();
        jLtitulo = new javax.swing.JLabel();
        JBpersonaje1 = new javax.swing.JButton();
        JBpersonaje2 = new javax.swing.JButton();
        JBpersonaje3 = new javax.swing.JButton();
        JBpersonaje4 = new javax.swing.JButton();
        JLfondo = new javax.swing.JLabel();

        jBPer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPer2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLtitulo.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLtitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLtitulo.setText("Elección personajes y armas");

        JBpersonaje1.setBackground(new java.awt.Color(0, 0, 0));
        JBpersonaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Agregar-personaje.png"))); // NOI18N
        JBpersonaje1.setMaximumSize(new java.awt.Dimension(140, 140));
        JBpersonaje1.setMinimumSize(new java.awt.Dimension(140, 140));
        JBpersonaje1.setPreferredSize(new java.awt.Dimension(140, 140));
        JBpersonaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBpersonaje1MouseClicked(evt);
            }
        });

        JBpersonaje2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Agregar-personaje.png"))); // NOI18N
        JBpersonaje2.setMaximumSize(new java.awt.Dimension(140, 140));
        JBpersonaje2.setMinimumSize(new java.awt.Dimension(140, 140));
        JBpersonaje2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBpersonaje2MouseClicked(evt);
            }
        });
        JBpersonaje2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpersonaje2ActionPerformed(evt);
            }
        });

        JBpersonaje3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Agregar-personaje.png"))); // NOI18N
        JBpersonaje3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBpersonaje3MouseClicked(evt);
            }
        });
        JBpersonaje3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpersonaje3ActionPerformed(evt);
            }
        });

        JBpersonaje4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Agregar-personaje.png"))); // NOI18N
        JBpersonaje4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBpersonaje4MouseClicked(evt);
            }
        });
        JBpersonaje4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpersonaje4ActionPerformed(evt);
            }
        });

        JLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/fondo_equipos.jpg"))); // NOI18N
        JLfondo.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLtitulo))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JBpersonaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(JBpersonaje3))
            .addGroup(layout.createSequentialGroup()
                .addGap(670, 670, 670)
                .addComponent(JBpersonaje4))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(JBpersonaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(JLfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JBpersonaje1, JBpersonaje2, JBpersonaje3, JBpersonaje4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLtitulo)
                .addGap(99, 99, 99)
                .addComponent(JBpersonaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(JBpersonaje3))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(JBpersonaje4))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(JBpersonaje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(JLfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JBpersonaje1, JBpersonaje2, JBpersonaje3, JBpersonaje4});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBpersonaje2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpersonaje2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBpersonaje2ActionPerformed

    private void JBpersonaje3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpersonaje3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBpersonaje3ActionPerformed

    private void JBpersonaje4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpersonaje4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBpersonaje4ActionPerformed

    private void JBpersonaje1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBpersonaje1MouseClicked
        // TODO add your handling code here:
        ListaPersonajes FRMListaPersonajes = new ListaPersonajes();
        FRMListaPersonajes.setVisible(true);
    }//GEN-LAST:event_JBpersonaje1MouseClicked

    private void jBPer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPer2ActionPerformed

    private void JBpersonaje2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBpersonaje2MouseClicked
        ListaPersonajes FRMLista = new ListaPersonajes();
        FRMLista.setVisible(true);
    }//GEN-LAST:event_JBpersonaje2MouseClicked

    private void JBpersonaje3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBpersonaje3MouseClicked
        // TODO add your handling code here:
        ListaPersonajes FRMListaPersonajes = new ListaPersonajes();
        FRMListaPersonajes.setVisible(true);
    }//GEN-LAST:event_JBpersonaje3MouseClicked

    private void JBpersonaje4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBpersonaje4MouseClicked
        // TODO add your handling code here:
        ListaPersonajes FRMListaPersonajes = new ListaPersonajes();
        FRMListaPersonajes.setVisible(true);
    }//GEN-LAST:event_JBpersonaje4MouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton JBpersonaje1;
    private javax.swing.JButton JBpersonaje2;
    private javax.swing.JButton JBpersonaje3;
    private javax.swing.JButton JBpersonaje4;
    private javax.swing.JLabel JLfondo;
    private javax.swing.JButton jBPer2;
    private javax.swing.JLabel jLtitulo;
    // End of variables declaration//GEN-END:variables
}
