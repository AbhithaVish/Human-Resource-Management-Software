package ClassPackages;

public class DepartmentClass extends FileAddClass {
    private String dpID;
    private String dpName;

    public DepartmentClass(String dpID, String dpName, String informationsDepartment_datatxt) {
        this.dpID = dpID;
        this.dpName = dpName;
    }

    public String getDpID() {
        return dpID;
    }

    public void setDpID(String dpID) {
        this.dpID = dpID;
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName;
    }

   
    
    public boolean AddDepartment() { 
        return super.addDepartment(dpID, dpName);
}
}
