package ClassPackages;
public class SalaryClass extends FileAddClass {
    
    private String EmpId;
    private String EmpNAme;
    private String Department;
    private String Designation;
    private String EPF;
    private String Sallery;
    private String AccNo;

    public SalaryClass(String EmpId, String EmpNAme, String Department, String Designation, String EPF, String Sallery, String AccNo) {
        this.EmpId = EmpId;
        this.EmpNAme = EmpNAme;
        this.Department = Department;
        this.Designation = Designation;
        this.EPF = EPF;
        this.Sallery = Sallery;
        this.AccNo = AccNo;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public String getEmpNAme() {
        return EmpNAme;
    }

    public void setEmpNAme(String EmpNAme) {
        this.EmpNAme = EmpNAme;
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

    public String getSallery() {
        return Sallery;
    }

    public void setSallery(String Sallery) {
        this.Sallery = Sallery;
    }

    public void setEPF(String EPF) {
        this.EPF = EPF;
    }

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String AccNo) {
        this.AccNo = AccNo;
    }
    
    public boolean SaveSalary() {
         return super.SaveSalary(EmpId, EmpNAme,Department,Designation,EPF,Sallery,AccNo);
    }
    
}
