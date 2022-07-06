package nkcodbms;


public class User5 {
    
    private String ProfitLossID;
    private String Date;
    private String Expenditures;
    private String Finance_Dir_SSN;
    
    public User5(String ProfitLossID, String Date, String Expenditures, String Finance_Dir_SSN) {
        this.ProfitLossID = ProfitLossID;
        this.Date = Date;
        this.Expenditures = Expenditures;
        this.Finance_Dir_SSN = Finance_Dir_SSN;
    }

    public String getProfitLossID() {
        return ProfitLossID;
    }

    public String getDate() {
        return Date;
    }

    public String getExpenditures() {
        return Expenditures;
    }

    public String getFinance_Dir_SSN() {
        return Finance_Dir_SSN;
    }
    
}
