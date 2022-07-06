package nkcodbms;


public class User6 {

    private String EventID;
    private String Speech_Date;
    private String Host_Org_Name;
    private String Speech_Time;
    private String Speech_Location;
    private String BookingEmp_SSN;
    private String Speech_Details;
    
    public User6(String Speaking_Event, String Speech_Date, String Host_Org_Name, String Speech_Time, String Speech_Location, String BookingEmp_SSN, String Speech_Details) {
        this.EventID = Speaking_Event;
        this.Speech_Date = Speech_Date;
        this.Host_Org_Name = Host_Org_Name;
        this.Speech_Time = Speech_Time;
        this.Speech_Location = Speech_Location;
        this.BookingEmp_SSN = BookingEmp_SSN;
        this.Speech_Details = Speech_Details;
    }

    public String getEventID() {
        return EventID;
    }

    public String getSpeech_Date() {
        return Speech_Date;
    }

    public String getHost_Org_Name() {
        return Host_Org_Name;
    }

    public String getSpeech_Time() {
        return Speech_Time;
    }

    public String getSpeech_Location() {
        return Speech_Location;
    }

    public String getBookingEmp_SSN() {
        return BookingEmp_SSN;
    }

    public String getSpeech_Details() {
        return Speech_Details;
    }
}
