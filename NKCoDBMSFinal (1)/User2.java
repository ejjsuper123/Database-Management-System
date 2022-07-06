package nkcodbms;

public class User2 {
    
    private String AssociationID;
    private String Association_Name;
    private String Owner_SSN;
    
    public User2(String AssociationID, String Association_Name, String Owner_SSN) {
        this.AssociationID = AssociationID;
        this.Association_Name = Association_Name;
        this.Owner_SSN = Owner_SSN;
    }

    public String getAssociationID() {
        return AssociationID;
    }

    public String getAssociation_Name() {
        return Association_Name;
    }

    public String getOwner_SSN() {
        return Owner_SSN;
    }
    
    
}
