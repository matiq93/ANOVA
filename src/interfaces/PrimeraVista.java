/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class PrimeraVista extends javax.swing.JFrame {
    /**
     * Creates new form PrimeraVista
     */
    public PrimeraVista() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        lblCantGP = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblSizeFP = new javax.swing.JLabel();
        txtCantGP = new javax.swing.JFormattedTextField();
        txtSizegp = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 20, -1, -1));

        lblCantGP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCantGP.setText("Cantidad de Grupos:");
        getContentPane().add(lblCantGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("Nuevo ANOVA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lblSizeFP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblSizeFP.setText("Tamaño de Muestra grupal:");
        lblSizeFP.setToolTipText("Si tienen tamaños diferentes, ingrese el tamaño de muestra mayor");
        getContentPane().add(lblSizeFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 160, 30));

        txtCantGP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));
        txtCantGP.setText("0");
        txtCantGP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantGPActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 160, 30));

        txtSizegp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));
        txtSizegp.setText("0");
        txtSizegp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizegpActionPerformed(evt);
            }
        });
        getContentPane().add(txtSizegp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 160, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 500, 20));

        jButton1.setText("Comenzar ANOVA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCantGPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantGPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantGPActionPerformed

    private void txtSizegpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizegpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizegpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String columnas[]=new String [Integer.parseInt(txtCantGP.getText())+1];
        columnas [0]="n";
        for (int i = 1; i < columnas.length; i++) {
            columnas [i]=JOptionPane.showInputDialog(null, "Nombre del "+i+"° Grupo",i);            
        }
        Integer MatrizDatos[][]=new Integer[Integer.parseInt(txtSizegp.getText())][Integer.parseInt(txtCantGP.getText())+1];
        for (int i = 0; i < MatrizDatos.length; i++) {
            MatrizDatos[i][0]=i+1;
            for (int j = 1; j < MatrizDatos[i].length; j++) {
                MatrizDatos[i][j]=null;
            }
        }
        IngresoMatriz matriz =  new IngresoMatriz(MatrizDatos, columnas);
        matriz.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrimeraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimeraVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCantGP;
    private javax.swing.JLabel lblSizeFP;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JFormattedTextField txtCantGP;
    private javax.swing.JFormattedTextField txtSizegp;
    // End of variables declaration//GEN-END:variables
}