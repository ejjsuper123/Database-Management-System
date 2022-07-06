package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class AddAffiliatedCompany extends javax.swing.JFrame {

    /**
     * Creates new form AddAffiliatedCompany
     */
    public AddAffiliatedCompany() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Company_TypeText = new javax.swing.JLabel();
        CompanyTypeText = new javax.swing.JTextField();
        Work_RelationshipText = new javax.swing.JLabel();
        Associated_EmployeeText = new javax.swing.JLabel();
        BackToMain1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Company_AddressText = new javax.swing.JLabel();
        FederalIDText = new javax.swing.JTextField();
        NumberOfEmployeesText = new javax.swing.JTextField();
        CompanyRepPhoneNumberText = new javax.swing.JTextField();
        CompanyAddressText = new javax.swing.JTextField();
        CompanyPhoneNumberText = new javax.swing.JTextField();
        CompanyRepNameText = new javax.swing.JTextField();
        CompanyWebsiteText = new javax.swing.JTextField();
        FoundingDateText = new javax.swing.JTextField();
        CompanyNameText = new javax.swing.JTextField();
        Company_RepNameText = new javax.swing.JLabel();
        Federal_IDText = new javax.swing.JLabel();
        Copmany_RepPhoneNumberText = new javax.swing.JLabel();
        Company_NameText = new javax.swing.JLabel();
        BackToMain = new javax.swing.JButton();
        Company_PhoneNumberText = new javax.swing.JLabel();
        Company_WebsiteText = new javax.swing.JLabel();
        Founding_DateText = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        Number_OfEmployeesText = new javax.swing.JLabel();
        AssociatedEmployeeText = new javax.swing.JComboBox<>();
        WorkRelationshipText = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        Company_TypeText.setText("Company Type");

        Work_RelationshipText.setText("Work Relationship");

        Associated_EmployeeText.setText("Associated Employee");

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogtOutBtn(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        Company_AddressText.setText("Company Address");

        FederalIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FederalIDTextActionPerformed(evt);
            }
        });

        NumberOfEmployeesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfEmployeesTextActionPerformed(evt);
            }
        });

        CompanyRepPhoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyRepPhoneNumberTextActionPerformed(evt);
            }
        });

        CompanyNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyNameTextActionPerformed(evt);
            }
        });

        Company_RepNameText.setText("Company Rep Name");

        Federal_IDText.setText("Federal ID");

        Copmany_RepPhoneNumberText.setText("Company Rep Phone Number");

        Company_NameText.setText("Company Name");

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
            }
        });

        Company_PhoneNumberText.setText("Company Phone Number");

        Company_WebsiteText.setText("Company Website");

        Founding_DateText.setText("Founding Date");

        AddBtn.setText("Add Affiliated Company");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        Number_OfEmployeesText.setText("Number of Employees");

        AssociatedEmployeeText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "222334414", "010109909", "101232888", "111881119" }));

        WorkRelationshipText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client", "Vendor" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Company_AddressText)
                                    .addComponent(Founding_DateText)
                                    .addComponent(Company_NameText)
                                    .addComponent(Copmany_RepPhoneNumberText)
                                    .addComponent(Company_PhoneNumberText)
                                    .addComponent(Company_TypeText)
                                    .addComponent(Work_RelationshipText))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FoundingDateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompanyNameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompanyAddressText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompanyRepPhoneNumberText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompanyPhoneNumberText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompanyTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Associated_EmployeeText)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(AddBtn)
                                        .addGap(40, 40, 40)
                                        .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AssociatedEmployeeText, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(WorkRelationshipText, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Company_WebsiteText)
                                .addComponent(Company_RepNameText)
                                .addComponent(Federal_IDText)
                                .addComponent(Number_OfEmployeesText))
                            .addGap(76, 76, 76)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CompanyRepNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CompanyWebsiteText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FederalIDText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NumberOfEmployeesText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FederalIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Federal_IDText))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumberOfEmployeesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Number_OfEmployeesText)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyRepNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Company_RepNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyWebsiteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Company_WebsiteText))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Company_PhoneNumberText))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyRepPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Copmany_RepPhoneNumberText))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Company_AddressText))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompanyNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Company_NameText))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FoundingDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Founding_DateText))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Company_TypeText)
                    .addComponent(CompanyTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Work_RelationshipText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(WorkRelationshipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Associated_EmployeeText)
                    .addComponent(AssociatedEmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(BackToMain)
                    .addComponent(BackToMain1))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(982, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        try {
            final String ID = "tkapp1";
            final String PW = "COSC*ddoa3";
            final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Affiliated_Company";

            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO tkapp1db.Affiliated_Company (FederalID , Number_Employees , Company_Rep_Name , Company_Website , Company_Phone_Number , Company_Rep_Phone_Number , Company_Address , Company_Name , Founding_Date , Company_Type , Work_Relationship , Associated_Emp ) VALUES ('"+FederalIDText.getText()+"' , '" +NumberOfEmployeesText.getText()+"' , '" +CompanyRepNameText.getText()+"' , '" +CompanyWebsiteText.getText()+"' , '" +CompanyPhoneNumberText.getText()+"' , '" +CompanyRepPhoneNumberText.getText()+"' , '" +CompanyAddressText.getText()+"' , '" +CompanyNameText.getText()+"' , '" +FoundingDateText.getText()+"' , '" +CompanyTypeText.getText()+"' , '" +WorkRelationshipText.getSelectedItem()+"' , '" +AssociatedEmployeeText.getSelectedItem()+"')";
            System.out.println(Query);
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, " Affiliated Company Added To Database");

            FederalIDText.setText("");
            NumberOfEmployeesText.setText("");
            CompanyRepNameText.setText("");
            CompanyWebsiteText.setText("");
            CompanyPhoneNumberText.setText("");
            CompanyRepPhoneNumberText.setText("");
            CompanyAddressText.setText("");
            CompanyNameText.setText("");
            FoundingDateText.setText("");
            CompanyTypeText.setText("");
            WorkRelationshipText.setSelectedItem("");
            AssociatedEmployeeText.setSelectedItem("");

        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed

        this.toBack();
        MainAffiliatedCompany b = new MainAffiliatedCompany();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void CompanyNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyNameTextActionPerformed

    private void CompanyRepPhoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyRepPhoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyRepPhoneNumberTextActionPerformed

    private void NumberOfEmployeesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfEmployeesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberOfEmployeesTextActionPerformed

    private void FederalIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FederalIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FederalIDTextActionPerformed

    private void LogtOutBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogtOutBtn
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogtOutBtn

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
            java.util.logging.Logger.getLogger(AddAffiliatedCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAffiliatedCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAffiliatedCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAffiliatedCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAffiliatedCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> AssociatedEmployeeText;
    private javax.swing.JLabel Associated_EmployeeText;
    private javax.swing.JButton BackToMain;
    private javax.swing.JButton BackToMain1;
    private javax.swing.JTextField CompanyAddressText;
    private javax.swing.JTextField CompanyNameText;
    private javax.swing.JTextField CompanyPhoneNumberText;
    private javax.swing.JTextField CompanyRepNameText;
    private javax.swing.JTextField CompanyRepPhoneNumberText;
    private javax.swing.JTextField CompanyTypeText;
    private javax.swing.JTextField CompanyWebsiteText;
    private javax.swing.JLabel Company_AddressText;
    private javax.swing.JLabel Company_NameText;
    private javax.swing.JLabel Company_PhoneNumberText;
    private javax.swing.JLabel Company_RepNameText;
    private javax.swing.JLabel Company_TypeText;
    private javax.swing.JLabel Company_WebsiteText;
    private javax.swing.JLabel Copmany_RepPhoneNumberText;
    private javax.swing.JTextField FederalIDText;
    private javax.swing.JLabel Federal_IDText;
    private javax.swing.JTextField FoundingDateText;
    private javax.swing.JLabel Founding_DateText;
    private javax.swing.JTextField NumberOfEmployeesText;
    private javax.swing.JLabel Number_OfEmployeesText;
    private javax.swing.JComboBox<String> WorkRelationshipText;
    private javax.swing.JLabel Work_RelationshipText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
