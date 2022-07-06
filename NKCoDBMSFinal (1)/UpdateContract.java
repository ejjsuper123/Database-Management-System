package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class UpdateContract extends javax.swing.JFrame {

    final void FillList() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        try {
            final String ID = "tkapp1";
            final String PW = "COSC*ddoa3";
            final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Contract";
        
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Contract");
            
            DefaultListModel DLM = new DefaultListModel();
            
            while (rs.next()) {
                DLM.addElement(rs.getString(1));
            }
            
            List1.setModel(DLM);
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
    
    public UpdateContract() {
        initComponents();
        
        FillList();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Contract_BillAmountPaidText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        EmployeeFeedbackScoreText = new javax.swing.JTextField();
        Vendor_FeedbackScoreText = new javax.swing.JLabel();
        BackToMain1 = new javax.swing.JButton();
        VendorFeedbackScoreText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Account_ManagerSSNText = new javax.swing.JLabel();
        AccountManagerSSNText = new javax.swing.JTextField();
        Client_IDNumberText = new javax.swing.JLabel();
        Contract_IDText = new javax.swing.JLabel();
        ContractID = new javax.swing.JTextField();
        BackToMain = new javax.swing.JButton();
        Profit_LossIDText = new javax.swing.JLabel();
        ProfitLossIDText = new javax.swing.JTextField();
        ClientIDNumberText = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        Job_TypeText = new javax.swing.JLabel();
        JobTypeText = new javax.swing.JTextField();
        ContractEndDateText = new javax.swing.JTextField();
        Contract_Start_DateText = new javax.swing.JLabel();
        ContractStartDateText = new javax.swing.JTextField();
        Contract_BillAmountText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ContractBillAmountText = new javax.swing.JTextField();
        ContractBillAmountPaidText = new javax.swing.JTextField();
        Employee_FeedbackScoreText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        Contract_BillAmountPaidText.setText("Contract Bill Amount Paid");

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        Vendor_FeedbackScoreText.setText("Vendor Feedback Score");

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtn(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        Account_ManagerSSNText.setText("Account Manager SSN");

        Client_IDNumberText.setText("Client ID Number");

        Contract_IDText.setText("Contract ID");

        ContractID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContractIDActionPerformed(evt);
            }
        });

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
            }
        });

        Profit_LossIDText.setText("Proftit-Loss ID");

        ProfitLossIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfitLossIDTextActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update Contract");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        Job_TypeText.setText("Job Type");

        Contract_Start_DateText.setText("Contract Start Date");

        Contract_BillAmountText.setText("Contract Bill Amount");

        jLabel1.setText("Contract End Date");

        Employee_FeedbackScoreText.setText("Employee Feedback Score");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UpdateBtn)
                                .addGap(32, 32, 32)
                                .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Contract_BillAmountText)
                                    .addComponent(Contract_Start_DateText)
                                    .addComponent(Job_TypeText)
                                    .addComponent(Profit_LossIDText)
                                    .addComponent(Contract_IDText)
                                    .addComponent(Contract_BillAmountPaidText))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ContractBillAmountText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ContractStartDateText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JobTypeText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ProfitLossIDText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ContractID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ContractBillAmountPaidText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Employee_FeedbackScoreText)
                                    .addComponent(Account_ManagerSSNText)
                                    .addComponent(Client_IDNumberText)
                                    .addComponent(jLabel1)
                                    .addComponent(Vendor_FeedbackScoreText))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ContractEndDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AccountManagerSSNText)
                                        .addComponent(VendorFeedbackScoreText)
                                        .addComponent(EmployeeFeedbackScoreText)
                                        .addComponent(ClientIDNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Contract_IDText)
                            .addComponent(Employee_FeedbackScoreText)
                            .addComponent(ContractID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeeFeedbackScoreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Profit_LossIDText)
                            .addComponent(Vendor_FeedbackScoreText)
                            .addComponent(ProfitLossIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VendorFeedbackScoreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Job_TypeText)
                            .addComponent(Account_ManagerSSNText)
                            .addComponent(JobTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccountManagerSSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Contract_Start_DateText)
                            .addComponent(ContractStartDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Client_IDNumberText)
                            .addComponent(ClientIDNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Contract_BillAmountText)
                            .addComponent(ContractBillAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContractEndDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Contract_BillAmountPaidText)
                            .addComponent(ContractBillAmountPaidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateBtn)
                            .addComponent(BackToMain)
                            .addComponent(BackToMain1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContractIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContractIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContractIDActionPerformed

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed

        this.toBack();
        MainContract b = new MainContract();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void ProfitLossIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfitLossIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfitLossIDTextActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        try {
            final String ID = "tkapp1";
            final String PW = "COSC*ddoa3";
            final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Contract";

            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            String Query = "UPDATE tkapp1db.Contract SET Contract_Bill_Amount_Paid = '"+ContractBillAmountPaidText.getText()+"' , Employee_Feedback_Score = '"+EmployeeFeedbackScoreText.getText()+"' , Vendor_Feedback_Score = '"+VendorFeedbackScoreText.getText()+"' WHERE ContractID = '"+List1.getSelectedValue()+"'";
            System.out.println(Query);
            stmt.execute(Query);

            JOptionPane.showMessageDialog(null,"Contract succesfully updated.");

            FillList();

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        try {
            final String ID = "tkapp1";
            final String PW = "COSC*ddoa3";
            final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Contract";

            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Contract WHERE ContractID = '"+List1.getSelectedValue()+"'");

            while (rs.next()) {
                ContractBillAmountPaidText.setText(rs.getString(7));
                EmployeeFeedbackScoreText.setText(rs.getString(8));
                VendorFeedbackScoreText.setText(rs.getString(9));
            }

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void LogOutBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtn
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogOutBtn

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
            java.util.logging.Logger.getLogger(UpdateContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateContract().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountManagerSSNText;
    private javax.swing.JLabel Account_ManagerSSNText;
    private javax.swing.JButton BackToMain;
    private javax.swing.JButton BackToMain1;
    private javax.swing.JTextField ClientIDNumberText;
    private javax.swing.JLabel Client_IDNumberText;
    private javax.swing.JTextField ContractBillAmountPaidText;
    private javax.swing.JTextField ContractBillAmountText;
    private javax.swing.JTextField ContractEndDateText;
    private javax.swing.JTextField ContractID;
    private javax.swing.JTextField ContractStartDateText;
    private javax.swing.JLabel Contract_BillAmountPaidText;
    private javax.swing.JLabel Contract_BillAmountText;
    private javax.swing.JLabel Contract_IDText;
    private javax.swing.JLabel Contract_Start_DateText;
    private javax.swing.JTextField EmployeeFeedbackScoreText;
    private javax.swing.JLabel Employee_FeedbackScoreText;
    private javax.swing.JTextField JobTypeText;
    private javax.swing.JLabel Job_TypeText;
    private javax.swing.JList<String> List1;
    private javax.swing.JTextField ProfitLossIDText;
    private javax.swing.JLabel Profit_LossIDText;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField VendorFeedbackScoreText;
    private javax.swing.JLabel Vendor_FeedbackScoreText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
