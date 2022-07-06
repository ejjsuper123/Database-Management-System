package nkcodbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class SearchContract1 extends javax.swing.JFrame {


    public SearchContract1() {
        initComponents();
        findUsers();
    }
    
    public Connection getConnection() {
        Connection con = null;
         final String ID = "tkapp1";
         final String PW = "COSC*ddoa3";

        try {
            con = DriverManager.getConnection("jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Contract",ID,PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Contract");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

    public ArrayList<User4> ListUsers(String ValToSearch) {
        ArrayList<User4> userList = new ArrayList<User4>();
        
        Statement st;
        ResultSet rs;
        
        try {
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM tkapp1db.Contract WHERE CONCAT(ContractID, Profit_LossID, Job_Type, Contract_Start_Date, Contract_End_Date, Contract_Bill_Amount, Contract_Bill_Amount_Paid, Employee_Feedback_Score, Vendor_Feedback_Score, AcctMngr_SSN, ClientIDNumber) LIKE '%"+ValToSearch+"%'";
            System.out.println(searchQuery);
            rs = st.executeQuery(searchQuery);
            User4 user4;
            
            while(rs.next()) {
                user4 = new User4(
                        rs.getString("ContractID"),
                        rs.getString("Profit_LossID"),
                        rs.getString("Job_Type"),
                        rs.getString("Contract_Start_Date"),
                        rs.getString("Contract_End_Date"),
                        rs.getString("Contract_Bill_Amount"),
                        rs.getString("Contract_Bill_Amount_Paid"),
                        rs.getString("Employee_Feedback_Score"),
                        rs.getString("Vendor_Feedback_Score"),
                        rs.getString("AcctMngr_SSN"),
                        rs.getString("ClientIDNumber")
                );
                userList.add(user4);
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return userList;
    }
    
    public void findUsers() {
            ArrayList<User4> users = ListUsers(TextSearch.getText());
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"ContractID","Profit_LossID","Job_Type","Contract_Start_Date","Contract_End_State","Contract_Bill_Amount","Contract_Bill_Amount_Paid","Employee_Feedback_Score","Vendor_Feedback_Score","AcctMngr_SSN", "ClientIDNumber"});
            Object[] row = new Object[13];
            for (int i = 0; i < users.size(); i++) {
                row[0] = users.get(i).getContractID();
                row[1] = users.get(i).getProfit_LossID();
                row[2] = users.get(i).getJob_Type();
                row[3] = users.get(i).getContract_Start_Date();
                row[4] = users.get(i).getContract_End_Date();
                row[5] = users.get(i).getContract_Bill_Amount();
                row[6] = users.get(i).getContract_Bill_Amount_Paid();
                row[7] = users.get(i).getEmployee_Feedback_Score();
                row[8] = users.get(i).getVendor_Feedback_Score();
                row[9] = users.get(i).getAcctMngr_SSN();
                row[10] = users.get(i).getClientIDNumber();

                model.addRow(row);
            }
            jTable1.setModel(model);
    };           
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        TextSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackToTables = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BackToTables.setText("Back To Tables");
        BackToTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToTablesActionPerformed(evt);
            }
        });

        LogOut.setText("Logout");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jButton1)
                        .addGap(462, 462, 462))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BackToTables, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogOut)
                    .addComponent(BackToTables))
                .addGap(162, 162, 162))
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogOutActionPerformed

    private void BackToTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToTablesActionPerformed
        this.toBack();
        MainContract b = new MainContract();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToTablesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        findUsers();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchContract1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchContract1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchContract1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchContract1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchContract1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToTables;
    private javax.swing.JButton LogOut;
    private javax.swing.JTextField TextSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
