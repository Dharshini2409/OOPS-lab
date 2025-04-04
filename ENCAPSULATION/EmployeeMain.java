class Employee {
    private String empName;
    private int empID;
    
    public String getEmpName() {
        return empName;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public int getEmpID() {
        return empID;
    }
    
    public void setEmpID(int empID) {
        this.empID = empID;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpName("Alice");
        emp.setEmpID(101);
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee ID: " + emp.getEmpID());
    }
}
