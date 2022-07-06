package nkcodbms;

import java.sql.*;
import javax.swing.*;

public class UpdateSpeakingEvent extends javax.swing.JFrame {

    final void FillList() {
        
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Speaking_Event");
            
            DefaultListModel DLM = new DefaultListModel();
            
            while (rs.next()) {
                DLM.addElement(rs.getString(1));
            }
            
            List1.setModel(DLM);
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
    
    public UpdateSpeakingEvent() {
        initComponents();
        
        FillList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SpeakingEventIDText = new javax.swing.JTextField();
        BackToMain = new javax.swing.JButton();
        SpeechDateText = new javax.swing.JTextField();
        Speech_LocationText = new javax.swing.JLabel();
        Speaking_EventIDText = new javax.swing.JLabel();
        SpeechLocationText = new javax.swing.JTextField();
        Speech_DateText = new javax.swing.JLabel();
        HostOrganizationText = new javax.swing.JTextField();
        Event_BookingEmployeeText = new javax.swing.JLabel();
        Host_OrganizationNameText = new javax.swing.JLabel();
        Speech_TimeText = new javax.swing.JLabel();
        SpeechTimeText = new javax.swing.JTextField();
        EventBookingEmployeeText = new javax.swing.JTextField();
        UpdateSpeakingEvent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        BackToMain1 = new javax.swing.JButton();
        Speech_TopicText = new javax.swing.JLabel();
        SpeechTopicText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\Latest Screen Shot.PNG")); // NOI18N

        SpeakingEventIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeakingEventIDTextActionPerformed(evt);
            }
        });

        BackToMain.setText("Back To Tables");
        BackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMainActionPerformed(evt);
            }
        });

        SpeechDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeechDateTextActionPerformed(evt);
            }
        });

        Speech_LocationText.setText("Speech Location");

        Speaking_EventIDText.setText("Speaking Event ID");

        Speech_DateText.setText("Speech Date");

        Event_BookingEmployeeText.setText("Event Booking Employee");

        Host_OrganizationNameText.setText("Host Organization Name");

        Speech_TimeText.setText("Speech Time");

        UpdateSpeakingEvent.setText("Update Speaking Event");
        UpdateSpeakingEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSpeakingEventActionPerformed(evt);
            }
        });

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        BackToMain1.setText("Logout");
        BackToMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtn(evt);
            }
        });

        Speech_TopicText.setText("Speech Topic");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Speaking_EventIDText)
                                                .addComponent(Speech_DateText)
                                                .addComponent(Host_OrganizationNameText))
                                            .addGap(48, 48, 48))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Speech_TimeText)
                                            .addGap(104, 104, 104)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SpeechTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(SpeakingEventIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(HostOrganizationText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SpeechDateText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Speech_LocationText)
                                        .addComponent(Event_BookingEmployeeText)
                                        .addComponent(Speech_TopicText))
                                    .addGap(47, 47, 47)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SpeechLocationText)
                                        .addComponent(EventBookingEmployeeText)
                                        .addComponent(SpeechTopicText))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UpdateSpeakingEvent)
                                .addGap(31, 31, 31)
                                .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(BackToMain1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Speaking_EventIDText)
                                .addGap(18, 18, 18)
                                .addComponent(Speech_DateText)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SpeakingEventIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SpeechDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Host_OrganizationNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HostOrganizationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Speech_TimeText)
                            .addComponent(SpeechTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Speech_LocationText)
                            .addComponent(SpeechLocationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EventBookingEmployeeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Event_BookingEmployeeText))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Speech_TopicText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(SpeechTopicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackToMain)
                            .addComponent(UpdateSpeakingEvent)
                            .addComponent(BackToMain1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
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

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
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
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Speaking_Event WHERE EventID = '"+List1.getSelectedValue()+"'");

            while (rs.next()) {
                SpeechDateText.setText(rs.getString(2));
                HostOrganizationText.setText(rs.getString(3));
                SpeechTimeText.setText(rs.getString(4));
                SpeechLocationText.setText(rs.getString(5));
                SpeechTopicText.setText(rs.getString(7));
            }

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void SpeakingEventIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeakingEventIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpeakingEventIDTextActionPerformed

    private void BackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMainActionPerformed

        this.toBack();
        MainSpeakingEvent b = new MainSpeakingEvent();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToMainActionPerformed

    private void SpeechDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeechDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpeechDateTextActionPerformed

    private void UpdateSpeakingEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSpeakingEventActionPerformed
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
            String Query = "UPDATE tkapp1db.Speaking_Event SET Speech_Date = '"+SpeechDateText.getText()+"' , Host_Org_Name = '"+HostOrganizationText.getText()+"' , Speech_Time = '"+SpeechTimeText.getText()+"' , Speech_Location = '"+SpeechLocationText.getText()+"' , Speech_Topic = '"+SpeechTopicText.getText()+ "' WHERE EventID = '"+List1.getSelectedValue()+"'";
            System.out.println(Query);
            stmt.execute(Query);

            JOptionPane.showMessageDialog(null,"Speaking Event succesfully updated.");

            FillList();

        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_UpdateSpeakingEventActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateSpeakingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateSpeakingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateSpeakingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateSpeakingEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateSpeakingEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMain;
    private javax.swing.JButton BackToMain1;
    private javax.swing.JTextField EventBookingEmployeeText;
    private javax.swing.JLabel Event_BookingEmployeeText;
    private javax.swing.JTextField HostOrganizationText;
    private javax.swing.JLabel Host_OrganizationNameText;
    private javax.swing.JList<String> List1;
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
    private javax.swing.JButton UpdateSpeakingEvent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
