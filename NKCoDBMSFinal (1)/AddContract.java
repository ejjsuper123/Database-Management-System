package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class AddContract extends javax.swing.JFrame {


    public AddContract() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Contract_BillAmountText = new javax.swing.JLabel();
        Contract_BillAmountPaidText = new javax.swing.JLabel();
        Employee_FeedbackScoreText = new javax.swing.JLabel();
        Vendor_FeedbackScoreText = new javax.swing.JLabel();
        Account_ManagerSSNText = new javax.swing.JLabel();
        ContractID = new javax.swing.JTextField();
        ProfitLossIDText = new javax.swing.JTextField();
        JobTypeText = new javax.swing.JTextField();
        ContractStartDateText = new javax.swing.JTextField();
        ContractBillAmountText = new javax.swing.JTextField();
        BackToMain1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Contract_IDText = new javax.swing.JLabel();
        Profit_LossIDText = new javax.swing.JLabel();
        Job_TypeText = new javax.swing.JLabel();
        Contract_Start_DateText = new javax.swing.JLabel();
        ContractBillAmountPaidText = new javax.swing.JTextField();
        EmployeeFeedbackScoreText = new javax.swing.JTextField();
        VendorFeedbackScoreText = new javax.swing.JTextField();
        Client_IDNumberText = new javax.swing.JLabel();
        ClientIDNumberText = new javax.swing.JTextField();
        BackToMain = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        ContractEndDateText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AccountManagerSSNText = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        Contract_BillAmountText.setText("Contract Bill Amount");

        Contract_BillAmountPaidText.setText("Contract Bill Amount Paid");

        Employee_FeedbackScoreText.setText("Employee Feedback Score");

        Vendor_FeedbackScoreText.setText("Vendor Feedback Score");

        Account_ManagerSSNText.setText("Account Manager SSN");

        ContractID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContractIDActionPerformed(evt);
            }
        });

        ProfitLossIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfitLossIDTextActionPerformed(evt);
            }
        });

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        Contract_IDText.setText("Contract ID");

        Profit_LossIDText.setText("Proftit-Loss ID");

        Job_TypeText.setText("Job Type");

        Contract_Start_DateText.setText("Contract Start Date");

        EmployeeFeedbackScoreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeFeedbackScoreTextActionPerformed(evt);
            }
        });

        VendorFeedbackScoreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorFeedbackScoreTextActionPerformed(evt);
            }
        });

        Client_IDNumberText.setText("Client ID Number");

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
            }
        });

        AddBtn.setText("Add Contract");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Contract End Date");

        AccountManagerSSNText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "010109909", "222334414", "818181818" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Contract_BillAmountText)
                                    .addComponent(Contract_Start_DateText)
                                    .addComponent(Job_TypeText)
                                    .addComponent(Profit_LossIDText)
                                    .addComponent(Contract_IDText)
                                    .addComponent(Contract_BillAmountPaidText))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ContractBillAmountPaidText)
                                    .addComponent(ContractBillAmountText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ContractStartDateText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JobTypeText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ProfitLossIDText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ContractID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Employee_FeedbackScoreText)
                                    .addComponent(Vendor_FeedbackScoreText)
                                    .addComponent(Account_ManagerSSNText)
                                    .addComponent(Client_IDNumberText)
                                    .addComponent(jLabel1))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EmployeeFeedbackScoreText)
                                    .addComponent(VendorFeedbackScoreText)
                                    .addComponent(ClientIDNumberText)
                                    .addComponent(ContractEndDateText, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(AccountManagerSSNText, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(AddBtn)
                                .addGap(59, 59, 59)
                                .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackToMain)
                    .addComponent(AddBtn)
                    .addComponent(BackToMain1))
                .addGap(350, 350, 350))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfitLossIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfitLossIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfitLossIDTextActionPerformed

    private void ContractIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContractIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContractIDActionPerformed

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed

        this.toBack();
        MainContract b = new MainContract();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
         // TODO code application logic here
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
            String Query = "INSERT INTO tkapp1db.Contract (ContractID , Profit_LossID , Job_Type , Contract_Start_Date , Contract_End_Date , Contract_Bill_Amount , Contract_Bill_Amount_Paid , Employee_Feedback_Score , Vendor_Feedback_Score , AcctMngr_SSN , ClientIDNumber) VALUES ('"+ContractID.getText()+"' , '" +ProfitLossIDText.getText()+"' , '" +JobTypeText.getText()+"' , '" +ContractStartDateText.getText()+"' , '"+ContractEndDateText.getText()+"' , '" +ContractBillAmountText.getText()+"' , '" +ContractBillAmountPaidText.getText()+"' , '" +EmployeeFeedbackScoreText.getText()+"' , '" +VendorFeedbackScoreText.getText()+"' , '" +AccountManagerSSNText.getSelectedItem()+"' , '" +ClientIDNumberText.getText()+"')";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, " Contract Added To Database");

            ContractID.setText("");
            ProfitLossIDText.setText("");
            JobTypeText.setText("");
            ContractStartDateText.setText("");
            ContractEndDateText.setText("");
            ContractBillAmountText.setText("");
            ContractBillAmountPaidText.setText("");
            EmployeeFeedbackScoreText.setText("");
            VendorFeedbackScoreText.setText("");
            AccountManagerSSNText.setSelectedItem("");
            ClientIDNumberText.setText("");

        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void LogoutBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogoutBtn

    private void EmployeeFeedbackScoreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeFeedbackScoreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeFeedbackScoreTextActionPerformed

    private void VendorFeedbackScoreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorFeedbackScoreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendorFeedbackScoreTextActionPerformed


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
            java.util.logging.Logger.getLogger(AddContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddContract().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccountManagerSSNText;
    private javax.swing.JLabel Account_ManagerSSNText;
    private javax.swing.JButton AddBtn;
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
    private javax.swing.JTextField ProfitLossIDText;
    private javax.swing.JLabel Profit_LossIDText;
    private javax.swing.JTextField VendorFeedbackScoreText;
    private javax.swing.JLabel Vendor_FeedbackScoreText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
