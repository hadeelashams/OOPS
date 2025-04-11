import java.util.Scanner;

class Employee {
    int eNo, eSalary;
    String eName;

    Employee(int eno, int esalary, String ename) {
        eNo = eno;
        eSalary = esalary;
        eName = ename;
    }

    void display() {
        System.out.println("\nEmployee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class Employe {

    public static void main(String[] args) {
        int n, i, result = 0, eno, esal, enumber;
        String ename;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        n = sc.nextInt();
        sc.nextLine(); 

        Employee[] Obj = new Employee[n];

        for (i = 0; i < n; i++) {
            System.out.println("Enter Employee No:");
            eno = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Employee Name:");
            ename = sc.nextLine(); 
            System.out.println("Enter Employee Salary:");
            esal = sc.nextInt();
            Obj[i] = new Employee(eno, esal, ename);
        }

        System.out.println("\nEmployee Details:");
        for (i = 0; i < n; i++) {
            Obj[i].display();
        }

        System.out.println("Enter the employee number to be searched:");
        enumber = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (Obj[i].eNo == enumber) {
                result = 1; 
                Obj[i].display();
                break;
            }
        }

        if (result == 0) {
            System.out.println("Employee not found");
        }
    }
}

