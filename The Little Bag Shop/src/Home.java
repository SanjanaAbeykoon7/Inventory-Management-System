
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    
    private String userRole;

    
    public Home(String role) {
        initComponents();
        this.userRole = role;
        configureRoleBasedUI();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userRegButton = new javax.swing.JButton();
        addBagButton = new javax.swing.JButton();
        viewAllBagsButton = new javax.swing.JButton();
        searchBagButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userRegButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userRegButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        userRegButton.setText("User Registation");
        userRegButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        userRegButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userRegButton.setIconTextGap(2);
        userRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRegButtonActionPerformed(evt);
            }
        });
        getContentPane().add(userRegButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 230, 94));

        addBagButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addBagButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        addBagButton.setText("Add Bag Details");
        addBagButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        addBagButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBagButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addBagButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 230, 94));

        viewAllBagsButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewAllBagsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View.png"))); // NOI18N
        viewAllBagsButton.setText("View Bag Details");
        viewAllBagsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        viewAllBagsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewAllBagsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllBagsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewAllBagsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 240, 94));

        searchBagButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchBagButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search (2).png"))); // NOI18N
        searchBagButton.setText("Search Bag Details");
        searchBagButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        searchBagButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBagButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchBagButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 250, 94));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(13, 36));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 380, 32));

        closeButton.setBackground(new java.awt.Color(0, 0, 0));
        closeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("Close");
        closeButton.setBorder(new javax.swing.border.MatteBorder(null));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 380, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ecomp Services\\Downloads\\images\\Home background.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRegButtonActionPerformed
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.setVisible(true);
        dispose();
    }//GEN-LAST:event_userRegButtonActionPerformed

    private void addBagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBagButtonActionPerformed
        AddBag addbag = new AddBag();
        addbag.setVisible(true);
        dispose();
    }//GEN-LAST:event_addBagButtonActionPerformed

    private void viewAllBagsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllBagsButtonActionPerformed
        ViewAllBags viewAllbags = new ViewAllBags();
        viewAllbags.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewAllBagsButtonActionPerformed

    private void searchBagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBagButtonActionPerformed
        SearchBag searchbag = new SearchBag();
        searchbag.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchBagButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout ?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to close the application ?","Select",JOptionPane.YES_NO_OPTION);
        if (a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home("Manager").setVisible(true);
            }
        });
    }
    
    private void configureRoleBasedUI() {
        if ("Cashier".equalsIgnoreCase(userRole)) {
            userRegButton.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBagButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton searchBagButton;
    private javax.swing.JButton userRegButton;
    private javax.swing.JButton viewAllBagsButton;
    // End of variables declaration//GEN-END:variables
}
