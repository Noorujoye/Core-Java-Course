package DesignPatterns.Creational.BuilderPattern;

public class Employee {

    private final int userId;
    private final String username;
    private final String department;
    private final String role;

    public Employee(EmployeeBuilder builder) {
        this.userId = builder.userId;
        this.username = builder.username;
        this.department = builder.department;
        this.role = builder.role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
