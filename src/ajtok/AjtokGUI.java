package ajtok;


import java.util.Random;
import javax.swing.JOptionPane;


public class AjtokGUI extends javax.swing.JFrame {
    private int kincs;
    private int kincstelen;
    private Random random;

    public AjtokGUI() {
        kincs = -1;
        kincstelen = -1;
        initComponents();
        kincsElhelyezese();
    }
    private void kincs() {
        random = new Random();
        kincs = random.nextInt(3); // Véletlen ajtó index (0, 1 vagy 2)
    }

                   
    private void kincstelen(int valasztottAjto){
        for (int i=0; i < 3; i++) {
            if(i!=kincs && i!= valasztottAjto){
                kincstelen=i;
            }
        }
            
        int csere = 0;
            if(kincstelen!=-1){
                csere = JOptionPane.showConfirmDialog(rootPane, (kincstelen + 1) + ". emögött az ajtó mögött nincs kincs. Szeretnél ajtót cserélni?", "Csere", JOptionPane.YES_NO_OPTION);
            }
            if(csere == JOptionPane.NO_OPTION){
                if (valasztottAjto == kincs) {
                JOptionPane.showMessageDialog(rootPane, "Ez ajtó mögött: Kincs!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ez ajtó mögött: üres!");
            }
            }
        }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        lblKep1 = new javax.swing.JLabel();
        lblKep2 = new javax.swing.JLabel();
        lblKep3 = new javax.swing.JLabel();
        lblLeiras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnCsere = new javax.swing.JButton();
        btnMegse = new javax.swing.JButton();
        rbtnGomb3 = new javax.swing.JRadioButton();
        rbtnGomb2 = new javax.swing.JRadioButton();
        rbtnGomg1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnUjjatek = new javax.swing.JButton();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtok/ajtok.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtok/ajtok.png"))); // NOI18N

        jLabel8.setText("3. Ajtó");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtok/ajtok.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel3.setText("2. Ajtó");

        jLabel2.setText("1. Ajtó");

        jLabel1.setText("jLabel1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblKep1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtok/ajtok.png"))); // NOI18N

        lblKep2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtok/ajtok.png"))); // NOI18N

        lblKep3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtok/ajtok.png"))); // NOI18N

        lblLeiras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLeiras.setText("Válassz egy ajtót, és találd meg a nyereményt!");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnCsere.setText("Csere");

        btnMegse.setText("Mégse");

        buttonGroup2.add(rbtnGomb3);
        rbtnGomb3.setText("3. Ajtó");
        rbtnGomb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnGomb3MouseClicked(evt);
            }
        });

        buttonGroup2.add(rbtnGomb2);
        rbtnGomb2.setText("2. Ajtó");
        rbtnGomb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnGomb2MouseClicked(evt);
            }
        });

        buttonGroup2.add(rbtnGomg1);
        rbtnGomg1.setText("1. Ajtó");
        rbtnGomg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnGomg1MouseClicked(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Leírás:\nTaláld meg, melyik ajtó rejti az autót!\nMinden körben a válaszodat, egyszer cserélheted, \nde nem kötelező.\nTalálataidat és a nem találataidat számoljuk.");
        jScrollPane2.setViewportView(jTextArea2);

        btnUjjatek.setText("Új játék");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblKep1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKep2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKep3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(lblLeiras)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(rbtnGomg1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(rbtnGomb2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnGomb3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCsere)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnMegse)
                        .addGap(42, 42, 42)
                        .addComponent(btnUjjatek)
                        .addGap(20, 20, 20))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMegse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUjjatek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCsere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblLeiras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKep2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKep3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKep1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnGomb3)
                            .addComponent(rbtnGomb2)
                            .addComponent(rbtnGomg1))))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnGomg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnGomg1MouseClicked
        
    }//GEN-LAST:event_rbtnGomg1MouseClicked

    private void rbtnGomb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnGomb2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnGomb2MouseClicked

    private void rbtnGomb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnGomb3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnGomb3MouseClicked

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
            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjtokGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCsere;
    private javax.swing.JButton btnMegse;
    private javax.swing.JButton btnUjjatek;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblKep1;
    private javax.swing.JLabel lblKep2;
    private javax.swing.JLabel lblKep3;
    private javax.swing.JLabel lblLeiras;
    private javax.swing.JRadioButton rbtnGomb2;
    private javax.swing.JRadioButton rbtnGomb3;
    private javax.swing.JRadioButton rbtnGomg1;
    // End of variables declaration//GEN-END:variables

    private void kincsElhelyezese() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
