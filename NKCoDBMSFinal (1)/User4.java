package nkcodbms;

public class User4 {
    
    private String ContractID;
    private String Profit_LossID;
    private String Job_Type;
    private String Contract_Start_Date;
    private String Contract_End_Date;
    private String Contract_Bill_Amount;
    private String Contract_Bill_Amount_Paid;
    private String Employee_Feedback_Score;
    private String Vendor_Feedback_Score;
    private String AcctMngr_SSN;
    private String ClientIDNumber;
    
    public User4(String ContractID, String Profit_LossID, String Job_Type, String Contract_State_Date, String Contract_End_Date, String Contract_Bill_Amount, String Contract_Bill_Amount_Paid,
            String Employee_Feedback_Score, String Vendor_Feedback_Score, String AcctMngr_SSN, String ClientIDNumber) {
        this.ContractID = ContractID;
        this.Profit_LossID = Profit_LossID;
        this.Job_Type = Job_Type;
        this.Contract_Start_Date = Contract_State_Date;
        this.Contract_End_Date = Contract_End_Date;
        this.Contract_Bill_Amount = Contract_Bill_Amount;
        this.Contract_Bill_Amount_Paid = Contract_Bill_Amount_Paid;
        this.Employee_Feedback_Score = Employee_Feedback_Score;
        this.Vendor_Feedback_Score = Vendor_Feedback_Score;
        this.AcctMngr_SSN = AcctMngr_SSN;
        this.ClientIDNumber = ClientIDNumber;
    }

    public String getContractID() {
        return ContractID;
    }

    public String getProfit_LossID() {
        return Profit_LossID;
    }

    public String getJob_Type() {
        return Job_Type;
    }

    public String getContract_Start_Date() {
        return Contract_Start_Date;
    }

    public String getContract_End_Date() {
        return Contract_End_Date;
    }

    public String getContract_Bill_Amount() {
        return Contract_Bill_Amount;
    }

    public String getContract_Bill_Amount_Paid() {
        return Contract_Bill_Amount_Paid;
    }

    public String getEmployee_Feedback_Score() {
        return Employee_Feedback_Score;
    }

    public String getVendor_Feedback_Score() {
        return Vendor_Feedback_Score;
    }

    public String getAcctMngr_SSN() {
        return AcctMngr_SSN;
    }

    public String getClientIDNumber() {
        return ClientIDNumber;
    }
    
    
}
