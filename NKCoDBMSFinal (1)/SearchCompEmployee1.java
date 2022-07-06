package nkcodbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class SearchCompEmployee1 extends javax.swing.JFrame {

    public SearchCompEmployee1() {
        initComponents();
        findUsers();
    }

    public Connection getConnection() {
        Connection con = null;
         final String ID = "tkapp1";
         final String PW = "COSC*ddoa3";

        try {
            con = DriverManager.getConnection("jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Company_Employees",ID,PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Company_Employees");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

    public ArrayList<User3> ListUsers(String ValToSearch) {
        ArrayList<User3> userList = new ArrayList<User3>();
        
        Statement st;
        ResultSet rs;
        
        try {
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM tkapp1db.Company_Employees WHERE CONCAT(SSN, First_Name, Last_Name, Health_Ins_Factors, Home_Address, Email_Address, Employee_Type, Salary, Emergency_Cntct_Number, Emergency_Cntct_Name, Date_Of_Birth, Years_In_Industry, Super_SSN) LIKE '%"+ValToSearch+"%'";
            System.out.println(searchQuery);
            rs = st.executeQuery(searchQuery);
            User3 user3;
            
            while(rs.next()) {
                user3 = new User3(
                        rs.getString("SSN"),
                        rs.getString("First_Name"),
                        rs.getString("Last_Name"),
                        rs.getString("Health_Ins_Factors"),
                        rs.getString("Home_Address"),
                        rs.getString("Email_Address"),
                        rs.getString("Employee_Type"),
                        rs.getString("Salary"),
                        rs.getString("Emergency_Cntct_Number"),
                        rs.getString("Emergency_Cntct_Name"),
                        rs.getString("Date_Of_Birth"),
                        rs.getString("Years_In_Industry"),
                        rs.getString("Super_SSN")
                );
                userList.add(user3);
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return userList;
    }
    
    public void findUsers() {
            ArrayList<User3> users = ListUsers(textSearch.getText());
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"SSN","First_Name","Last_Name","Health_Ins_Factors","Home_Address","Email_Address","Employee_Type","Salary","Emergency_Cntct_Number","Emergency_Cntct_Name","Date_Of_Birth","Years_In_Industry","Super_SSN"});
            Object[] row = new Object[13];
            for (int i = 0; i < users.size(); i++) {
                row[0] = users.get(i).getSSN();
                row[1] = users.get(i).getFirst_Name();
                row[2] = users.get(i).getLast_Name();
                row[3] = users.get(i).getHealth_Ins_Factors();
                row[4] = users.get(i).getHome_Address();
                row[5] = users.get(i).getEmail_Address();
                row[6] = users.get(i).getEmployee_Type();
                row[7] = users.get(i).getSalary();
                row[8] = users.get(i).getEmergency_Cntct_Number();
                row[9] = users.get(i).getEmergency_Cntct_Name();
                row[10] = users.get(i).getDate_Of_Birth();
                row[11] = users.get(i).getYears_In_Industry();
                row[12] = users.get(i).getSuper_SSN();

                model.addRow(row);
            }
            jTable1.setModel(model);
    };           
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textSearch = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackToTables = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 2, 240));

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BackToTables.setText("Back To Tables");
        BackToTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToTablesActionPerformed(evt);
            }
        });

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(BackToTables, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackToTables)
                    .addComponent(Logout))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        findUsers();
    }//GEN-LAST:event_SearchActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_LogoutActionPerformed

    private void BackToTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToTablesActionPerformed
        this.toBack();
        MainCompEmployee b = new MainCompEmployee();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_BackToTablesActionPerformed

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
            java.util.logging.Logger.getLogger(SearchCompEmployee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCompEmployee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCompEmployee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCompEmployee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCompEmployee1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToTables;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Search;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}
