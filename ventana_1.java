
package Examen;


public class ventana extends javax.swing.JFrame {

   
    public ventana() {
        initComponents();
        horas_Semanales.setVisible(false);
        labelIngrese.setVisible(false);
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        profesorPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProfesorPU").createEntityManager();
        profesorQuery = java.beans.Beans.isDesignTime() ? null : profesorPUEntityManager.createQuery("SELECT p FROM Profesor p");
        profesorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : profesorQuery.getResultList();
        primario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tiempoParcial = new javax.swing.JRadioButton();
        tiempoCompleto = new javax.swing.JRadioButton();
        tiempoMedio = new javax.swing.JRadioButton();
        NOMBRES = new javax.swing.JTextField();
        APELLIDO = new javax.swing.JTextField();
        HORAS = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        CARRERA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        horas_Semanales = new javax.swing.JFormattedTextField();
        labelIngrese = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INGRESO DE PROFESORES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setText("CEDULA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("NOMBRES:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setText("APELLIDOS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setText("NUMERO DE HORAS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel6.setText("CARRERA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        buttonGroup1.add(tiempoParcial);
        tiempoParcial.setText("PARCIAL");
        tiempoParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoParcialActionPerformed(evt);
            }
        });
        tiempoParcial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tiempoParcialKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tiempoParcialKeyReleased(evt);
            }
        });
        getContentPane().add(tiempoParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        buttonGroup1.add(tiempoCompleto);
        tiempoCompleto.setText("COMPLETO");
        tiempoCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoCompletoActionPerformed(evt);
            }
        });
        getContentPane().add(tiempoCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        buttonGroup1.add(tiempoMedio);
        tiempoMedio.setText("MEDIO");
        tiempoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoMedioActionPerformed(evt);
            }
        });
        getContentPane().add(tiempoMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        getContentPane().add(NOMBRES, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, -1));
        getContentPane().add(APELLIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 180, -1));
        getContentPane().add(HORAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 180, -1));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 180, -1));
        getContentPane().add(CARRERA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 180, -1));

        jLabel7.setText("ESCOJA EL TIPO DE PROFESOR:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        getContentPane().add(horas_Semanales, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 190, 20));

        labelIngrese.setText("Ingrese numero de horas semanales");
        getContentPane().add(labelIngrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 60, -1));

        jButton2.setText("AGREGAR PROFESOR:");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 140, -1));

        jButton3.setText("VISUALIZAR PROFESOR:");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 150, -1));

        jButton4.setText("EDITAR PROFESOR:");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tiempoCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoCompletoActionPerformed
horas_Semanales.setVisible(false);
           labelIngrese.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoCompletoActionPerformed

    private void tiempoMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoMedioActionPerformed
horas_Semanales.setVisible(false);
           labelIngrese.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoMedioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tiempoParcialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempoParcialKeyPressed
             // TODO add your handling code here:
    }//GEN-LAST:event_tiempoParcialKeyPressed

    private void tiempoParcialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempoParcialKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoParcialKeyReleased

    private void tiempoParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoParcialActionPerformed
       if(tiempoParcial.isSelected()){
           horas_Semanales.setVisible(true);
        labelIngrese.setVisible(true);
       }
        
        
           // TODO add your handling code here:
    }//GEN-LAST:event_tiempoParcialActionPerformed

    ProfesorTiempoParcial profparcial = new ProfesorTiempoParcial();
    ProfesorTiempoCompleto profcompleto = new ProfesorTiempoCompleto();
    ProfesorMedioTiempo profmedio = new ProfesorMedioTiempo();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            Profesores prof = new Profesores();
            Lista controlador = new Lista();
            String n="";
            if(tiempoParcial.isSelected()){
                profparcial = new ProfesorTiempoParcial();
                profparcial.setHorasSemanales(Integer.parseInt(horas_Semanales.getText()));
                prof.horasComplementarias(profparcial);
               n="tiempoParcial";
            }
            if(tiempoCompleto.isSelected()){
                profcompleto = new ProfesorTiempoCompleto();
               prof.horasComplementarias(profcompleto);
               n= "tiempoCompleto";
               
            }
            if(tiempoMedio.isSelected()){
                profmedio = new ProfesorMedioTiempo();
                prof.horasComplementarias(profmedio);
                n="tiempoMedio";
            }
            prof= new Profesores(ID.getText(), NOMBRES.getText(), APELLIDO.getText(), Integer.parseInt(HORAS.getText()), CARRERA.getText(), n);
            controlador.grabarProfesor(prof);
            
            
            
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       VentanaP visualizar = new  VentanaP();
        visualizar.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           NOMBRES.setEnabled(false);
           APELLIDO.setEnabled(false);
           HORAS.setEnabled(false);
           CARRERA.setEnabled(false);
           
           
           
           
           // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APELLIDO;
    private javax.swing.JTextField CARRERA;
    private javax.swing.JTextField HORAS;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField NOMBRES;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField horas_Semanales;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelIngrese;
    private javax.swing.JLabel primario;
    private java.util.List<Examen.profesor> profesorList;
    private javax.persistence.EntityManager profesorPUEntityManager;
    private javax.persistence.Query profesorQuery;
    private javax.swing.JRadioButton tiempoCompleto;
    private javax.swing.JRadioButton tiempoMedio;
    private javax.swing.JRadioButton tiempoParcial;
    // End of variables declaration//GEN-END:variables
}
