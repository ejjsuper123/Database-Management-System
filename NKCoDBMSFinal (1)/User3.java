package nkcodbms;

public class User3 {
    
    private String SSN;
    private String First_Name;
    private String Last_Name;
    private String Health_Ins_Factors;
    private String Home_Address;
    private String Email_Address;
    private String Employee_Type;
    private String Salary;
    private String Emergency_Cntct_Number;
    private String Emergency_Cntct_Name;
    private String Date_Of_Birth;
    private String Years_In_Industry;
    private String Super_SSN;
    
    public User3(String SSN, String First_Name, String Last_Name, String Health_Ins_Factors, String Home_Address,
    String Email_Address, String Employee_Type, String Salary, String Emergency_Cntct_Number, String Emergency_Cntct_Name,
    String Date_Of_Birth, String Years_In_Industry, String Super_SSN) {
        this.SSN = SSN;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Health_Ins_Factors = Health_Ins_Factors;
        this.Home_Address = Home_Address;
        this.Email_Address = Email_Address;
        this.Employee_Type = Employee_Type;
        this.Salary = Salary;
        this.Emergency_Cntct_Number = Emergency_Cntct_Number;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Years_In_Industry = Years_In_Industry;
        this.Super_SSN = Super_SSN;
    }

    public String getSSN() {
        return SSN;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getHealth_Ins_Factors() {
        return Health_Ins_Factors;
    }

    public String getHome_Address() {
        return Home_Address;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public String getEmployee_Type() {
        return Employee_Type;
    }

    public String getSalary() {
        return Salary;
    }

    public String getEmergency_Cntct_Number() {
        return Emergency_Cntct_Number;
    }

    public String getEmergency_Cntct_Name() {
        return Emergency_Cntct_Name;
    }

    public String getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    public String getYears_In_Industry() {
        return Years_In_Industry;
    }

    public String getSuper_SSN() {
        return Super_SSN;
    }
    
    
}
