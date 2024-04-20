/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package deliveryvendor;

import java.awt.List;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class FoodOnSale extends javax.swing.JPanel {
private VendorRunner user;
    /**
     * Creates new form FoodOnSale
     */
    String filePath = "resources/food1.txt";
    int[] displayColumnIndices = {0,1,2,3,4};
    
    //String FoodName;
    
    public FoodOnSale(VendorRunner user) {
        initComponents();
        this.user = user;
        VendorMain obj1 = new VendorMain(user);
        VendorMenuClass obj2 = new VendorMenuClass();
        try {
            
            String lastID = obj2.determineLastID(filePath);
            String nextID = obj2.incrementID(lastID);
            lblFoodIDNew.setText("F"+nextID);
            obj2.loadTableData(filePath, displayColumnIndices,(DefaultTableModel) MenuTable.getModel(),user.getId());
        } catch (IOException ex) {
            Logger.getLogger(FoodOnSale.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblFoodIDNew = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        MenuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(MenuTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Food Items Overview");

        txtFoodName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("FoodName:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Price:");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Add Food");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Food ID:");

        lblFoodIDNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFoodIDNew.setText("F00");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Delete Food");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFoodIDNew)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblFoodIDNew))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFoodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        VendorMain obj1 = new VendorMain(user);
        VendorMenuClass obj2 = new VendorMenuClass();
        DefaultTableModel model = (DefaultTableModel)MenuTable.getModel();
        String FoodName = txtFoodName.getText();
        String FoodPrice = txtPrice.getText();
        String lastID="00";
        try {
            lastID = obj2.determineLastID(filePath);
        } catch (IOException ex) {
            Logger.getLogger(FoodOnSale.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nextID = obj2.incrementID(lastID);
        String FoodIDCheck = lblFoodIDNew.getText();
        if (FoodName.isEmpty() || FoodPrice.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required");
                
        }else{
            if(FoodIDCheck.equals("F"+nextID)){
                try {
                    String newRowData = obj2.writeNewRow(txtFoodName.getText(),txtPrice.getText(),user.getName(),user.getId(),user.getName());
                    obj2.addRowWithIncrementedIDToFile(filePath, newRowData);
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    obj2.loadTableData(filePath, displayColumnIndices,(DefaultTableModel) MenuTable.getModel(),user.getId());
                    JOptionPane.showMessageDialog(null, "New Food Added Successfully.");
                    obj2.Initialize(filePath,lblFoodIDNew,txtFoodName,txtPrice);
                } catch (IOException ex) {
                    Logger.getLogger(FoodOnSale.class.getName()).log(Level.SEVERE, null, ex);
                }              
                
            }else{
                JOptionPane.showMessageDialog(null, "This row had been added.");
            }
        }
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void MenuTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTableMouseReleased
        // TODO add your handling code here:
        int row = MenuTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)MenuTable.getModel();
        String FoodID = String.valueOf(model.getValueAt(row,0));
        String FoodName = String.valueOf(model.getValueAt(row,1));
        String Price = String.valueOf(model.getValueAt(row,2));
        
        lblFoodIDNew.setText(FoodID);
        txtFoodName.setText(FoodName);
        txtPrice.setText(Price);
          
    }//GEN-LAST:event_MenuTableMouseReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        VendorMain obj1 = new VendorMain(user);
        VendorMenuClass obj2 = new VendorMenuClass();
        DefaultTableModel model = (DefaultTableModel)MenuTable.getModel();
        String FoodName = txtFoodName.getText();
        String FoodPrice = txtPrice.getText();        
        String lastID="00";
        try {
            lastID = obj2.determineLastID(filePath);
        } catch (IOException ex) {
            Logger.getLogger(FoodOnSale.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nextID = obj2.incrementID(lastID);
        String FoodIDCheck = lblFoodIDNew.getText();
        if (FoodName.isEmpty() || FoodPrice.isEmpty() ) {
                JOptionPane.showMessageDialog(null, "No row selected.");
                
        }else{
            if(FoodIDCheck.equals("F"+nextID)){
                JOptionPane.showMessageDialog(null, "Please press add to add new food, or select the row to update.");
            }else{
                try {            
                    String [] lines = obj2.readLines(filePath);
                    obj2.modifyDetails(lines,lblFoodIDNew.getText(),FoodName,FoodPrice);
                    obj2.writeLinesToFile(filePath, lines);
                    System.out.println("Modification successful.");
                    JOptionPane.showMessageDialog(this, "Food Details Updated.");
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    obj2.loadTableData(filePath, displayColumnIndices,(DefaultTableModel) MenuTable.getModel(),user.getId());
                    obj2.Initialize(filePath,lblFoodIDNew,txtFoodName,txtPrice);
                } catch (IOException ex) {
                    Logger.getLogger(FoodOnSale.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        VendorMain obj1 = new VendorMain(user);
        VendorMenuClass obj2 = new VendorMenuClass();
        DefaultTableModel model = (DefaultTableModel)MenuTable.getModel();
        String FoodName = txtFoodName.getText();
        String FoodPrice = txtPrice.getText();        
        String lastID="00";
        try {
            lastID = obj2.determineLastID(filePath);
        } catch (IOException ex) {
            Logger.getLogger(FoodOnSale.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nextID = obj2.incrementID(lastID);
        String FoodIDCheck = lblFoodIDNew.getText();
        if (FoodName.isEmpty() || FoodPrice.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "No row selected.");                
        }else{
            if(FoodIDCheck.equals("F"+nextID)){
                JOptionPane.showMessageDialog(null, "Please select the row that exists in the table to delete.");
            }else{
                try {
                    obj2.deleteRow(filePath,FoodIDCheck);
                    JOptionPane.showMessageDialog(this, "Food Deleted Successfully.");
                    model.setRowCount(0);
                    model.setColumnCount(0);
                    obj2.loadTableData(filePath, displayColumnIndices,(DefaultTableModel) MenuTable.getModel(),user.getId());
                    obj2.Initialize(filePath,lblFoodIDNew,txtFoodName,txtPrice);
                } catch (IOException ex) {
                    Logger.getLogger(FoodOnSale.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private boolean checkField(String FoodName, String FoodPrice){
        boolean bool = true;
        if (FoodName.isEmpty() || FoodPrice.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "All fields are required");
                
        }else{            
            JOptionPane.showMessageDialog(null, "This row had been added.");
        }
        return bool;
    }
    

    

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MenuTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoodIDNew;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}