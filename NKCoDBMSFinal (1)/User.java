package nkcodbms;

public class User {
    
    private String FederalID;
    private String Number_Employees;
    private String Company_Rep_Name;
    private String Company_Website;
    private String Company_Phone_Number;
    private String Company_Rep_Phone_Number;
    private String Company_Address;
    private String Company_Name;
    private String Founding_Date;
    private String Company_Type;
    private String Work_Relationship;
    private String Associated_Emp;
    
    public User(String FederalID,String Number_Employees,String Company_Rep_Name,String Company_Website,String Company_Phone_Number,
            String Company_Rep_Phone_Number,String Company_Address,String Company_Name,String Founding_Date,String Company_Type,
            String Work_Relationship,String Associated_Emp) {
        this.FederalID = FederalID;
        this.Number_Employees = Number_Employees;
        this.Company_Rep_Name = Company_Rep_Name;
        this.Company_Website = Company_Website;
        this.Company_Phone_Number = Company_Phone_Number;
        this.Company_Rep_Phone_Number = Company_Rep_Phone_Number;
        this.Company_Address = Company_Address;
        this.Company_Name = Company_Name;
        this.Founding_Date = Founding_Date;
        this.Company_Type = Company_Type;
        this.Work_Relationship = Work_Relationship;
        this.Associated_Emp = Associated_Emp;
        
    }
    
    public String getFederalID() {
        return FederalID;
    }
    
    public String getWork_Relationship() {
        return Work_Relationship;
    }

    public String getNumber_Employees() {
        return Number_Employees;
    }

    public String getCompany_Rep_Name() {
        return Company_Rep_Name;
    }

    public String getCompany_Website() {
        return Company_Website;
    }

    public String getCompany_Phone_Number() {
        return Company_Phone_Number;
    }

    public String getCompany_Rep_Phone_Number() {
        return Company_Rep_Phone_Number;
    }

    public String getCompany_Address() {
        return Company_Address;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public String getFounding_Date() {
        return Founding_Date;
    }

    public String getCompany_Type() {
        return Company_Type;
    }

    public String getAssociated_Emp() {
        return Associated_Emp;
    }  
    
}
