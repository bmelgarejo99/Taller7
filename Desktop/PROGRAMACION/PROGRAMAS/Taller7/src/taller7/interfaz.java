/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7;

/**
 *
 * @author Administrador
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jButton1.setText("MAZDA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CHEVROLET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("TOYOTA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("MERCEDEZ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("AUDI");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("RENAULT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("INICIE ELIGIENDO LA MARCA DEL CARRO AL CUAL DESEA SONSULTARLE EL IMPUESTO ANUAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(269, 269, 269)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         Mazda Audi = new Mazda();
        Audi.setLinea1("Q5 3.2");
        Audi.setLinea2("Q7 V6 3.0");
        Audi.setLinea3("TP 2000");
        Audi.setLinea4("A3 Atraction");
        Audi.setLinea5("Tt roaster");
        Audi.setAño1("desde 2000 al 2005");
        Audi.setAño2("desde 2006 al 2011");
        Audi.setAño3("desde 2012 al 2020");
        
        Audi.siguiente();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mazda mazda= new Mazda();
        mazda.siguiente();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Mazda chevrolet = new Mazda();
        chevrolet.setLinea1("tracker");
        chevrolet.setLinea2("aveo emotion");
        chevrolet.setLinea3("traiblazer");
        chevrolet.setLinea4("spark GT");
        chevrolet.setLinea5("Tracker");
        chevrolet.setAño1("desde 2000 al 2005");
        chevrolet.setAño2("desde 2006 al 2011");
        chevrolet.setAño3("desde 2012 al 2020");
        //
        chevrolet.setImpuestoo(1800000);
        chevrolet.setImpuestoo1(2000000);
        chevrolet.setImpuestoo2(2200000);
        //
       chevrolet.setImpuestooo(1400000);
       chevrolet.setImpuestooo1(1600000);
       chevrolet.setImpuestooo2(1800000);
       //
       chevrolet.setImpuestoooo(1800000);
       chevrolet.setImpuestoooo1(2300000);
       chevrolet.setImpuestoooo2(2800000);
       //
       chevrolet.setImpuestooooo(1300000);
       chevrolet.setImpuestooooo1(1500000);
       chevrolet.setImpuestooooo2(1700000);
       //
       chevrolet.setImpuesto6(1800000);
       chevrolet.setImpuestoo6(2000000);
       chevrolet.setImpuestooo6(2400000);
       
      chevrolet.setValor1(25000000);
       chevrolet.setValor12(32000000);
       chevrolet.setValor13(45000000);
       //   
       chevrolet.setValor2(15000000);
       chevrolet.setValor22(25000000);
       chevrolet.setValor23(43000000);
       //
           //   
       chevrolet.setValor3(25000000);
       chevrolet.setValor32(35000000);
       chevrolet.setValor33(50000000);
       //
           //   
       chevrolet.setValor4(16000000);
       chevrolet.setValor42(328000000);
       chevrolet.setValor43(35000000);
       //
           //   
       chevrolet.setValor5(32000000);
       chevrolet.setValor52(45000000);
       chevrolet.setValor53(65000000);
       //
        
        chevrolet.siguiente();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         Mazda toyota = new Mazda();
        toyota.setLinea1("runner");
        toyota.setLinea2("hilux");
        toyota.setLinea3("fortuner");
        toyota.setLinea4("sahara");
        toyota.setLinea5("prado TXL");
        toyota.setAño1("desde 1990 al 2000");
        toyota.setAño2("desde 2001 al 2011");
        toyota.setAño3("desde 2012 al 2020");
        
         //
        toyota.setImpuestoo(2000000);
        toyota.setImpuestoo1(2500000);
        toyota.setImpuestoo2(4000000);
        //
       toyota.setImpuestooo(2300000);
       toyota.setImpuestooo1(3000000);
       toyota.setImpuestooo2(3500000);
       //
       toyota.setImpuestoooo(2800000);
       toyota.setImpuestoooo1(3200000);
       toyota.setImpuestoooo2(3800000);
       //
       toyota.setImpuestooooo(4000000);
       toyota.setImpuestooooo1(4800000);
       toyota.setImpuestooooo2(5000000);
       //
       toyota.setImpuesto6(2800000);
       toyota.setImpuestoo6(3800000);
       toyota.setImpuestooo6(4300000);
       
       toyota.setValor1(80000000);
       toyota.setValor12(110000000);
       toyota.setValor13(150000000);
       //   
       toyota.setValor2(50000000);
       toyota.setValor22(85000000);
       toyota.setValor23(130000000);
       //
           //   
       toyota.setValor3(80000000);
       toyota.setValor32(100000000);
       toyota.setValor33(140000000);
       //
           //   
       toyota.setValor4(160000000);
       toyota.setValor42(200000000);
       toyota.setValor43(250000000);
       //
           //   
       toyota.setValor5(120000000);
       toyota.setValor52(160000000);
       toyota.setValor53(210000000);
       //
       
        toyota.siguiente();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         Mazda mercedez = new Mazda();
        mercedez.setLinea1("clase c 180");
        mercedez.setLinea2("clase cla cla 180");
        mercedez.setLinea3("A 200");
        mercedez.setLinea4("E 2.0");
        mercedez.setLinea5("clase A A 160");
        mercedez.setAño1("desde 1995 al 2004");
        mercedez.setAño2("desde 2005 al 2009");
        mercedez.setAño3("desde 2010 al 2020");
        
         //
        mercedez.setImpuestoo(2300000);
        mercedez.setImpuestoo1(2800000);
        mercedez.setImpuestoo2(3400000);
        //
       mercedez.setImpuestooo(2700000);
       mercedez.setImpuestooo1(3300000);
       mercedez.setImpuestooo2(3800000);
       //
       mercedez.setImpuestoooo(3300000);
       mercedez.setImpuestoooo1(3800000);
       mercedez.setImpuestoooo2(4200000);
       //
       mercedez.setImpuestooooo(3800000);
       mercedez.setImpuestooooo1(4500000);
       mercedez.setImpuestooooo2(4800000);
       //
       mercedez.setImpuesto6(3500000);
       mercedez.setImpuestoo6(3900000);
       mercedez.setImpuestooo6(4500000);
       
       mercedez.setValor1(50000000);
       mercedez.setValor12(85000000);
       mercedez.setValor13(100000000);
       //   
       mercedez.setValor2(80000000);
       mercedez.setValor22(110000000);
       mercedez.setValor23(150000000);
       //
           //   
       mercedez.setValor3(60000000);
       mercedez.setValor32(120000000);
       mercedez.setValor33(160000000);
       //
           //   
       mercedez.setValor4(80000000);
       mercedez.setValor42(140000000);
       mercedez.setValor43(180000000);
       //
           //   
       mercedez.setValor5(65000000);
       mercedez.setValor52(110000000);
       mercedez.setValor53(160000000);
       //
       
        mercedez.siguiente();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Mazda renaul = new Mazda();
        renaul.setLinea1("sandero");
        renaul.setLinea2("duster");
        renaul.setLinea3("oroch");
        renaul.setLinea4("Symbol 1.4");
        renaul.setLinea5("clio");
        renaul.setAño1("desde 1993 al 2001");
        renaul.setAño2("desde 2002 al 2014");
        renaul.setAño3("desde 2015 al 2020");
        
         //
        renaul.setImpuestoo(1600000);
        renaul.setImpuestoo1(1800000);
        renaul.setImpuestoo2(2000000);
        //
       renaul.setImpuestooo(1800000);
       renaul.setImpuestooo1(2000000);
       renaul.setImpuestooo2(2600000);
       //
       renaul.setImpuestoooo(1600000);
       renaul.setImpuestoooo1(1800000);
       renaul.setImpuestoooo2(2000000);
       //
       renaul.setImpuestooooo(1200000);
       renaul.setImpuestooooo1(1600000);
       renaul.setImpuestooooo2(2100000);
       //
       renaul.setImpuesto6(1400000);
       renaul.setImpuestoo6(1600000);
       renaul.setImpuestooo6(1900000);
        
        renaul.siguiente();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}