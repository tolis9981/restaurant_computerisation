package mypackage;


import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecondForm extends javax.swing.JFrame {

    String selected;
    String selected2;
    String selectedFromRemoveList;
    DefaultListModel dm = new DefaultListModel();
    DefaultListModel dm2 = new DefaultListModel();
    static String driverClassName = "org.postgresql.Driver";
    static String url = "jdbc:postgresql://dblabs.iee.ihu.gr:5432/it174865";
    static Connection dbConnection = null;
    static String username = "it174865";
    static String password = "Aa194523511378";
    static Statement statement = null;

    public SecondForm() {
        initComponents();

    }
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        removeList = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        productNameText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        addList = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        deleteText = new javax.swing.JTextField();
        addOrderB = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        queriesB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(905, 550));

        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        removeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "appetizer", "beers", "fish", "meat", "salads", "soft_drinks", " " }));
        removeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        productNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameTextActionPerformed(evt);
            }
        });

        priceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Όνομα προϊόντος :");

        jLabel3.setText("Τιμή :");

        jLabel1.setText("Κωδικός : ");

        jScrollPane2.setViewportView(jList2);

        addList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "appetizer", "beers", "fish", "meat", "salads", "soft_drinks", " " }));
        addList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListActionPerformed(evt);
            }
        });

        jLabel4.setText("Κωδικός : ");

        deleteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTextActionPerformed(evt);
            }
        });

        addOrderB.setText("ADD AN ORDER");
        addOrderB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderBActionPerformed(evt);
            }
        });

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });

        queriesB.setText("QUERIES FORM");
        queriesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queriesBActionPerformed(evt);
            }
        });

        jButton1.setText("Log File ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(deleteText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                            .addComponent(priceText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queriesB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addOrderB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeList, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addList, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(addOrderB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteText)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idText)
                        .addComponent(queriesB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void removeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeListActionPerformed
        try {
            // TODO add your handling code here:
            removeShow();
        } catch (Exception ex) {
            Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_removeListActionPerformed

    private void addListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListActionPerformed
        try {
            // TODO add your handling code here:
            addShow();
        } catch (Exception ex) {
            Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addListActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        Object selectedItem = removeList.getSelectedItem();
        String selectedItemStr2 = selectedItem.toString();

        try {

            removeRow(selectedItemStr2);

        } catch (Exception ex) {
            Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            // TODO add your handling code here:
            Object selectedItem = addList.getSelectedItem();
            String selectedItemStr1 = selectedItem.toString();

            addRow(selectedItemStr1);

        } catch (Exception ex) {
            Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void productNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTextActionPerformed

    private void priceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextActionPerformed

    private void deleteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTextActionPerformed
        selectedFromRemoveList=jList1.getSelectedValue();
        deleteText.setText(selectedFromRemoveList);
        System.out.println("ok");
    }//GEN-LAST:event_deleteTextActionPerformed

    private void addOrderBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderBActionPerformed
        setVisible(false);
        new firstForm().setVisible(true);
    }//GEN-LAST:event_addOrderBActionPerformed

    private void queriesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queriesBActionPerformed
        setVisible(false);
        try {
            new QueriesForm().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_queriesBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           setVisible(false);
        new log().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondForm().setVisible(true);
            }
        });
    }

    public void methremove(String nameOfTable) throws Exception {
        dm.clear();
        dbConnection = DriverManager.getConnection(url, username, password);
        statement = dbConnection.createStatement();

        ResultSet rs = statement.executeQuery("select * from " + nameOfTable);
        while (rs.next()) {
            jList1.setModel(dm);
            String ID = rs.getString(1);
            String Name = rs.getString(2);
            String Timh = rs.getString(3);

            dm.addElement(ID + "   " + Name + "   " + Timh);

        }
        statement.close();
        dbConnection.close();
    }

    public void methadd(String nameOfTable) throws Exception {
        dm2.clear();
        dbConnection = DriverManager.getConnection(url, username, password);
        statement = dbConnection.createStatement();

        ResultSet rs = statement.executeQuery("select * from " + nameOfTable);
        while (rs.next()) {
            jList2.setModel(dm2);
            String ID = rs.getString(1);
            String Name = rs.getString(2);
            String Timh = rs.getString(3);

            dm2.addElement(ID + "   " + Name + "   " + Timh);

        }
        statement.close();
        dbConnection.close();
    }

    public void removeShow() throws Exception {
        Object selectedItem = removeList.getSelectedItem();
        String selectedItemStr = selectedItem.toString();

        switch (selectedItemStr) {

            case "appetizer":
                
            try {
                methremove("appetizer");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "beers":
                
            try {
                methremove("beers");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "fish":
                
            try {
                methremove("fish");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "meat":
                
            try {
                methremove("meat");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "salads":
                
            try {
                methremove("salads");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "soft_drinks":
                
            try {
                methremove("soft_drinks");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

        }

    }

    public void addShow() throws Exception {
        Object selectedItem = addList.getSelectedItem();
        String selectedItemStr = selectedItem.toString();

        switch (selectedItemStr) {

            case "appetizer":
                
            try {
                methadd("appetizer");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "beers":
                
            try {
                methadd("beers");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "fish":
                
            try {
                methadd("fish");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "meat":
                
            try {
                methadd("meat");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "salads":
                
            try {
                methadd("salads");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "soft_drinks":
                
            try {
                methadd("soft_drinks");
            } catch (Exception ex) {
                Logger.getLogger(SecondForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

        }

    }

    public void addRow(String table) throws Exception {
        int code = Integer.parseInt(idText.getText());
        String name = productNameText.getText();
        double price = Double.parseDouble(priceText.getText());
        //statement.executeUpdate("insert into " + table + " values ( " + code + ",'" + name + "', " + price + ") ");
        try (Connection conn = this.connect();
            CallableStatement properCase = conn.prepareCall("{call insert"+table+"( ?,?,? ) }")) {
                properCase.setInt(1,code);
                properCase.setString(2,name);
                properCase.setDouble(3,price);
                properCase.execute();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
                }
        addShow();
    }

    public void removeRow(String table) throws Exception {
        int code =Integer.parseInt(deleteText.getText());
        switch(table){
            case "fish":
                try (Connection conn = this.connect();
                    CallableStatement properCase = conn.prepareCall("{call deleteFish( ? ) }")) {
                    properCase.setInt(1,code);
                    properCase.execute();
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }break;
            case "salads":
                try (Connection conn = this.connect();
                    CallableStatement properCase = conn.prepareCall("{call deleteSalads( ? ) }")) {
                    properCase.setInt(1,code);
                    properCase.execute();
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }break;
            case "meat":
                try (Connection conn = this.connect();
                    CallableStatement properCase = conn.prepareCall("{call deleteMeat( ? ) }")) {
                    properCase.setInt(1,code);
                    properCase.execute();
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }break;
            case "beers":
                try (Connection conn = this.connect();
                    CallableStatement properCase = conn.prepareCall("{call deleteBeers( ? ) }")) {
                    properCase.setInt(1,code);
                    properCase.execute();
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }break;  
            case "appetizer":
                try (Connection conn = this.connect();
                    CallableStatement properCase = conn.prepareCall("{call deleteAppetizer( ? ) }")) {
                    properCase.setInt(1,code);
                    properCase.execute();
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }break;
            case "soft_drinks":
                try (Connection conn = this.connect();
                    CallableStatement properCase = conn.prepareCall("{call deleteSoftDrinks( ? ) }")) {
                    properCase.setInt(1,code);
                    properCase.execute();
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }break;                
        }
        removeShow();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> addList;
    private javax.swing.JButton addOrderB;
    private javax.swing.JTextField deleteText;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextField productNameText;
    private javax.swing.JButton queriesB;
    private javax.swing.JButton removeButton;
    private javax.swing.JComboBox<String> removeList;
    // End of variables declaration//GEN-END:variables
}
