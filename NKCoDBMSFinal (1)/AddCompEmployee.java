package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class AddCompEmployee extends javax.swing.JFrame {

    public AddCompEmployee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EmergencyContactNoText = new javax.swing.JLabel();
        Employee_TypeText = new javax.swing.JLabel();
        SSNText = new javax.swing.JTextField();
        FirstNameText = new javax.swing.JTextField();
        EmailAddressText = new javax.swing.JTextField();
        HomeAddressText = new javax.swing.JTextField();
        LastNameText = new javax.swing.JTextField();
        EmergencyContactNumText = new javax.swing.JTextField();
        SalaryText = new javax.swing.JTextField();
        EmergencyContactName = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        First_NameText = new javax.swing.JLabel();
        YearsInIndustryText = new javax.swing.JTextField();
        Last_NameText = new javax.swing.JLabel();
        Supervisor_SSNText = new javax.swing.JLabel();
        SSN_Text = new javax.swing.JLabel();
        SupervisorSSNText = new javax.swing.JTextField();
        Email_AddressText = new javax.swing.JLabel();
        DOBText = new javax.swing.JTextField();
        Salary_Text = new javax.swing.JLabel();
        DateOfBirthText = new javax.swing.JLabel();
        EmergencyContactNameText = new javax.swing.JLabel();
        BackToMain = new javax.swing.JButton();
        Home_AddressText = new javax.swing.JLabel();
        BackToMain1 = new javax.swing.JButton();
        Health_Insurance_FactorsText = new javax.swing.JLabel();
        Years_In_IndustryText = new javax.swing.JLabel();
        HealthInsFactorsText = new javax.swing.JComboBox<>();
        EmployeeTypeText = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        EmergencyContactNoText.setText("Emergency Contact #");

        Employee_TypeText.setText("Employee Type");

        SSNText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNTextActionPerformed(evt);
            }
        });

        FirstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTextActionPerformed(evt);
            }
        });

        EmailAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressTextActionPerformed(evt);
            }
        });

        LastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextActionPerformed(evt);
            }
        });

        SalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryTextActionPerformed(evt);
            }
        });

        EmergencyContactName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergencyContactNameActionPerformed(evt);
            }
        });

        AddBtn.setText("Add Comp Employee");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        First_NameText.setText("First Name");

        YearsInIndustryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearsInIndustryTextActionPerformed(evt);
            }
        });

        Last_NameText.setText("Last Name");

        Supervisor_SSNText.setText("Supervisor SSN");

        SSN_Text.setText("SSN");

        SupervisorSSNText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorSSNTextActionPerformed(evt);
            }
        });

        Email_AddressText.setText("Email Address");

        DOBText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBTextActionPerformed(evt);
            }
        });

        Salary_Text.setText("Salary");

        DateOfBirthText.setText("Date of Birth");

        EmergencyContactNameText.setText("Emergency Contact Name");

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
            }
        });

        Home_AddressText.setText("Home Address");

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn(evt);
            }
        });

        Health_Insurance_FactorsText.setText("Health Insurance Factors");

        Years_In_IndustryText.setText("Years In Industry");

        HealthInsFactorsText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Policy", "Family Policy" }));

        EmployeeTypeText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Designer", "Owner", "Account Executive", "Creative Director", "Secretary", "Financial Director", "Copywriter" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(541, 541, 541))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(414, 414, 414)
                                .addComponent(AddBtn)
                                .addGap(66, 66, 66)
                                .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Employee_TypeText)
                                    .addComponent(EmergencyContactNameText)
                                    .addComponent(EmergencyContactNoText)
                                    .addComponent(Salary_Text)
                                    .addComponent(SSN_Text)
                                    .addComponent(Email_AddressText)
                                    .addComponent(Home_AddressText)
                                    .addComponent(First_NameText)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(Health_Insurance_FactorsText))
                                    .addComponent(Last_NameText))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SSNText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FirstNameText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LastNameText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(HomeAddressText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EmailAddressText)
                                    .addComponent(SalaryText)
                                    .addComponent(EmergencyContactNumText)
                                    .addComponent(EmergencyContactName)
                                    .addComponent(HealthInsFactorsText, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EmployeeTypeText, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Years_In_IndustryText)
                                    .addComponent(Supervisor_SSNText)
                                    .addComponent(DateOfBirthText))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SupervisorSSNText, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YearsInIndustryText, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DOBText, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SSN_Text)
                                .addGap(18, 18, 18)
                                .addComponent(First_NameText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LastNameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Last_NameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Health_Insurance_FactorsText)
                            .addComponent(HealthInsFactorsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HomeAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Home_AddressText))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email_AddressText))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Employee_TypeText)
                            .addComponent(EmployeeTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salary_Text))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmergencyContactNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmergencyContactNoText))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmergencyContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmergencyContactNameText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DOBText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateOfBirthText))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Years_In_IndustryText)
                            .addComponent(YearsInIndustryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Supervisor_SSNText)
                            .addComponent(SupervisorSSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(BackToMain)
                    .addComponent(BackToMain1))
                .addGap(405, 405, 405))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SSNTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSNTextActionPerformed

    private void FirstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTextActionPerformed

    private void EmailAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddressTextActionPerformed

    private void SalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalaryTextActionPerformed

    private void EmergencyContactNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergencyContactNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmergencyContactNameActionPerformed

    private void YearsInIndustryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearsInIndustryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearsInIndustryTextActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        
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
            String Query = "INSERT INTO tkapp1db.Company_Employees (SSN , First_Name , Last_Name , Health_Ins_Factors , Home_Address , Email_Address , Employee_Type , Salary , Emergency_Cntct_Number , Emergency_Cntct_Name , Date_Of_Birth , Years_In_Industry , Super_SSN) VALUES ('"+SSNText.getText()+"' , '" +FirstNameText.getText()+"' , '" +LastNameText.getText()+"' , '" +HealthInsFactorsText.getSelectedItem()+"' , '" + HomeAddressText.getText()+"' , '" +EmailAddressText.getText()+"' , '" +EmployeeTypeText.getSelectedItem()+"' , '" +SalaryText.getText()+"' , '" +EmergencyContactNumText.getText()+"' , '" +EmergencyContactName.getText()+"' , '" +DOBText.getText()+"' , '" +YearsInIndustryText.getText()+"' , '" +SupervisorSSNText.getText()+"')";
            System.out.println(Query);
            stmt.execute(Query); 
            JOptionPane.showMessageDialog(null, " Employee Added To Database");
           
            FirstNameText.setText("");
            LastNameText.setText("");
            DOBText.setText("");
            HealthInsFactorsText.setSelectedItem("");
            HomeAddressText.setText("");
            EmailAddressText.setText("");
            EmployeeTypeText.setSelectedItem("");
            SalaryText.setText("");
            SSNText.setText("");
            EmergencyContactNumText.setText("");
            EmergencyContactName.setText("");
            YearsInIndustryText.setText("");
            SupervisorSSNText.setText("");
                  
        } catch (SQLException e){
            System.err.println(e);
        }

    }//GEN-LAST:event_AddBtnActionPerformed

    private void DOBTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBTextActionPerformed

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed
        
        this.toBack();
        MainCompEmployee b = new MainCompEmployee();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void LogoutBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogoutBtn

    private void LastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextActionPerformed

    private void SupervisorSSNTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorSSNTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupervisorSSNTextActionPerformed

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
            java.util.logging.Logger.getLogger(AddCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCompEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackToMain;
    private javax.swing.JButton BackToMain1;
    private javax.swing.JTextField DOBText;
    private javax.swing.JLabel DateOfBirthText;
    private javax.swing.JTextField EmailAddressText;
    private javax.swing.JLabel Email_AddressText;
    private javax.swing.JTextField EmergencyContactName;
    private javax.swing.JLabel EmergencyContactNameText;
    private javax.swing.JLabel EmergencyContactNoText;
    private javax.swing.JTextField EmergencyContactNumText;
    private javax.swing.JComboBox<String> EmployeeTypeText;
    private javax.swing.JLabel Employee_TypeText;
    private javax.swing.JTextField FirstNameText;
    private javax.swing.JLabel First_NameText;
    private javax.swing.JComboBox<String> HealthInsFactorsText;
    private javax.swing.JLabel Health_Insurance_FactorsText;
    private javax.swing.JTextField HomeAddressText;
    private javax.swing.JLabel Home_AddressText;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JLabel Last_NameText;
    private javax.swing.JTextField SSNText;
    private javax.swing.JLabel SSN_Text;
    private javax.swing.JTextField SalaryText;
    private javax.swing.JLabel Salary_Text;
    private javax.swing.JTextField SupervisorSSNText;
    private javax.swing.JLabel Supervisor_SSNText;
    private javax.swing.JTextField YearsInIndustryText;
    private javax.swing.JLabel Years_In_IndustryText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
