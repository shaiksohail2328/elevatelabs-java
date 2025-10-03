import dao.EmployeeDAO;
import model.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📋 Employee Database Menu");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Email");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    dao.addEmployee(new Employee(name, email, dept, salary));
                }
                case 2 -> dao.getAllEmployees().forEach(System.out::println);
                case 3 -> {
                    System.out.print("Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Email: ");
                    String email = sc.nextLine();
                    dao.updateEmployeeEmail(id, email);
                }
                case 4 -> {
                    System.out.print("Employee ID: ");
                    int id = sc.nextInt();
                    dao.deleteEmployee(id);
                }
                case 5 -> System.out.println("👋 Exiting...");
                default -> System.out.println("❌ Invalid choice.");
            }
        } while (choice != 5);
    }
}
