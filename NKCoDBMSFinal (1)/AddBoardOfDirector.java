package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class AddBoardOfDirector extends javax.swing.JFrame {

    public AddBoardOfDirector() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackToMain = new javax.swing.JButton();
        AssociationIDText = new javax.swing.JTextField();
        AssociationNameText = new javax.swing.JTextField();
        AddBoardOfDirectorGroup = new javax.swing.JButton();
        BackToMain1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Association_Name = new javax.swing.JLabel();
        Owner_SSNText = new javax.swing.JLabel();
        Association_ID_Text = new javax.swing.JLabel();
        OwnerSSNText = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
            }
        });

        AssociationIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssociationIDTextActionPerformed(evt);
            }
        });

        AssociationNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssociationNameTextActionPerformed(evt);
            }
        });

        AddBoardOfDirectorGroup.setText("Add Board Of Director Group");
        AddBoardOfDirectorGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBoardOfDirectorGroupActionPerformed(evt);
            }
        });

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutOutBtn(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        Association_Name.setText("Association Name");

        Owner_SSNText.setText("Owner SSN");

        Association_ID_Text.setText("Association ID");

        OwnerSSNText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "818181818" }));
        OwnerSSNText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerSSNTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(AddBoardOfDirectorGroup)
                        .addGap(62, 62, 62)
                        .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Owner_SSNText)
                            .addComponent(Association_ID_Text)
                            .addComponent(Association_Name))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AssociationNameText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OwnerSSNText, javax.swing.GroupLayout.Alignment.LEADING, 0, 262, Short.MAX_VALUE)
                            .addComponent(AssociationIDText))))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Association_ID_Text)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AssociationIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AssociationNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Association_Name))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Owner_SSNText, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OwnerSSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBoardOfDirectorGroup)
                    .addComponent(BackToMain)
                    .addComponent(BackToMain1))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed

        this.toBack();
        MainBoardOfDirectors b = new MainBoardOfDirectors();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void AssociationIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssociationIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssociationIDTextActionPerformed

    private void AssociationNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssociationNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssociationNameTextActionPerformed

    private void AddBoardOfDirectorGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBoardOfDirectorGroupActionPerformed
        // TODO code application logic here
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        try {
            final String ID = "tkapp1";
            final String PW = "COSC*ddoa3";
            final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Board_Of_Directors";

            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO tkapp1db.Board_Of_Directors (AssociationID , Association_Name , Owner_SSN ) VALUES ('"+AssociationIDText.getText()+"' , '" +AssociationNameText.getText()+"' , '" +OwnerSSNText.getSelectedItem()+"')";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, " Board of Director Group Added To Database");

            AssociationIDText.setText("");
            AssociationNameText.setText("");
            OwnerSSNText.setSelectedItem("");

        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_AddBoardOfDirectorGroupActionPerformed

    private void LogoutOutBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutOutBtn
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogoutOutBtn

    private void OwnerSSNTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnerSSNTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OwnerSSNTextActionPerformed

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
            java.util.logging.Logger.getLogger(AddBoardOfDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBoardOfDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBoardOfDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBoardOfDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBoardOfDirector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBoardOfDirectorGroup;
    private javax.swing.JTextField AssociationIDText;
    private javax.swing.JTextField AssociationNameText;
    private javax.swing.JLabel Association_ID_Text;
    private javax.swing.JLabel Association_Name;
    private javax.swing.JButton BackToMain;
    private javax.swing.JButton BackToMain1;
    private javax.swing.JComboBox<String> OwnerSSNText;
    private javax.swing.JLabel Owner_SSNText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
