/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clases.Dominio;
import Modelos.ArmasModelo;
import Clases.armas;
import Controlador.Iniciador;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
        botonesConfiguracion();
    }
    
    //Metodo que pone todos los botones transparente
    public void botonesConfiguracion(){
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
    
    JBsiguiente.setVisible(false);
    
    }
    
    //Sobreescribimos el metodo repaint para que carge los avatares
    public void repaint(){
        cargaIconos();
        cargaListaArmas();
        estadoBotonSiguiente();
    }
    
    //Metodo que carga los iconos de los personajes de ser necesario
    public void cargaIconos(){
        //Ruta predefinida para todos los avatares
        String defaultPath = "/Imagenes/Avatares/";
        //Variable que sirve para generar la ruta completa para los avatares
        URL url;
        //Variable que carga la imagen
        BufferedImage img;
        
        try {
            //Creamos la ruta completa de la imagen
            url = EleccionPersonajes.class.getResource(defaultPath+Iniciador.equipo[0].getNombre()+".png");
            //Cargamos la imagen
            img = ImageIO.read(url);
            //Enviamos como un icono
            JBpersonaje1.setIcon(new ImageIcon(img));
            
            //Creamos la ruta completa de la imagen
            url = EleccionPersonajes.class.getResource(defaultPath+Iniciador.equipo[1].getNombre()+".png");
            //Cargamos la imagen
            img = ImageIO.read(url);
            //Enviamos como un icono
            JBpersonaje2.setIcon(new ImageIcon(img));
            
            //Creamos la ruta completa de la imagen
            url = EleccionPersonajes.class.getResource(defaultPath+Iniciador.equipo[2].getNombre()+".png");
            //Cargamos la imagen
            img = ImageIO.read(url);
            //Enviamos como un icono
            JBpersonaje3.setIcon(new ImageIcon(img));
            
            //Creamos la ruta completa de la imagen
            url = EleccionPersonajes.class.getResource(defaultPath+Iniciador.equipo[3].getNombre()+".png");
            //Cargamos la imagen
            img = ImageIO.read(url);
            //Enviamos como un icono
            JBpersonaje4.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            //Se lanza si no se encontro la ruta del archivo
        }

    }
    
    //Metodo que carga las armas en los ComboBox
    public void cargaListaArmas(){
        /**
         * Revizamos que el personaje "porDefecto" no se encuentra en alguna 
         * posicion dentro del arreglo "equipo", donde no se encuentre, cargamos
         * el vector de armas en el respectivo ComboBox
         */
        if(!(Iniciador.equipo[0].getNombre().equals("Agregar"))){
            ArmasModelo.inicializarListaArmas(JCBArma1, 0);
        }
        if(!(Iniciador.equipo[1].getNombre().equals("Agregar"))){
            ArmasModelo.inicializarListaArmas(JCBArma2, 1);
        }
        if(!(Iniciador.equipo[2].getNombre().equals("Agregar"))){
            ArmasModelo.inicializarListaArmas(JCBArma3, 2);
        }
        if(!(Iniciador.equipo[3].getNombre().equals("Agregar"))){
            ArmasModelo.inicializarListaArmas(JCBArma4, 3);
        }
    }
    
    //Metodo que activa el boton de siguiente si ya se llenaron todos los campos
    public void estadoBotonSiguiente(){
        Boolean verificador=false;
        
        /**
         * Mediante el personaje "porDefecto" podemos saber si ya se
         * seleccionaron los 4 personajes que conforman el equipo
         */
        
        for(int i=0; i<4;i++){
            if(Iniciador.equipo[i].getNombre().equals("Agregar")){
                /**
                 * Si encuentra al personaje "porDefecto" se sale del ciclo
                 * y no muestra el boton
                 */
                i=10;
                verificador = false;
            }else{
                verificador = true;
            }
        }
        JBsiguiente.setVisible(verificador);
    }
    
    //Metodo para obtener el arma que el usuario selecciono
    public armas obtenerArma(JComboBox seleccionador){
        //Obtenemos el nombre del arma escogida
        String nombreArma = seleccionador.getSelectedItem().toString();
        armas armaEscogida = new armas();
        
        //Metodo que recorre el arreglo de todas las armas
        for(int i=0; i<Iniciador.armasListaCompleta.length; i++){
            if(nombreArma.equals(Iniciador.armasListaCompleta[i].getNombreArma())){
                /**
                 * Si los nombres coinciden, entonces tenemos el objeto a retornar
                 * y podemos salir del ciclo
                 */
                armaEscogida = Iniciador.armasListaCompleta[i];
                i=100;
            }
        }
        return armaEscogida;
    }
    
    public void inicializarArrayDominios(){
        /**
         * Como el arreglo aun no tiene elementos, agregamos los dominios del
         * primer miembro del equipo
         */
        Iniciador.listaDominios.add(new Dominio(Iniciador.equipo[0].getNombreDominioTalentos(),1));
        Iniciador.listaDominios.add(new Dominio(Iniciador.equipo[0].getArma().getNombreDominioMejora(),1));

        //Ciclo que recorre a los miembros faltantes del equipo 
        for(int i=1; i<Iniciador.equipo.length; i++){
            //Primero vemos los dominios de los talentos
            //Ciclo que recorre a todos los miembros del arreglo
            int tamañoArray=Iniciador.listaDominios.size();
            for(int j=0; j<tamañoArray; j++){
                if(Iniciador.listaDominios.get(j).getNombre().contains(Iniciador.equipo[i].getNombreDominioTalentos())){
                    //Si el nombre del dominio se encuentra dentro del arreglo, al contador se le agrega 1 
                    Iniciador.listaDominios.get(j).setFrecuencia(Iniciador.listaDominios.get(j).getFrecuencia()+1);
                    //Salimos del ciclo
                    j=100;
                }else if(j==(Iniciador.listaDominios.size()-1)){
                    //Si ya comprobo que no se encuentra el nombre dentro del arreglo, se agrega
                    Iniciador.listaDominios.add(new Dominio(Iniciador.equipo[i].getNombreDominioTalentos(),1));
                    //FIX temporal
                  
                }
            }
            //Hacmos lo mismo para los dominios de armas
            //Ciclo que recorre a todos los miembros del arreglo
             tamañoArray=Iniciador.listaDominios.size();
            for(int k=0; k<tamañoArray; k++){
                if(Iniciador.listaDominios.get(k).getNombre().contains(Iniciador.equipo[i].getArma().getNombreDominioMejora())){
                    //Si el nombre del dominio se encuentra dentro del arreglo, al contador se le agrega 1 
                    Iniciador.listaDominios.get(k).setFrecuencia(Iniciador.listaDominios.get(k).getFrecuencia()+1);
                    //Salimos del ciclo
                    k=100;
                }else if(k==(Iniciador.listaDominios.size()-1)){
                    //Si ya comprobo que no se encuentra el nombre dentro del arreglo, se agrega
                    Iniciador.listaDominios.add(new Dominio(Iniciador.equipo[i].getArma().getNombreDominioMejora(),1));
                    //FIX temporal
                    k=100;
                    //FIX temporal
                }
            }
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLtitulo = new javax.swing.JLabel();
        JBpersonaje1 = new javax.swing.JButton();
        JCBArma1 = new javax.swing.JComboBox<>();
        JBpersonaje2 = new javax.swing.JButton();
        JCBArma2 = new javax.swing.JComboBox<>();
        JBpersonaje3 = new javax.swing.JButton();
        JCBArma3 = new javax.swing.JComboBox<>();
        JBpersonaje4 = new javax.swing.JButton();
        JCBArma4 = new javax.swing.JComboBox<>();
        JBsiguiente = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        JLfondo = new javax.swing.JLabel();

        jBPer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPer2ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLtitulo.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLtitulo.setText("Elección personajes y armas");
        getContentPane().add(jLtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        JBpersonaje1.setBackground(new java.awt.Color(0, 0, 0));
        JBpersonaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Avatares/Agregar.png"))); // NOI18N
        JBpersonaje1.setMaximumSize(new java.awt.Dimension(140, 140));
        JBpersonaje1.setMinimumSize(new java.awt.Dimension(140, 140));
        JBpersonaje1.setPreferredSize(new java.awt.Dimension(140, 140));
        JBpersonaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBpersonaje1MouseClicked(evt);
            }
        });
        getContentPane().add(JBpersonaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        JCBArma1.setLightWeightPopupEnabled(false);
        JCBArma1.setMaximumSize(new java.awt.Dimension(140, 26));
        JCBArma1.setMinimumSize(new java.awt.Dimension(140, 26));
        JCBArma1.setPreferredSize(new java.awt.Dimension(140, 26));
        getContentPane().add(JCBArma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        JBpersonaje2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Avatares/Agregar.png"))); // NOI18N
        JBpersonaje2.setMaximumSize(new java.awt.Dimension(140, 140));
        JBpersonaje2.setMinimumSize(new java.awt.Dimension(140, 140));
        JBpersonaje2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBpersonaje2MouseClicked(evt);
            }
        });
        getContentPane().add(JBpersonaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, 140));

        JCBArma2.setLightWeightPopupEnabled(false);
        JCBArma2.setMaximumSize(new java.awt.Dimension(140, 26));
        JCBArma2.setMinimumSize(new java.awt.Dimension(140, 26));
        JCBArma2.setPreferredSize(new java.awt.Dimension(140, 26));
        getContentPane().add(JCBArma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        JBpersonaje3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Avatares/Agregar.png"))); // NOI18N
        JBpersonaje3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBpersonaje3MouseClicked(evt);
            }
        });
        getContentPane().add(JBpersonaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, 140));

        JCBArma3.setLightWeightPopupEnabled(false);
        JCBArma3.setMaximumSize(new java.awt.Dimension(140, 26));
        JCBArma3.setMinimumSize(new java.awt.Dimension(140, 26));
        JCBArma3.setPreferredSize(new java.awt.Dimension(140, 26));
        getContentPane().add(JCBArma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        JBpersonaje4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Avatares/Agregar.png"))); // NOI18N
        JBpersonaje4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBpersonaje4MouseClicked(evt);
            }
        });
        getContentPane().add(JBpersonaje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, 140));

        JCBArma4.setLightWeightPopupEnabled(false);
        JCBArma4.setMaximumSize(new java.awt.Dimension(140, 26));
        JCBArma4.setMinimumSize(new java.awt.Dimension(140, 26));
        JCBArma4.setPreferredSize(new java.awt.Dimension(140, 26));
        getContentPane().add(JCBArma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        JBsiguiente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JBsiguiente.setText("Siguiente");
        JBsiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBsiguienteMouseClicked(evt);
            }
        });
        getContentPane().add(JBsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 100, 50));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Ayuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        JLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoEquipo.jpg"))); // NOI18N
        JLfondo.setText("jLabel1");
        JLfondo.setMinimumSize(new java.awt.Dimension(870, 470));
        getContentPane().add(JLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBpersonaje1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBpersonaje1MouseClicked
        // TODO add your handling code here:
        ListaPersonajes FRMListaPersonajes = new ListaPersonajes(0, this);
        FRMListaPersonajes.setVisible(true);
    }//GEN-LAST:event_JBpersonaje1MouseClicked

    private void jBPer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPer2ActionPerformed

    private void JBpersonaje2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBpersonaje2MouseClicked
        ListaPersonajes FRMLista = new ListaPersonajes(1, this);
        FRMLista.setVisible(true);
    }//GEN-LAST:event_JBpersonaje2MouseClicked

    private void JBpersonaje3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBpersonaje3MouseClicked
        // TODO add your handling code here:
        ListaPersonajes FRMListaPersonajes = new ListaPersonajes(2, this);
        FRMListaPersonajes.setVisible(true);
    }//GEN-LAST:event_JBpersonaje3MouseClicked

    private void JBpersonaje4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBpersonaje4MouseClicked
        // TODO add your handling code here:
        ListaPersonajes FRMListaPersonajes = new ListaPersonajes(3, this);
        FRMListaPersonajes.setVisible(true);
    }//GEN-LAST:event_JBpersonaje4MouseClicked

    private void JBsiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBsiguienteMouseClicked
        //Ponemos las armas seleccionadas a todos personajes
        Iniciador.equipo[0].setArma(obtenerArma(JCBArma1));
        Iniciador.equipo[1].setArma(obtenerArma(JCBArma2));
        Iniciador.equipo[2].setArma(obtenerArma(JCBArma3));
        Iniciador.equipo[3].setArma(obtenerArma(JCBArma4));
        //Inicializamos el arreglo para la tabla de los dominios
        inicializarArrayDominios();
        
        
        //Inicializamos el frame de tabla
        TablaConsejo FRMTabla = new TablaConsejo();
        FRMTabla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBsiguienteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null,"Usted deberá elegir 4 personajes diferentes con una de sus armas para continuar");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBpersonaje1;
    private javax.swing.JButton JBpersonaje2;
    private javax.swing.JButton JBpersonaje3;
    private javax.swing.JButton JBpersonaje4;
    private javax.swing.JToggleButton JBsiguiente;
    private javax.swing.JComboBox<String> JCBArma1;
    private javax.swing.JComboBox<String> JCBArma2;
    private javax.swing.JComboBox<String> JCBArma3;
    private javax.swing.JComboBox<String> JCBArma4;
    private javax.swing.JLabel JLfondo;
    private javax.swing.JButton jBPer2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLtitulo;
    // End of variables declaration//GEN-END:variables
}
