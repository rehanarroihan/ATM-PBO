package atm.modul10;

public class frm2 extends javax.swing.JFrame {
    int saldo = 300000;

    public frm2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        pnlWelcome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTarik = new javax.swing.JButton();
        btnSetor = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        pnlInfo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlTarik = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tbTarik = new javax.swing.JTextField();
        btnConfirmTarik = new javax.swing.JButton();
        pnlSetor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tbSetor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlWelcome.setBackground(new java.awt.Color(255, 0, 0));
        pnlWelcome.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>\n<center>\nSELAMAT DATANG<br>\nATM MANDIRI SYARIAH<br>\nCABANG BOJONEGORO\n</center>\n</html>");
        pnlWelcome.add(jLabel2);
        jLabel2.setBounds(60, 30, 280, 80);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SILAHKAN PILIH MENU YANG TERSEDIA");
        pnlWelcome.add(jLabel6);
        jLabel6.setBounds(40, 130, 330, 16);

        getContentPane().add(pnlWelcome);
        pnlWelcome.setBounds(30, 90, 400, 180);

        btnTarik.setText("TARIK TUNAI");
        btnTarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarikActionPerformed(evt);
            }
        });
        getContentPane().add(btnTarik);
        btnTarik.setBounds(20, 20, 210, 32);

        btnSetor.setText("SETOR TUNAI");
        btnSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetorActionPerformed(evt);
            }
        });
        getContentPane().add(btnSetor);
        btnSetor.setBounds(230, 20, 200, 32);

        btnInfo.setText("INFORMASI");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo);
        btnInfo.setBounds(30, 280, 200, 32);

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar);
        btnKeluar.setBounds(230, 280, 200, 32);

        jLabel3.setText("JUMLAH SALDO :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 60, 120, 16);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rp.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 50, 50, 40);

        lblSaldo.setText("999999999");
        getContentPane().add(lblSaldo);
        lblSaldo.setBounds(230, 60, 160, 16);

        pnlInfo.setBackground(new java.awt.Color(255, 102, 0));
        pnlInfo.setLayout(null);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INFORMASI");
        pnlInfo.add(jLabel9);
        jLabel9.setBounds(70, 10, 260, 30);

        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("<html>\n1. Jumlah saldo ada di bawah tombol menu atas <br>\n2. Tekan tombol tarik tunai untuk transaksi pengambilan uang <br>\n3. Tekan tombol setor tunau untuk menabung <br>\n4. Tekan keluar kalau ingin pulang <br>\n5. Rajin menabung pangkal kaya <br>\n</html>");
        pnlInfo.add(jLabel10);
        jLabel10.setBounds(60, 40, 280, 120);

        getContentPane().add(pnlInfo);
        pnlInfo.setBounds(30, 90, 400, 180);

        pnlTarik.setBackground(new java.awt.Color(204, 0, 204));
        pnlTarik.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PENARIKAN TUNAI");
        pnlTarik.add(jLabel1);
        jLabel1.setBounds(120, 10, 170, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rp.");
        pnlTarik.add(jLabel5);
        jLabel5.setBounds(80, 60, 30, 20);
        pnlTarik.add(tbTarik);
        tbTarik.setBounds(160, 60, 160, 24);

        btnConfirmTarik.setText("Konfirmasi");
        btnConfirmTarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmTarikActionPerformed(evt);
            }
        });
        pnlTarik.add(btnConfirmTarik);
        btnConfirmTarik.setBounds(110, 110, 140, 32);

        getContentPane().add(pnlTarik);
        pnlTarik.setBounds(30, 90, 400, 180);

        pnlSetor.setBackground(new java.awt.Color(0, 153, 153));
        pnlSetor.setLayout(null);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SETOR TUNAI");
        pnlSetor.add(jLabel7);
        jLabel7.setBounds(90, 10, 220, 30);
        pnlSetor.add(tbSetor);
        tbSetor.setBounds(140, 60, 160, 24);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rp.");
        pnlSetor.add(jLabel8);
        jLabel8.setBounds(100, 60, 30, 20);

        jButton1.setText("Konfirmasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlSetor.add(jButton1);
        jButton1.setBounds(130, 110, 140, 32);

        getContentPane().add(pnlSetor);
        pnlSetor.setBounds(30, 90, 400, 180);

        setSize(new java.awt.Dimension(471, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmTarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmTarikActionPerformed
        // TODO add your handling code here:
        String tarik = tbTarik.getText();
        int tarikI = Integer.parseInt(tarik);
        int prosesTarik = saldo-tarikI;
        
        lblSaldo.setText(Integer.toString(prosesTarik));
    }//GEN-LAST:event_btnConfirmTarikActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String saldoS = Integer.toString(saldo);
        lblSaldo.setText(saldoS);
        
        pnlWelcome.setVisible(true);
        pnlInfo.setVisible(false);
        pnlSetor.setVisible(false);
        pnlTarik.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String setor = tbSetor.getText();
        int setorI = Integer.parseInt(setor);
        int prosesSetor = saldo+setorI;
        
        lblSaldo.setText(Integer.toString(prosesSetor));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarikActionPerformed
        // TODO add your handling code here:
        pnlWelcome.setVisible(false);
        pnlInfo.setVisible(false);
        pnlSetor.setVisible(false);
        pnlTarik.setVisible(true);
    }//GEN-LAST:event_btnTarikActionPerformed

    private void btnSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetorActionPerformed
        // TODO add your handling code here:
        pnlWelcome.setVisible(false);
        pnlInfo.setVisible(false);
        pnlSetor.setVisible(true);
        pnlTarik.setVisible(false);
    }//GEN-LAST:event_btnSetorActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        pnlWelcome.setVisible(false);
        pnlInfo.setVisible(true);
        pnlSetor.setVisible(false);
        pnlTarik.setVisible(false);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(frm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmTarik;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSetor;
    private javax.swing.JButton btnTarik;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlSetor;
    private javax.swing.JPanel pnlTarik;
    private javax.swing.JPanel pnlWelcome;
    private javax.swing.JTextField tbSetor;
    private javax.swing.JTextField tbTarik;
    // End of variables declaration//GEN-END:variables
}
