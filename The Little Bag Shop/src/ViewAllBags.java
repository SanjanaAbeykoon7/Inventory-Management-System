
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ViewAllBags extends javax.swing.JFrame {

    private List<Bag> bags = new ArrayList<>();
    
    public ViewAllBags() {
        initComponents();
        loadBags();
        populateTable();
        setLocationRelativeTo(null);
    }

    private void loadBags() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Get database connection
            connection = DBConnection.getConnection();
            
            // SQL query to fetch all bags
            String sql = "SELECT * FROM bag";
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            // Clear existing bags list
            bags.clear();

            // Iterate through result set and populate bags list
            while (resultSet.next()) {
                String name = resultSet.getString("brandName");
                String category = resultSet.getString("category");
                String size = resultSet.getString("size");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                

                bags.add(new Bag(name, category, size, price, quantity));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error! Database is not connected: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            DBConnection.closeConnection(connection, statement, resultSet);
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) bagsTable.getModel();
        model.setRowCount(0); // Clear existing rows

        for (Bag bag : bags) {
            model.addRow(new Object[]{
                bag.getName(),
                bag.getCategory(),
                bag.getSize(),
                bag.getPrice(),
                bag.getQuantity()
                
            });
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bagsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bagsTable.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bagsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Brand Name", "Category", "Size", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bagsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 883, 380));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("List of Bags");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        cancelButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 358, 37));

        deleteButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 358, 37));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ecomp Services\\Downloads\\images\\grey2.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        String userRole = UserRole.getUserRole();

        // Check if the user role is available
        if (userRole != null) {
            // Create and display the Home page with the user role
            Home home = new Home(userRole);
            home.setVisible(true);

            // Optionally, close the current windows
            this.dispose();
        } else {
            // Handle the case where the role is not available
            JOptionPane.showMessageDialog(null, "User role is not set. Please log in first.");
        }
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
                                                    
    // Get the selected row from the table
    int selectedRow = bagsTable.getSelectedRow();
    
    if (selectedRow == -1) {
        // No row is selected, show a message
        JOptionPane.showMessageDialog(null, "Please select a bag to delete.");
        return;
    }
    
    // Confirm the deletion with the user
    int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this bag?", "Delete Bag", JOptionPane.YES_NO_OPTION);
    
    if (confirmation == JOptionPane.YES_OPTION) {
        // Get the values of the selected bag
        String brandName = (String) bagsTable.getValueAt(selectedRow, 0);
        String category = (String) bagsTable.getValueAt(selectedRow, 1);
        String size = (String) bagsTable.getValueAt(selectedRow, 2);
        Double price = (Double) bagsTable.getValueAt(selectedRow, 3);
        int quantity = (int) bagsTable.getValueAt(selectedRow, 4);
        
        
        // Execute delete operation in the database
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DBConnection.getConnection();
            String deleteSQL = "DELETE FROM bag WHERE brandName = ? AND category = ? AND size = ? AND price = ? AND quantity = ?";
            statement = connection.prepareStatement(deleteSQL);
            statement.setString(1, brandName);
            statement.setString(2, category);
            statement.setString(3, size);
            statement.setDouble(4, price);
            statement.setInt(5, quantity);
            int rowsAffected = statement.executeUpdate();
            
            if (rowsAffected > 0) {
                // Remove the selected row from the table model
                DefaultTableModel model = (DefaultTableModel) bagsTable.getModel();
                model.removeRow(selectedRow);
                
                JOptionPane.showMessageDialog(null, "Bag deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete the bag. Please try again.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while deleting the bag. Please check the connection to database.");
        } finally {
            // Close the resources
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllBags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllBags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllBags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllBags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllBags().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bagsTable;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

class Bag {
    private String name;
    private String category;
    private String size;
    private double price;
    private int quantity;
    
    

    public Bag(String name, String category, String size, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
        
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getSize() { return size; }
    public double getPrice() { return price; }    
    public int getQuantity() { return quantity; }
    
    }