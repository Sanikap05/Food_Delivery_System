/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;

import Business.Organization;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Sanik
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTree();
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
       // Add the code for draw your system structure shown by JTree
       
        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageAllCustomers = new javax.swing.JButton();
        btnManageRestaurants = new javax.swing.JButton();
        btnManageDeliveryman = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnManageAllCustomers.setText("Manage All Customers");
        btnManageAllCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAllCustomersActionPerformed(evt);
            }
        });

        btnManageRestaurants.setText("Manage Restaurants");
        btnManageRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantsActionPerformed(evt);
            }
        });

        btnManageDeliveryman.setText("Manage Deliveryman");
        btnManageDeliveryman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliverymanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnManageDeliveryman, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnManageRestaurants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageAllCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(54, 54, 54)
                .addComponent(btnManageAllCustomers)
                .addGap(18, 18, 18)
                .addComponent(btnManageRestaurants)
                .addGap(18, 18, 18)
                .addComponent(btnManageDeliveryman)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        jSplitPane.setRightComponent(jScrollPane1);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAllCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAllCustomersActionPerformed

       ManageAllCustomersJPanel manageCustomers = new ManageAllCustomersJPanel(userProcessContainer, ecosystem);
       userProcessContainer.add("manageCustomers",manageCustomers);
       
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
       
    }//GEN-LAST:event_btnManageAllCustomersActionPerformed

    private void btnManageRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantsActionPerformed
        ManageRestaurantsJPanel manageRestaurants = new ManageRestaurantsJPanel(userProcessContainer, ecosystem);
       userProcessContainer.add("manageRestaurants",manageRestaurants);
       
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRestaurantsActionPerformed

    private void btnManageDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryManActionPerformed
       ManageDeliveryManJPanel manageDeliveryMan = new ManageDeliveryManJPanel(userProcessContainer, ecosystem);
       userProcessContainer.add("manageDeliveryMan",manageDeliveryMan);
       
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDeliveryManActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void btnManageDeliverymanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliverymanActionPerformed
        // TODO add your handling code here:
        ManageDeliveryManJPanel manageDeliveryMan = new ManageDeliveryManJPanel(userProcessContainer, ecosystem);
       userProcessContainer.add("manageDeliveryMan",manageDeliveryMan);
       
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDeliverymanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAllCustomers;
    private javax.swing.JButton btnManageDeliveryman;
    private javax.swing.JButton btnManageRestaurants;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
