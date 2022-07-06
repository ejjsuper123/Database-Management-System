package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class UpdateCompEmployee extends javax.swing.JFrame {

    final void FillList() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        try {
            final String ID = "tkapp1";
            final String PW = "COSC*ddoa3";
            final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Company_Employees";
        
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Company_Employees");
            
            DefaultListModel DLM = new DefaultListModel();
            
            while (rs.next()) {
                DLM.addElement(rs.getString(1));
            }
            
            List1.setModel(DLM);
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
    public UpdateCompEmployee() {
        initComponents();
        
        FillList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Email_AddressText = new javax.swing.JLabel();
        HomeAddressText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        SSN_Text = new javax.swing.JLabel();
        SSNText = new javax.swing.JTextField();
        Salary_Text = new javax.swing.JLabel();
        BackToMain1 = new javax.swing.JButton();
        YearsInIndustryText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        HealthInsFactorsText = new javax.swing.JTextField();
        EmergencyContactNameText = new javax.swing.JLabel();
        EmergencyContactNumText = new javax.swing.JTextField();
        Home_AddressText = new javax.swing.JLabel();
        EmailAddressText = new javax.swing.JTextField();
        UpdateCompEmployee = new javax.swing.JButton();
        SalaryText = new javax.swing.JTextField();
        Health_Insurance_FactorsText = new javax.swing.JLabel();
        BackToMain = new javax.swing.JButton();
        Years_In_IndustryText = new javax.swing.JLabel();
        EmergencyContactName = new javax.swing.JTextField();
        EmergencyContactNoText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        Email_AddressText.setText("Email Address");

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        SSN_Text.setText("SSN");

        SSNText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNTextActionPerformed(evt);
            }
        });

        Salary_Text.setText("Salary");

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtn(evt);
            }
        });

        YearsInIndustryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearsInIndustryTextActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        EmergencyContactNameText.setText("Emergency Contact Name");

        Home_AddressText.setText("Home Address");

        EmailAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressTextActionPerformed(evt);
            }
        });

        UpdateCompEmployee.setText("Update Company Employee");
        UpdateCompEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCompEmployeeActionPerformed(evt);
            }
        });

        SalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryTextActionPerformed(evt);
            }
        });

        Health_Insurance_FactorsText.setText("Health Insurance Factors");

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
            }
        });

        Years_In_IndustryText.setText("Years In Industry");

        EmergencyContactName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergencyContactNameActionPerformed(evt);
            }
        });

        EmergencyContactNoText.setText("Emergency Contact #");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmergencyContactNameText)
                                    .addComponent(EmergencyContactNoText)
                                    .addComponent(Salary_Text)
                                    .addComponent(Health_Insurance_FactorsText)
                                    .addComponent(Home_AddressText)
                                    .addComponent(Email_AddressText)
                                    .addComponent(SSN_Text))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(UpdateCompEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(EmergencyContactNumText, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(SalaryText, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(EmailAddressText, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(HomeAddressText, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(HealthInsFactorsText, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(SSNText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Years_In_IndustryText)
                                                .addGap(18, 18, 18)
                                                .addComponent(YearsInIndustryText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(EmergencyContactName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BackToMain))))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SSN_Text)
                            .addComponent(SSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Years_In_IndustryText)
                            .addComponent(YearsInIndustryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Health_Insurance_FactorsText)
                            .addComponent(HealthInsFactorsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Home_AddressText)
                            .addComponent(HomeAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email_AddressText)
                            .addComponent(EmailAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Salary_Text)
                            .addComponent(SalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmergencyContactNoText)
                            .addComponent(EmergencyContactNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmergencyContactNameText)
                            .addComponent(EmergencyContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackToMain)
                            .addComponent(UpdateCompEmployee)
                            .addComponent(BackToMain1))))
                .addContainerGap(88, Short.MAX_VALUE))
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

    private void EmailAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressTextActionPerformed

    }//GEN-LAST:event_EmailAddressTextActionPerformed

    private void SalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryTextActionPerformed

    }//GEN-LAST:event_SalaryTextActionPerformed

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed
        this.toBack();
        MainCompEmployee p = new MainCompEmployee();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void EmergencyContactNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergencyContactNameActionPerformed

    }//GEN-LAST:event_EmergencyContactNameActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        try {
            final String ID = "tkapp1";
            final String PW = "COSC*ddoa3";
            final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Company_Employees";

            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Company_Employees WHERE SSN = '"+List1.getSelectedValue()+"'");

            while (rs.next()) {
                HealthInsFactorsText.setText(rs.getString(4));
                HomeAddressText.setText(rs.getString(5));
                EmailAddressText.setText(rs.getString(6));
                SalaryText.setText(rs.getString(8));
                EmergencyContactNumText.setText(rs.getString(9));
                EmergencyContactName.setText(rs.getString(10));
                YearsInIndustryText.setText(rs.getString(12));

            }

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void YearsInIndustryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearsInIndustryTextActionPerformed

    }//GEN-LAST:event_YearsInIndustryTextActionPerformed

    private void UpdateCompEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCompEmployeeActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        try {
            final String ID = "tkapp1";
            final String PW = "COSC*ddoa3";
            final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Company_Employees";

            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            String Query = "UPDATE tkapp1db.Company_Employees SET Health_Ins_Factors = '"+HealthInsFactorsText.getText()+"' , Home_Address = '"+HomeAddressText.getText()+"' , Email_Address = '"+EmailAddressText.getText()+"' , Salary = '"+SalaryText.getText()+"' , Emergency_Cntct_Number = '"+EmergencyContactNumText.getText()+"' , Emergency_Cntct_Name = '"+EmergencyContactName.getText()+"' , Years_In_Industry = '"+YearsInIndustryText.getText()+"' WHERE SSN = '"+List1.getSelectedValue()+"'";
            System.out.println(Query);
            stmt.execute(Query);

            JOptionPane.showMessageDialog(null,"Employee info succesfully updated.");

            FillList();

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_UpdateCompEmployeeActionPerformed

    private void SSNTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSNTextActionPerformed

    private void LogOutBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtn
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogOutBtn

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
            java.util.logging.Logger.getLogger(UpdateCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCompEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMain;
    private javax.swing.JButton BackToMain1;
    private javax.swing.JTextField EmailAddressText;
    private javax.swing.JLabel Email_AddressText;
    private javax.swing.JTextField EmergencyContactName;
    private javax.swing.JLabel EmergencyContactNameText;
    private javax.swing.JLabel EmergencyContactNoText;
    private javax.swing.JTextField EmergencyContactNumText;
    private javax.swing.JTextField HealthInsFactorsText;
    private javax.swing.JLabel Health_Insurance_FactorsText;
    private javax.swing.JTextField HomeAddressText;
    private javax.swing.JLabel Home_AddressText;
    private javax.swing.JList<String> List1;
    private javax.swing.JTextField SSNText;
    private javax.swing.JLabel SSN_Text;
    private javax.swing.JTextField SalaryText;
    private javax.swing.JLabel Salary_Text;
    private javax.swing.JButton UpdateCompEmployee;
    private javax.swing.JTextField YearsInIndustryText;
    private javax.swing.JLabel Years_In_IndustryText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
