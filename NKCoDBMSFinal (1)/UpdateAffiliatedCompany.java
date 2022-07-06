package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class UpdateAffiliatedCompany extends javax.swing.JFrame {

     final void FillList() {
        
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Affiliated_Company");
            
            DefaultListModel DLM = new DefaultListModel();
            
            while (rs.next()) {
                DLM.addElement(rs.getString(1));
            }
            
            List1.setModel(DLM);
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
     
    public UpdateAffiliatedCompany() {
        initComponents();
        
        FillList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Work_RelationshipText = new javax.swing.JLabel();
        CompanyPhoneNumberText = new javax.swing.JTextField();
        CompanyTypeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Company_WebsiteText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        CompanyWebsiteText = new javax.swing.JTextField();
        Company_AddressText = new javax.swing.JLabel();
        Company_NameText = new javax.swing.JLabel();
        BackToMain1 = new javax.swing.JButton();
        Company_PhoneNumberText = new javax.swing.JLabel();
        FederalIDText = new javax.swing.JTextField();
        CompanyRepPhoneNumberText = new javax.swing.JTextField();
        Company_RepNameText = new javax.swing.JLabel();
        Associated_EmployeeText = new javax.swing.JLabel();
        Copmany_RepPhoneNumberText = new javax.swing.JLabel();
        Company_TypeText = new javax.swing.JLabel();
        UpdateBoardOfDirectorGroup = new javax.swing.JButton();
        BackToMain = new javax.swing.JButton();
        CompanyNameText = new javax.swing.JTextField();
        CompanyAddressText = new javax.swing.JTextField();
        CompanyRepNameText = new javax.swing.JTextField();
        NumberOfEmployeesText = new javax.swing.JTextField();
        FoundingDateText = new javax.swing.JTextField();
        Federal_IDText = new javax.swing.JLabel();
        Number_OfEmployeesText = new javax.swing.JLabel();
        Founding_DateText = new javax.swing.JLabel();
        WorkRelationshipText = new javax.swing.JTextField();
        AssociatedEmployeeText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        Work_RelationshipText.setText("Work Relationship");

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        Company_WebsiteText.setText("Company Website");

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        Company_AddressText.setText("Company Address");

        Company_NameText.setText("Company Name");

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtn(evt);
            }
        });

        Company_PhoneNumberText.setText("Company Phone Number");

        FederalIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FederalIDTextActionPerformed(evt);
            }
        });

        CompanyRepPhoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyRepPhoneNumberTextActionPerformed(evt);
            }
        });

        Company_RepNameText.setText("Company Rep Name");

        Associated_EmployeeText.setText("Associated Employee");

        Copmany_RepPhoneNumberText.setText("Company Rep Phone Number");

        Company_TypeText.setText("Company Type");

        UpdateBoardOfDirectorGroup.setText("Update Affiliated Company");
        UpdateBoardOfDirectorGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBoardOfDirectorGroupActionPerformed(evt);
            }
        });

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
            }
        });

        CompanyNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyNameTextActionPerformed(evt);
            }
        });

        NumberOfEmployeesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfEmployeesTextActionPerformed(evt);
            }
        });

        Federal_IDText.setText("Federal ID");

        Number_OfEmployeesText.setText("Number of Employees");

        Founding_DateText.setText("Founding Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Company_AddressText)
                                            .addComponent(Company_NameText)
                                            .addComponent(Company_WebsiteText)
                                            .addComponent(Copmany_RepPhoneNumberText)
                                            .addComponent(Company_PhoneNumberText))
                                        .addGap(40, 40, 40))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Company_RepNameText)
                                            .addComponent(Federal_IDText)
                                            .addComponent(Number_OfEmployeesText))
                                        .addGap(69, 69, 69)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(CompanyRepNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NumberOfEmployeesText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FederalIDText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(CompanyNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CompanyAddressText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CompanyRepPhoneNumberText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CompanyPhoneNumberText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CompanyWebsiteText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UpdateBoardOfDirectorGroup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Founding_DateText)
                                    .addComponent(Company_TypeText)
                                    .addComponent(Work_RelationshipText)
                                    .addComponent(Associated_EmployeeText))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AssociatedEmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WorkRelationshipText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CompanyTypeText)
                                        .addComponent(FoundingDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FederalIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(NumberOfEmployeesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(CompanyRepNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Company_RepNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Federal_IDText)
                                        .addGap(18, 18, 18)
                                        .addComponent(Number_OfEmployeesText)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Company_WebsiteText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CompanyWebsiteText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FoundingDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Founding_DateText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CompanyTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Company_TypeText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Work_RelationshipText)
                                    .addComponent(WorkRelationshipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Associated_EmployeeText)
                                    .addComponent(AssociatedEmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CompanyPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Company_PhoneNumberText))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CompanyRepPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Copmany_RepPhoneNumberText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CompanyAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Company_AddressText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CompanyNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Company_NameText))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateBoardOfDirectorGroup)
                            .addComponent(BackToMain)
                            .addComponent(BackToMain1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
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

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed

        this.toBack();
        MainAffiliatedCompany b = new MainAffiliatedCompany();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Affiliated_Company WHERE FederalID = '"+List1.getSelectedValue()+"'");

            while (rs.next()) {
                NumberOfEmployeesText.setText(rs.getString(2));
                CompanyRepNameText.setText(rs.getString(3));
                CompanyWebsiteText.setText(rs.getString(4));
                CompanyPhoneNumberText.setText(rs.getString(5));
                CompanyRepPhoneNumberText.setText(rs.getString(6));
                CompanyAddressText.setText(rs.getString(7));
                CompanyNameText.setText(rs.getString(8));
                AssociatedEmployeeText.setText(rs.getString(12));
            }

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void FederalIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FederalIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FederalIDTextActionPerformed

    private void NumberOfEmployeesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfEmployeesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberOfEmployeesTextActionPerformed

    private void CompanyRepPhoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyRepPhoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyRepPhoneNumberTextActionPerformed

    private void CompanyNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompanyNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompanyNameTextActionPerformed

    private void UpdateBoardOfDirectorGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBoardOfDirectorGroupActionPerformed
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
            String Query = "UPDATE tkapp1db.Affiliated_Company SET Number_Employees = '"+NumberOfEmployeesText.getText()+"' , Company_Rep_Name = '"+CompanyRepNameText.getText()+"' , Company_Website = '"+CompanyWebsiteText.getText()+"' , Company_Phone_Number = '"+CompanyPhoneNumberText.getText()+"' , Company_Rep_Phone_Number = '"+CompanyRepPhoneNumberText.getText()+"' , Company_Address = '"+CompanyAddressText.getText()+"' , Company_Name = '"+CompanyNameText.getText()+"' , Associated_Emp = '"+AssociatedEmployeeText.getText()+"' WHERE FederalID = '"+List1.getSelectedValue()+"'";
            System.out.println(Query);
            stmt.execute(Query);

            JOptionPane.showMessageDialog(null,"Affiliated_Company info succesfully updated.");

            FillList();

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_UpdateBoardOfDirectorGroupActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateAffiliatedCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAffiliatedCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAffiliatedCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAffiliatedCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAffiliatedCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AssociatedEmployeeText;
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
    private javax.swing.JList<String> List1;
    private javax.swing.JTextField NumberOfEmployeesText;
    private javax.swing.JLabel Number_OfEmployeesText;
    private javax.swing.JButton UpdateBoardOfDirectorGroup;
    private javax.swing.JTextField WorkRelationshipText;
    private javax.swing.JLabel Work_RelationshipText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
