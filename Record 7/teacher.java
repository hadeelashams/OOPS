import java.util.Scanner;


class Employee {
   
    int empid;
    String name;
    double salary;
    String address;

    
    public Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

   
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }
}


class Teacher extends Employee {
    // Additional data members specific to Teacher
    String department;
    String[] subjectsTaught;

    // Constructor to initialize Teacher data members
    public Teacher(int empid, String name, double salary, String address, String department, String[] subjectsTaught) {
        // Call the parent class constructor to initialize Employee details
        super(empid, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    // Method to display Teacher details
    public void displayTeacherDetails() {
        // Display Employee details
        displayEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.print("Subjects Taught: ");
        for (String subject : subjectsTaught) {
            System.out.print(subject + " ");
        }
        System.out.println("\n");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input number of teachers
        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array of Teacher objects
        Teacher[] teachers = new Teacher[n];

        // Input and initialize the Teacher objects
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int empid = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter number of subjects taught: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            // Create an array of subjects taught
            String[] subjectsTaught = new String[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter Subject " + (j + 1) + ": ");
                subjectsTaught[j] = scanner.nextLine();
            }

            // Create Teacher object and add it to the array
            teachers[i] = new Teacher(empid, name, salary, address, department, subjectsTaught);
        }

        // Display details of all teachers
        System.out.println("\nDisplaying details of all teachers:");
        for (Teacher teacher : teachers) {
            teacher.displayTeacherDetails();
        }

        // Close the scanner object
        scanner.close();
    }
}

