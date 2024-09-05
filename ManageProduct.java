
import dao.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class ManageProduct extends javax.swing.JFrame {

    private int productpk = 0;
    private int productQuantity = 0;

    public ManageProduct() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void getALLCategory() {
        try {
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from category");
            comboBoxCategory.removeAllItems();
            while (rs.next()) {
                comboBoxCategory.addItem(rs.getString("category_pk")+"-"+rs.getString("name"));
                //test 1-category
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private boolean validationfields(String formType) {
        if (formType.equals("edit") && !txtProductName.getText().equals("") && !txtPrice.getText().equals("") && !txtDescription.getText().equals("")) {
            return false;
        } else if (formType.equals("new") && !txtProductName.getText().equals("") && !txtPrice.getText().equals("") && !txtDescription.getText().equals("") && !txtQuantity.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxCategory = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue2.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("MANAGE PRODUCT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 0, -1, -1));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCT NAME", "QUANTITY", "PRICE", "DESCRIPTION", "CATEGORY ID", "CATEGORY NAME"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduct);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 537));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        txtProductName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 333, -1));

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuantity.setText("Quantity");
        getContentPane().add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        txtQuantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 331, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 331, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        txtDescription.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 331, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Categories");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        comboBoxCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBoxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 331, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, -1));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
        getALLCategory();
        DefaultTableModel model = (DefaultTableModel) tableProduct.getModel();
        try {
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from product inner join category on product.category_fk = category.category_pk");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_pk"), rs.getString("name"), rs.getString("quantity"), rs.getString("price"), rs.getString("description"), rs.getString("category_fk"), rs.getString(8)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       
        setVisible(false);
        new ManageProduct().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      
        String name = txtProductName.getText();
        String quantity = txtQuantity.getText();
        String price = txtPrice.getText();
        String description = txtDescription.getText();
        String category = (String) comboBoxCategory.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        if (validationfields("new")) {
            JOptionPane.showMessageDialog(null, "All Fields are Required");
        } else {
            try {
                Connection Con = ConnectionProvider.getcon();
                PreparedStatement ps = Con.prepareStatement("insert into product(name,quantity,price,description,category_fk) values(?,?,?,?,?)");
                ps.setString(1, name);
                ps.setString(2, quantity);
                ps.setString(3, price);
                ps.setString(4, description);
                ps.setString(5, categoryId[0]);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product Added Successfully");
                setVisible(false);
                new ManageProduct().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
       
        int index = tableProduct.getSelectedRow();
        TableModel model = tableProduct.getModel();
        String id = model.getValueAt(index, 0).toString();
        productpk = Integer.parseInt(id);

        String name = model.getValueAt(index, 1).toString();
        txtProductName.setText(name);

        String quantity = model.getValueAt(index, 2).toString();
        productQuantity = 0;
        lblQuantity.setText("ADD Quantity");
        productQuantity = Integer.parseInt(quantity);

        String price = model.getValueAt(index, 3).toString();
        txtPrice.setText(price);

        String description = model.getValueAt(index, 4).toString();
        txtDescription.setText(description);

        comboBoxCategory.removeAllItems();
        String categoryId = model.getValueAt(index, 5).toString();
        String categoryName = model.getValueAt(index, 6).toString();
        comboBoxCategory.addItem(categoryId + "-" + categoryName);

        try {
            Connection Con = ConnectionProvider.getcon();
            Statement st = Con.createStatement();
            ResultSet rs = st.executeQuery("select *from category");
            while (rs.next()) {
                if (Integer.parseInt(categoryId) != rs.getInt(1)) {
                    comboBoxCategory.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));
                }
                //test 1-category
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

    }//GEN-LAST:event_tableProductMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
        String name = txtProductName.getText();
        String quantity = txtQuantity.getText();
        String price = txtPrice.getText();
        String description = txtDescription.getText();
        String category = (String) comboBoxCategory.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        if (validationfields("edit")) {
            JOptionPane.showMessageDialog(null, "All Fields are Required");
        } else {
            try {
                if(!quantity.equals("")){
                    productQuantity =productQuantity + Integer.parseInt(quantity);
                }
                Connection Con = ConnectionProvider.getcon();
                PreparedStatement ps = Con.prepareStatement("update product set name=?,quantity=?,price=?,description=?,category_fk=? where product_pk=?");
                ps.setString(1, name);
                ps.setInt(2, productQuantity);
                ps.setString(3, price);
                ps.setString(4, description);
                ps.setString(5, categoryId[0]);
                ps.setInt(6, productpk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product Updated Successfully");
                setVisible(false);
                new ManageProduct().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void getAllCategory() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
