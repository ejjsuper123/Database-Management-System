package nkcodbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class SearchAffiliatedCompany1 extends javax.swing.JFrame {

    public SearchAffiliatedCompany1() {
        initComponents();
        findUsers();
    }

    public Connection getConnection() {
        Connection con = null;
         final String ID = "tkapp1";
         final String PW = "COSC*ddoa3";

        try {
            con = DriverManager.getConnection("jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db.Affiliated_Company",ID,PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Affiliated_Company");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

    public ArrayList<User> ListUsers(String ValToSearch) {
        ArrayList<User> userList = new ArrayList<User>();
        
        Statement st;
        ResultSet rs;
        
        try {
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM tkapp1db.Affiliated_Company WHERE CONCAT(FederalID, Number_Employees, Company_Rep_Name, Company_Website, Company_Phone_Number, Company_Rep_Phone_Number, Company_Address, Company_Name, Founding_Date, Company_Type, Work_Relationship, Associated_Emp) LIKE '%"+ValToSearch+"%'";
            System.out.println(searchQuery);
            rs = st.executeQuery(searchQuery);
            User user;
            
            while(rs.next()) {
                user = new User(
                        rs.getString("FederalID"),
                        rs.getString("Number_Employees"),
                        rs.getString("Company_Rep_Name"),
                        rs.getString("Company_Website"),
                        rs.getString("Company_Phone_Number"),
                        rs.getString("Company_Rep_Phone_Number"),
                        rs.getString("Company_Address"),
                        rs.getString("Company_Name"),
                        rs.getString("Founding_Date"),
                        rs.getString("Company_Type"),
                        rs.getString("Work_Relationship"),
                        rs.getString("Associated_Emp")
                );
                userList.add(user);
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return userList;
    }
    
    public void findUsers() {
            ArrayList<User> users = ListUsers(jTextField1.getText());
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"FederalID","Number_Employees","Company_Rep_Name","Company_Website","Company_Phone_Number","Company_Rep_Phone_Number","Company_Address","Company_Name","Founding_Date","Company_Type","Work_Relationship","Associated_Emp"});
            Object[] row = new Object[12];
            for (int i = 0; i < users.size(); i++) {
                row[0] = users.get(i).getFederalID();
                row[1] = users.get(i).getNumber_Employees();
                row[2] = users.get(i).getCompany_Rep_Name();
                row[3] = users.get(i).getCompany_Website();
                row[4] = users.get(i).getCompany_Phone_Number();
                row[5] = users.get(i).getCompany_Rep_Phone_Number();
                row[6] = users.get(i).getCompany_Address();
                row[7] = users.get(i).getCompany_Name();
                row[8] = users.get(i).getFounding_Date();
                row[9] = users.get(i).getCompany_Type();
                row[10] = users.get(i).getWork_Relationship();
                row[11] = users.get(i).getAssociated_Emp();
                model.addRow(row);
            }
            jTable1.setModel(model);
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jButton2.setText("Back To Tables");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(28, 28, 28))
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        findUsers();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.toBack();
        MainAffiliatedCompany b = new MainAffiliatedCompany();
        b.setVisible(true);
        b.toFront();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.toBack();
        LogIn m = new LogIn();
        m.setVisible(true);
        m.toFront();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchAffiliatedCompany1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAffiliatedCompany1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAffiliatedCompany1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAffiliatedCompany1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchAffiliatedCompany1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
