package model;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String department;
    private double salary;

    public Employee(int id, String name, String email, String department, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public Employee(String name, String email, String department, double salary) {
        this(0, name, email, department, salary);
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    public void setEmail(String email) { this.email = email; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Email: %s | Dept: %s | Salary: %.2f",
                id, name, email, department, salary);
    }
}
