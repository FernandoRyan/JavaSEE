/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Neranji Sulakshika
 */
public class SubmarinePOPUPMessage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SubmarinePOPUPMessage() {
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
        jLabel1 = new javax.swing.JLabel();
        lblSubmarine = new javax.swing.JLabel();
        lblSubmarineName = new javax.swing.JLabel();
        lblSubmarinePrice = new javax.swing.JLabel();
        lblLKR = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        spSubmarineQty = new javax.swing.JSpinner();
        lblTOTAL = new javax.swing.JLabel();
        lblTotalLKR = new javax.swing.JLabel();
        btnAddToPlateSubmarine = new javax.swing.JButton();
        lblSubmarineTotalPrice = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 530));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 530);

        lblSubmarine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubmarine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SUBMARINE.jpg"))); // NOI18N
        jPanel1.add(lblSubmarine);
        lblSubmarine.setBounds(80, 40, 250, 170);
        lblSubmarine.getAccessibleContext().setAccessibleName("lblSubmarine");

        lblSubmarineName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblSubmarineName.setForeground(new java.awt.Color(0, 0, 0));
        lblSubmarineName.setText("SUBMARINE");
        jPanel1.add(lblSubmarineName);
        lblSubmarineName.setBounds(120, 220, 150, 30);
        lblSubmarineName.getAccessibleContext().setAccessibleName("lblSubmarineName");

        lblSubmarinePrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblSubmarinePrice.setForeground(new java.awt.Color(51, 51, 51));
        lblSubmarinePrice.setText("200.00");
        jPanel1.add(lblSubmarinePrice);
        lblSubmarinePrice.setBounds(160, 260, 50, 20);
        lblSubmarinePrice.getAccessibleContext().setAccessibleName("lblSubmarinePrice");

        lblLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblLKR.setText("LKR");
        jPanel1.add(lblLKR);
        lblLKR.setBounds(120, 260, 40, 20);
        lblLKR.getAccessibleContext().setAccessibleName("lblLKR");

        lblQty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQty.setForeground(new java.awt.Color(0, 0, 0));
        lblQty.setText("QTY");
        jPanel1.add(lblQty);
        lblQty.setBounds(50, 340, 50, 30);
        lblQty.getAccessibleContext().setAccessibleName("lblQty");

        spSubmarineQty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        spSubmarineQty.setBorder(null);
        spSubmarineQty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(spSubmarineQty);
        spSubmarineQty.setBounds(100, 330, 50, 50);
        spSubmarineQty.getAccessibleContext().setAccessibleName("spSubmarineQty");

        lblTOTAL.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTOTAL.setForeground(new java.awt.Color(102, 102, 102));
        lblTOTAL.setText("TOTAL :");
        jPanel1.add(lblTOTAL);
        lblTOTAL.setBounds(190, 340, 60, 30);
        lblTOTAL.getAccessibleContext().setAccessibleName("lblTOTAL");

        lblTotalLKR.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTotalLKR.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalLKR.setText("LKR");
        jPanel1.add(lblTotalLKR);
        lblTotalLKR.setBounds(270, 340, 40, 30);
        lblTotalLKR.getAccessibleContext().setAccessibleName("lblTotalLKR");

        btnAddToPlateSubmarine.setBackground(new java.awt.Color(0, 153, 0));
        btnAddToPlateSubmarine.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAddToPlateSubmarine.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToPlateSubmarine.setText("ADD TO PLATE");
        btnAddToPlateSubmarine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddToPlateSubmarine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAddToPlateSubmarine);
        btnAddToPlateSubmarine.setBounds(90, 420, 210, 60);
        btnAddToPlateSubmarine.getAccessibleContext().setAccessibleName("btnAddToPlateSubmarine");

        lblSubmarineTotalPrice.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblSubmarineTotalPrice.setForeground(new java.awt.Color(51, 51, 51));
        lblSubmarineTotalPrice.setText("200.00");
        jPanel1.add(lblSubmarineTotalPrice);
        lblSubmarineTotalPrice.setBounds(310, 340, 50, 30);
        lblSubmarineTotalPrice.getAccessibleContext().setAccessibleName("lblSubmarineTotalPrice");

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("X");
        btnCancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setPreferredSize(new java.awt.Dimension(181, 36));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(370, 10, 20, 20);
        btnCancel.getAccessibleContext().setAccessibleName("btnCancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(400, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

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
            java.util.logging.Logger.getLogger(SubmarinePOPUPMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmarinePOPUPMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmarinePOPUPMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmarinePOPUPMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmarinePOPUPMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlateSubmarine;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLKR;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblSubmarine;
    private javax.swing.JLabel lblSubmarineName;
    private javax.swing.JLabel lblSubmarinePrice;
    private javax.swing.JLabel lblSubmarineTotalPrice;
    private javax.swing.JLabel lblTOTAL;
    private javax.swing.JLabel lblTotalLKR;
    private javax.swing.JSpinner spSubmarineQty;
    // End of variables declaration//GEN-END:variables
}