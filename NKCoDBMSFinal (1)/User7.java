package nkcodbms;

public class User7 {
    
    private String Works_OnID;
    private String FID_Num;
    private String Employee_SSN;
    private String Hours_Worked;
    private String Contract_ID;
    
    public User7(String Works_OnID, String FID_Num, String Employee_SSN, String Hours_Worked, String Contract_ID) {
        this.Works_OnID = Works_OnID;
        this.FID_Num = FID_Num;
        this.Employee_SSN = Employee_SSN;
        this.Hours_Worked = Hours_Worked;
        this.Contract_ID = Contract_ID;
    }

    public String getWorks_OnID() {
        return Works_OnID;
    }

    public String getFID_Num() {
        return FID_Num;
    }

    public String getEmployee_SSN() {
        return Employee_SSN;
    }

    public String getHours_Worked() {
        return Hours_Worked;
    }

    public String getContract_ID() {
        return Contract_ID;
    }
}
