/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nkcodbms;

/**
 *
 * @author tkapp1
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.Clock;
import java.time.ZoneId;        

public class NKCoDBMS {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

        final String ID = "tkapp1";
        final String PW = "COSC*ddoa3";
        final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/tkapp1db";
        String querys;
        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tkapp1db.Company_Employees");
            PreparedStatement update_Works_On = null;

            while (rs.next()){
                String SSN_num = rs.getString("SSN");
                System.out.println(SSN_num);

            }
           /* querys = "INSERT INTO Company_Employees (SSN, First_Name, Last_Name, Health_Ins_Factors, Home_Address, Email_Address"
                    + "Employee_Type, Salary, Emergency_Cntct_Number, Emergency_Cntct_Name, Date_Of_Birth, Years_In_Industry, Super_SSN) VALUES"
                    + SSN_num + "," + FirstNameText.getText() + " , " + LastNameText.getText()+ " , " + Health_Insurance_FactorsText.getText()+ " ," + " , " 
                    + Home_AddressText.getText()+ " , " + Email_AddressText.getText()+ " , " + Employee_TypeText.getText()+ " , " + SalaryText.getText()+ " , " 
                    + EmergencyContactNoText.getText()+ " , " + EmergencyContactNameText.getText() + " , " + Years_In_IndustryText.getText()+ " , " 
                    + Supervisor_SSNText.getText()+ " , " + DateOfBirthDay.getSelectedItem() + " , " + DateOfBirthMonth.getSelectedItem()+ " , " 
                    + DateOfBirthYear.getSelectedItem(); 
            update_Works_On = con.prepareStatement(querys);
            update_Works_On.executeUpdate();*/
        } catch (SQLException e){
            System.err.println(e);
        }
    }
    
}
