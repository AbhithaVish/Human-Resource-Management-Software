package ClassPackages;

public class Designations extends FileAddClass {
    private String DPName;
    private String DesigName;

   

    public Designations(String DPName, String DesigName) {
        this.DPName = DPName;
        this.DesigName = DesigName;
        
    }

    public String getDPName() {
        return DPName;
    }

    public void setDPName(String DPName) {
        this.DPName = DPName;
    }

    public String getDesigName() {
        return DesigName;
    }

    public void setDesigName(String DesigName) {
        this.DesigName = DesigName;
    }
    
    public boolean Adddesig() {
        return super.Adddesig(DPName, DesigName);
    }
}
