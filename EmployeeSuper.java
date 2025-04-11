import java.util.Scanner;

class Employee {
    int empid, salary;
    String name, address;

    Employee(int empid, int salary, String name, String address) {
        this.empid = empid;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department, subject;

    Teacher(int empid, int salary, String name, String address, String dept, String sub) {
        super(empid, salary, name, address);
        this.department = dept;
        this.subject = sub;
    }

    void display() {
        System.out.println("\nEmployee ID: " + empid);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
        System.out.println("----------------------------------------------------");
    }
}

public class EmployeeSuper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");

            System.out.print("Enter the employee ID: ");
            int empid = sc.nextInt();

            System.out.print("Enter the employee name: ");
            String name = sc.next();

            System.out.print("Enter salary: ");
            int salary = sc.nextInt();

            System.out.print("Enter the employee address: ");
            String address = sc.next();

            System.out.print("Enter the department: ");
            String department = sc.next();

            System.out.print("Enter the subject: ");
            String subject = sc.next();

            teachers[i] = new Teacher(empid, salary, name, address, department, subject);
        }

        System.out.println("\nDetails of teachers:");
        System.out.println("----------------------------------------------------");

        for (Teacher teacher : teachers) {
            teacher.display();
        }

        sc.close();
    }
}
