package DesignPatterns.Creational.BuilderPattern;

public class EmployeeBuilder {

    // builder will hold values
    int userId;
    String username;
    String department;
    String role;

    public EmployeeBuilder setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public EmployeeBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    public Employee build() {
        return new Employee(this);
    }

    public static void main(String[] args) {

        Employee emp = new EmployeeBuilder()
                .setUserId(101)
                .setUsername("Nooru")
                .setDepartment("Engineering")
                .setRole("Developer")
                .build();

        System.out.println(emp.toString());
        // collect data -> build -> create final object
    }
}
// setter appraoch, objects created before it is completed, but may be it is incomplete

