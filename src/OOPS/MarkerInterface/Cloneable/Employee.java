package OOPS.MarkerInterface.Cloneable;

public class Employee implements Cloneable {
    private int empId;
    private String empName;
    private transient String salary;

    public Employee(int empId, String empName, String salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(101, "Noorain", "1000");
            Employee emp2 = (Employee) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
