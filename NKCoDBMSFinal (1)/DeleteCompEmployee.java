package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class DeleteCompEmployee extends javax.swing.JFrame {

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
    
    public DeleteCompEmployee() {
        initComponents();
        
        FillList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Employee_TypeText = new javax.swing.JLabel();
        EmployeeTypeText = new javax.swing.JTextField();
        SSNText = new javax.swing.JTextField();
        HomeAddressText = new javax.swing.JTextField();
        First_NameText = new javax.swing.JLabel();
        LastNameText = new javax.swing.JTextField();
        Last_NameText = new javax.swing.JLabel();
        HealthInsFactorsText = new javax.swing.JTextField();
        EmergencyContactNumText = new javax.swing.JTextField();
        Supervisor_SSNText = new javax.swing.JLabel();
        FirstNameText = new javax.swing.JTextField();
        SSN_Text = new javax.swing.JLabel();
        SupervisorSSNText = new javax.swing.JTextField();
        BackToMain = new javax.swing.JButton();
        Email_AddressText = new javax.swing.JLabel();
        DOBText = new javax.swing.JTextField();
        Salary_Text = new javax.swing.JLabel();
        DateOfBirthText = new javax.swing.JLabel();
        EmergencyContactNameText = new javax.swing.JLabel();
        Home_AddressText = new javax.swing.JLabel();
        Health_Insurance_FactorsText = new javax.swing.JLabel();
        Years_In_IndustryText = new javax.swing.JLabel();
        EmergencyContactNoText = new javax.swing.JLabel();
        EmailAddressText = new javax.swing.JTextField();
        SalaryText = new javax.swing.JTextField();
        EmergencyContactName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        YearsInIndustryText = new javax.swing.JTextField();
        DeleteCompEmployee = new javax.swing.JButton();
        BackToMain1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        Employee_TypeText.setText("Employee Type");

        SSNText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNTextActionPerformed(evt);
            }
        });

        First_NameText.setText("First Name");

        Last_NameText.setText("Last Name");

        Supervisor_SSNText.setText("Supervisor SSN");

        FirstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTextActionPerformed(evt);
            }
        });

        SSN_Text.setText("SSN");

        SupervisorSSNText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupervisorSSNTextActionPerformed(evt);
            }
        });

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
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

        Home_AddressText.setText("Home Address");

        Health_Insurance_FactorsText.setText("Health Insurance Factors");

        Years_In_IndustryText.setText("Years In Industry");

        EmergencyContactNoText.setText("Emergency Contact #");

        EmailAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressTextActionPerformed(evt);
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

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        YearsInIndustryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearsInIndustryTextActionPerformed(evt);
            }
        });

        DeleteCompEmployee.setText("Delete Company Employee");
        DeleteCompEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCompEmployeeActionPerformed(evt);
            }
        });

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmergencyContactNameText)
                            .addComponent(EmergencyContactNoText)
                            .addComponent(Health_Insurance_FactorsText)
                            .addComponent(Last_NameText)
                            .addComponent(SSN_Text)
                            .addComponent(Email_AddressText)
                            .addComponent(First_NameText)
                            .addComponent(Employee_TypeText)
                            .addComponent(Home_AddressText)
                            .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(HealthInsFactorsText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(LastNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FirstNameText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SSNText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EmergencyContactNumText)
                                            .addComponent(EmployeeTypeText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EmailAddressText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(HomeAddressText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EmergencyContactName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Supervisor_SSNText)
                                            .addGap(29, 29, 29))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(Years_In_IndustryText)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DateOfBirthText)
                                        .addGap(41, 41, 41))
                                    .addComponent(Salary_Text))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DOBText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(SupervisorSSNText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(YearsInIndustryText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(SalaryText)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(DeleteCompEmployee)
                                .addGap(46, 46, 46)
                                .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SSN_Text)
                            .addComponent(SSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DateOfBirthText)
                                .addComponent(DOBText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HomeAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmailAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(First_NameText))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Last_NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(YearsInIndustryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Years_In_IndustryText))
                                        .addGap(16, 16, 16)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Health_Insurance_FactorsText)
                                    .addComponent(HealthInsFactorsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Supervisor_SSNText)
                                    .addComponent(SupervisorSSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(Home_AddressText))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Salary_Text)
                                            .addComponent(SalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Email_AddressText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EmergencyContactNameText)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EmployeeTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Employee_TypeText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EmergencyContactNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmergencyContactNoText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmergencyContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackToMain1)
                    .addComponent(DeleteCompEmployee)
                    .addComponent(BackToMain))
                .addGap(33, 33, 33))
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

    private void SupervisorSSNTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupervisorSSNTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupervisorSSNTextActionPerformed

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed
        this.toBack();
        MainCompEmployee p = new MainCompEmployee();
        p.setVisible(true);
        p.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void DOBTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBTextActionPerformed

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

                SSNText.setText(rs.getString(1));
                FirstNameText.setText(rs.getString(2));
                LastNameText.setText(rs.getString(3));
                DOBText.setText(rs.getString(11));
                HealthInsFactorsText.setText(rs.getString(4));
                HomeAddressText.setText(rs.getString(5));
                EmailAddressText.setText(rs.getString(6));
                EmployeeTypeText.setText(rs.getString(7));
                SalaryText.setText(rs.getString(8));
                EmergencyContactNumText.setText(rs.getString(9));
                EmergencyContactName.setText(rs.getString(10));
                YearsInIndustryText.setText(rs.getString(12));
                SupervisorSSNText.setText(rs.getString(13));
            }

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void YearsInIndustryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearsInIndustryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearsInIndustryTextActionPerformed

    private void DeleteCompEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCompEmployeeActionPerformed
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
            String Query = "DELETE FROM tkapp1db.Company_Employees WHERE SSN = '"+List1.getSelectedValue()+"'";
            System.out.println(Query);
            stmt.execute(Query);
            
            JOptionPane.showMessageDialog(null,"Employee info deleted succesfully.");
            
            FillList();
          
        } catch (SQLException ex){
        JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_DeleteCompEmployeeActionPerformed

    private void LogoutBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogoutBtn

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
            java.util.logging.Logger.getLogger(DeleteCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteCompEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteCompEmployee().setVisible(true);
            }
        });
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMain;
    private javax.swing.JButton BackToMain1;
    private javax.swing.JTextField DOBText;
    private javax.swing.JLabel DateOfBirthText;
    private javax.swing.JButton DeleteCompEmployee;
    private javax.swing.JTextField EmailAddressText;
    private javax.swing.JLabel Email_AddressText;
    private javax.swing.JTextField EmergencyContactName;
    private javax.swing.JLabel EmergencyContactNameText;
    private javax.swing.JLabel EmergencyContactNoText;
    private javax.swing.JTextField EmergencyContactNumText;
    private javax.swing.JTextField EmployeeTypeText;
    private javax.swing.JLabel Employee_TypeText;
    private javax.swing.JTextField FirstNameText;
    private javax.swing.JLabel First_NameText;
    private javax.swing.JTextField HealthInsFactorsText;
    private javax.swing.JLabel Health_Insurance_FactorsText;
    private javax.swing.JTextField HomeAddressText;
    private javax.swing.JLabel Home_AddressText;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JLabel Last_NameText;
    private javax.swing.JList<String> List1;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

