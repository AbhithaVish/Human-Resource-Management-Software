package ClassPackages;

public class FileAddClass {
     FileManagement fileSystem = new FileManagement("Informations\\Department data.txt");
     FileManagement fileSystem2 =new FileManagement("Informations\\Designation.txt");
     FileManagement fileSystem3 =new FileManagement("Informations\\EmployeeData.txt");
     FileManagement fileSystem4 =new FileManagement("Informations\\Sallery.txt");
    
   
    public boolean addDepartment(String dpID, String dpName) {
        if(!fileSystem.createANewFile()) {
            String record = dpID + " /" + dpName;
            return fileSystem.writeDataToFile(record);
        }
        return false;
    }

    
    public boolean Adddesig(String DPName, String DesigName) {
        if(!fileSystem2.createANewFile()) {
        String record = DPName + " /" + DesigName;
            return fileSystem2.writeDataToFile(record);
        }
        return false;
    }
    
    public boolean addEmployee(String EmployeeId, String EmployeeNAme, String DOB, String Address, String ID, String Gender, String Jdate, String Department, String Designation, String EPF, String ContactNo, String ContactNo1) {
        if(!fileSystem3.createANewFile())
        {
            String record = EmployeeId + " /" +EmployeeNAme + " /"+ DOB + " /" +Address+ " /"+ ID+" /"+Gender+" /"+Jdate+" /"+Department+" /"+Designation+" /"+EPF+" /"+ContactNo;
            return fileSystem3.writeDataToFile(record);
        }
        return false;
    
    }
    
    public boolean SaveSalary(String EmpId, String EmpNAme, String Department, String Designation, String EPF, String Sallery, String AccNo) {
        if(!fileSystem4.createANewFile())
        {
            String record = EmpId + " /" +EmpNAme +" /" +Department +" /" +Designation +" /" +EPF +" /" +Sallery+" /"+AccNo;
            return fileSystem4.writeDataToFile(record);
        }
        return false;
    }
        
}
