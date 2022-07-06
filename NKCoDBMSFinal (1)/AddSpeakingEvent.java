package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class AddSpeakingEvent extends javax.swing.JFrame {

    public AddSpeakingEvent() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Speech_LocationText = new javax.swing.JLabel();
        SpeakingEventIDText = new javax.swing.JTextField();
        SpeechDateText = new javax.swing.JTextField();
        SpeechLocationText = new javax.swing.JTextField();
        HostOrganizationText = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        SpeechTimeText = new javax.swing.JTextField();
        Host_OrganizationNameText = new javax.swing.JLabel();
        Speech_DateText = new javax.swing.JLabel();
        Speaking_EventIDText = new javax.swing.JLabel();
        Event_BookingEmployeeText = new javax.swing.JLabel();
        BackToMain1 = new javax.swing.JButton();
        BackToMain = new javax.swing.JButton();
        EventBookingEmployeeText = new javax.swing.JComboBox<>();
        Speech_TimeText = new javax.swing.JLabel();
        Speech_TopicText = new javax.swing.JLabel();
        SpeechTopicText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        Speech_LocationText.setText("Speech Location");

        SpeakingEventIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeakingEventIDTextActionPerformed(evt);
            }
        });

        SpeechDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeechDateTextActionPerformed(evt);
            }
        });

        AddBtn.setText("Add Speaking Event");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        Host_OrganizationNameText.setText("Host Organization Name");

        Speech_DateText.setText("Speech Date");

        Speaking_EventIDText.setText("Speaking Event ID");

        Event_BookingEmployeeText.setText("Event Booking Employee");

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn(evt);
            }
        });

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
            }
        });

        EventBookingEmployeeText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "818181818", "222334414", "010109909" }));

        Speech_TimeText.setText("Speech Time");

        Speech_TopicText.setText("Speech Topic");

        SpeechTopicText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeechTopicTextActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addContainerGap(542, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Speech_LocationText)
                                    .addComponent(Event_BookingEmployeeText)
                                    .addComponent(Speech_TopicText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SpeechLocationText, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                                    .addComponent(EventBookingEmployeeText, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpeechTopicText)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Speaking_EventIDText)
                                    .addComponent(Speech_DateText)
                                    .addComponent(Host_OrganizationNameText)
                                    .addComponent(Speech_TimeText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(SpeechDateText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SpeakingEventIDText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(HostOrganizationText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SpeechTimeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(AddBtn)
                .addGap(46, 46, 46)
                .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Speaking_EventIDText)
                        .addGap(18, 18, 18)
                        .addComponent(Speech_DateText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SpeakingEventIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(SpeechDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Host_OrganizationNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HostOrganizationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpeechTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Speech_TimeText))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpeechLocationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Speech_LocationText))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Event_BookingEmployeeText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EventBookingEmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Speech_TopicText)
                    .addComponent(SpeechTopicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(BackToMain)
                    .addComponent(BackToMain1))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Speaking_Event";

            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            String Query = "INSERT INTO tkapp1db.Speaking_Event (EventID , Speech_Date , Host_Org_Name , Speech_Time , Speech_Location , BookingEmp_SSN) VALUES ('"+SpeakingEventIDText.getText()+"' , '" +SpeechDateText.getText()+"' , '" +HostOrganizationText.getText()+"' , '" +SpeechTimeText.getText()+"' , '" + SpeechLocationText.getText()+"' , '" +EventBookingEmployeeText.getSelectedItem()+"' , '" +SpeechTopicText.getText()+"')";
            System.out.println(Query);
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, " Speaking Event Added to the Database");
            
            SpeakingEventIDText.setText("");
            SpeechDateText.setText("");
            HostOrganizationText.setText("");
            SpeechTimeText.setText("");
            SpeechLocationText.setText("");
            EventBookingEmployeeText.setSelectedItem("");
            SpeechTopicText.setText("");

        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed

        this.toBack();
        MainSpeakingEvent b = new MainSpeakingEvent();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void SpeakingEventIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeakingEventIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpeakingEventIDTextActionPerformed

    private void SpeechDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeechDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpeechDateTextActionPerformed

    private void LogoutBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogoutBtn

    private void SpeechTopicTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeechTopicTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpeechTopicTextActionPerformed

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
            java.util.logging.Logger.getLogger(AddSpeakingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSpeakingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSpeakingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSpeakingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSpeakingEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackToMain;
    private javax.swing.JButton BackToMain1;
    private javax.swing.JComboBox<String> EventBookingEmployeeText;
    private javax.swing.JLabel Event_BookingEmployeeText;
    private javax.swing.JTextField HostOrganizationText;
    private javax.swing.JLabel Host_OrganizationNameText;
    private javax.swing.JTextField SpeakingEventIDText;
    private javax.swing.JLabel Speaking_EventIDText;
    private javax.swing.JTextField SpeechDateText;
    private javax.swing.JTextField SpeechLocationText;
    private javax.swing.JTextField SpeechTimeText;
    private javax.swing.JTextField SpeechTopicText;
    private javax.swing.JLabel Speech_DateText;
    private javax.swing.JLabel Speech_LocationText;
    private javax.swing.JLabel Speech_TimeText;
    private javax.swing.JLabel Speech_TopicText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
