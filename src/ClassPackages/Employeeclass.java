package ClassPackages;
public class Employeeclass extends FileAddClass{
    
    private String EmployeeId;
    private String EmployeeNAme;
    private String   DOB;
    private String Address;
    private String ID;
    private String Gender;
    private String Jdate;
    private String Department;
    private String Designation;
    private String EPF;
    private String ContactNo;
   
    
    public Employeeclass(String EmployeeId, String EmployeeNAme, String DOB, String Address, String ID, String Gender, String Jdate, String Department, String Designation, String EPF, String ContactNo) {
        this.EmployeeId = EmployeeId;
        this.EmployeeNAme = EmployeeNAme;
        this.DOB = DOB;
        this.Address = Address;
        this.ID = ID;
        this.Gender = Gender;
        this.Jdate = Jdate;
        this.Department = Department;
        this.Designation = Designation;
        this.EPF = EPF;
        this.ContactNo = ContactNo;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getEmployeeNAme() {
        return EmployeeNAme;
    }

    public void setEmployeeNAme(String EmployeeNAme) {
        this.EmployeeNAme = EmployeeNAme;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getJdate() {
        return Jdate;
    }

    public void setJdate(String Jdate) {
        this.Jdate = Jdate;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getEPF() {
        return EPF;
    }

    public void setEPF(String EPF) {
        this.EPF = EPF;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    
    
    public boolean addEmployee() {
       return super.addEmployee(EmployeeId, EmployeeNAme,DOB,DOB,Address,ID,Gender,Jdate,Department,Designation,EPF,ContactNo);
    }
    
            
}


