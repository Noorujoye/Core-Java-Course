package ObjectClass;


import java.util.ArrayList;
import java.util.List;

class Player {
    int id;
    String name;
    String course;

    public Player(int id, String player, String SportType) {
        this.id = id;
        this.name = name;
        this.course = course;
    }


    static void main() {
        Player p1 = new Player(1, "Virat", "cricket");
        String s1 = new String("noor");
        String s2 = new String("noor");
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}

class Employee {
    int id;
    String name;
    String dept;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object obj) {
        // == checks reference , if it is then true
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        // casting
        Employee emp = (Employee) obj;
//        if (this.dept.equals(emp.dept)) {
//            return true;
//        }
        // compare content
        return this.dept.equals(emp.dept);
    }

    @Override
    public int hashCode() {
        return dept.hashCode();
    }

}

public class Employees {
    public static void main(String[] args) {


        List<Employee> employeesList = new ArrayList<>(10);
        employeesList.add(new Employee(101, "Noorain", "IT"));
        employeesList.add(new Employee(102, "Shadab", "IT"));
        employeesList.add(new Employee(103, "Tashviq", "Sales"));
        employeesList.add(new Employee(104, "Salman", "Sales"));
        for (Employee e : employeesList) {
            System.out.println("All Employee Name: " + e.name);
        }


        List<Employee> it = new ArrayList<>();
        List<Employee> sales = new ArrayList<>();

        for (Employee e : employeesList) {
            if (e.dept.equals("IT")) {
                it.add(e);
            } else {
                sales.add(e);
            }
        }
        for (Employee e : it) {
            System.out.println("It Dept : " + e.name);
        }
        for (Employee e : sales) {
            System.out.println("sales Dept : " + e.name);
        }

        System.out.println(new Employee(101, "Noorain", "IT").equals(new Employee(102, "Shadab", "IT")));

        String s1 = "FB";
        String s2 = "Ea";

        System.out.println(s1.hashCode() == s2.hashCode()); // true
        System.out.println(s1.equals(s2)); // false

        String s3 = "Noor";
        String s4 = new String("Noor");

        System.out.println(s3.equals(s4));      // true
        System.out.println(s3.hashCode());      // same
        System.out.println(s4.hashCode());      // same
    }
}
