/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sanik
 */
public class ManageRestaurantsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantsJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    public ManageRestaurantsJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.populateTable();
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
        restaurantTable = new javax.swing.JTable();
        usernameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        restaurantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Admin", "Restaurant name", "Restaurant Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        restaurantTable.setToolTipText("");
        jScrollPane1.setViewportView(restaurantTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 82, -1, 95));
        add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 282, 136, -1));

        jLabel1.setText("Username");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, -1, -1));

        jLabel3.setText("Password ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 319, -1, -1));

        jLabel2.setText("Restaurant name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 221, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 354, -1, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 354, -1, -1));
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 218, 138, -1));

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 316, 136, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jLabel4.setText("Restaurant Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 259, -1, -1));
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 256, 138, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Restaurant Login Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String name = nameTextField.getText();
        String address = addressTextField.getText();
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());

        if(system.checkIfUserIsUnique(username))
        {
            Restaurant restaurant = system.createRestaurant(name, username, address);
            Employee emp = restaurant.getEmployeeDirectory().createEmployee(name);
            UserAccount ua = system.getUserAccountDirectory().createUserAccount(username, password, emp, new AdminRole());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Username has already been taken. Please enter another username.");
        }

        populateTable();
        nameTextField.setText("");
        usernameTextField.setText("");
        passwordTextField.setText("");
        addressTextField.setText("");
    }//GEN-LAST:event_submitJButtonActionPerformed

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) restaurantTable.getModel();
        dtm.setRowCount(0);
        for (Restaurant restaurant : system.getRestaurantDirectory().getRestaurantList()) {
            Object row[] = new Object[3];
                row[0] = restaurant;
                row[1] = restaurant.getName();
                row[2] = restaurant.getAddress();
            dtm.addRow(row);
        }
    }
    
    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = restaurantTable.getSelectedRow();
        
      if(selectedRow >= 0) {
            Restaurant r = (Restaurant) restaurantTable.getValueAt(selectedRow, 0);
            
            //System.out.println(c.getUsername());
            UpdateInformationJPanel updateUserInfo = new UpdateInformationJPanel(userProcessContainer, this.system, "Restaurant", r.getRestaurantAdminUsername());
            userProcessContainer.add("updateUserInfo",updateUserInfo);

            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Restaurant to update.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        UserAccount u = null;
        Employee e = null;
        
        int selectedRow = restaurantTable.getSelectedRow();
        if(selectedRow >= 0) {
            Restaurant r = (Restaurant) restaurantTable.getValueAt(selectedRow, 0);
            if(system.getRestaurantDirectory().getRestaurantList().contains(r))
            {
                for(UserAccount userAccount: system.getUserAccountDirectory().getUserAccountList())
                {
                    if(userAccount.getUsername().equals(r.getRestaurantAdminUsername()))
                    {
                        u = userAccount;
                    }
                }
                for(Employee emp: r.getEmployeeDirectory().getEmployeeList())
                {
                    if(emp.getName().equals(r.getName()))
                    {
                        e = emp;
                    }
                }

            }
            system.getRestaurantDirectory().deleteRestaurant(r);
            system.getUserAccountDirectory().deleteUserAccount(u);
            r.getEmployeeDirectory().deleteEmployee(e);
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a restaurant to delete.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTable restaurantTable;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
