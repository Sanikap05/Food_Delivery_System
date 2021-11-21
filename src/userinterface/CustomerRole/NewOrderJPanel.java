/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sanik
 */
public class NewOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewOrderJPanel
     */
    Restaurant rest1;
    String restaurantName;
    JPanel userProcessContainer;
    RestaurantDirectory restaurantDirectory;
    Customer customer;
    UserAccount userAccount;
    UserAccount receiver;

    Map<String,Float> cartMap = new HashMap();
    Map<String,Integer> fooditemQun = new HashMap();

    public NewOrderJPanel(JPanel userProcessContainer, RestaurantDirectory restaurantDirectory, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.restaurantDirectory = restaurantDirectory;
        this.customer = customer;
        this.userAccount = userAccount;
        dpdRestaurant.removeAllItems();
        dpdFoodItem.removeAllItems();
        this.populateRestaurants();
//        cartMap = new HashMap();
//        cartItem = new ArrayList();
    }
    
    private void populateRestaurants()
    {   
        for(Restaurant r: this.restaurantDirectory.getRestaurantList())
        {
            dpdRestaurant.addItem(r.getName());
        }
    }
    
    private void populateFoodItems(String name) 
    {
        for(Restaurant r: this.restaurantDirectory.getRestaurantList())
        {
            if(r.getName().equals(restaurantName))
            {
                Restaurant r1 = r;
                for(Menu m: r1.getMenu())
                {
                    dpdFoodItem.addItem(m.getFoodItem());
                }  
                break;
            }
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

        dpdFoodItem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dpdQuantity = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCartTable = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dpdRestaurant = new javax.swing.JComboBox<>();
        btnConfirmOrder = new javax.swing.JButton();
        btnRemoveItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dpdFoodItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(dpdFoodItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 199, -1));

        jLabel1.setText("Food item:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        dpdQuantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        add(dpdQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 199, -1));

        jLabel2.setText("Quantity:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        viewCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Food item", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewCartTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 432, 92));

        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("View Cart:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel4.setText("Restaurant:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        dpdRestaurant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dpdRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpdRestaurantActionPerformed(evt);
            }
        });
        add(dpdRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 199, -1));

        btnConfirmOrder.setBackground(new java.awt.Color(0, 204, 204));
        btnConfirmOrder.setText("Confirm Order");
        btnConfirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmOrderActionPerformed(evt);
            }
        });
        add(btnConfirmOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        btnRemoveItem.setText("Delete Item");
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });
        add(btnRemoveItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Place Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 546, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void dpdRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpdRestaurantActionPerformed
        // TODO add your handling code here:
        dpdFoodItem.removeAllItems();
        this.cartMap.clear();
         DefaultTableModel dtm = (DefaultTableModel) viewCartTable.getModel();
        dtm.setRowCount(0);
        int selectedValue = dpdRestaurant.getSelectedIndex();
        if(selectedValue >= 0)
        {
            restaurantName = dpdRestaurant.getItemAt(selectedValue);
            this.populateFoodItems(restaurantName);
        }
    }//GEN-LAST:event_dpdRestaurantActionPerformed
//    private Map<String,Integer> order = new HashMap<>();
    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
      
        String foodItem = dpdFoodItem.getSelectedItem().toString();
        int quantity = Integer.parseInt(dpdQuantity.getSelectedItem().toString());
        //order.put(foodItem, quantity);
        for(Restaurant r: this.restaurantDirectory.getRestaurantList()){
            if(r.getName().equalsIgnoreCase(restaurantName)){
                rest1 = r;
                for(Menu m1: rest1.getMenu()){
                    if(m1.getFoodItem().equalsIgnoreCase(foodItem)){
                        if(quantity > 1){
                           cartMap.put(foodItem, m1.getPrice() * quantity);                        
                        }else {
                          cartMap.put(foodItem, m1.getPrice());
                        }
                            fooditemQun.put(foodItem, quantity);
                    }
                }
            }            
        }
            
       if(cartMap != null){
            DefaultTableModel dtm = (DefaultTableModel) viewCartTable.getModel();
            dtm.setRowCount(0);

            Iterator itr = cartMap.entrySet().iterator();

            while (itr.hasNext()) { 
                Map.Entry mapElement = (Map.Entry)itr.next(); 
                Object row[] = new Object[3];
                row[0] = mapElement.getKey();
                row[1] = fooditemQun.get(mapElement.getKey());
                row[2] = mapElement.getValue();
                dtm.addRow(row);
            } 

        }
          
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmOrderActionPerformed
        // TODO add your handling code here:
        ConfirmOrderJPanel confirmOrder = new ConfirmOrderJPanel(this.userProcessContainer, this.userAccount, this.restaurantDirectory, this.rest1, this.cartMap);
        userProcessContainer.add("confirmOrder",confirmOrder);
       
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnConfirmOrderActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
        // TODO add your handling code here:
        System.out.println("calles");
        int selectedIndex = viewCartTable.getSelectedRow();
        if(selectedIndex >= 0)
        {
            this.cartMap.remove(viewCartTable.getValueAt(selectedIndex, 0));
            if(cartMap != null)
            {
                DefaultTableModel dtm = (DefaultTableModel) viewCartTable.getModel();
                dtm.setRowCount(0);

                Iterator itr = cartMap.entrySet().iterator();

                while (itr.hasNext()) 
                { 
                    Map.Entry mapElement = (Map.Entry)itr.next(); 
                    Object row[] = new Object[3];
                    row[0] = mapElement.getKey();
                    row[1] = fooditemQun.get(mapElement.getKey());
                    row[2] = mapElement.getValue();
                    dtm.addRow(row);
                } 
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select an item to remove.");
        }
    }//GEN-LAST:event_btnRemoveItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CustomerAreaJPanel customerAreaJPanel = new CustomerAreaJPanel(userProcessContainer, userAccount, customer, this.restaurantDirectory);
        userProcessContainer.add("customerAreaJPanel",customerAreaJPanel);
       
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmOrder;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JComboBox<String> dpdFoodItem;
    private javax.swing.JComboBox<String> dpdQuantity;
    private javax.swing.JComboBox<String> dpdRestaurant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewCartTable;
    // End of variables declaration//GEN-END:variables
}
