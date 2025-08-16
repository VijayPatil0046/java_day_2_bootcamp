import java.util.Scanner;
import java.time.LocalDate;

public class Employee {
        private int empId;
        private String firstName;
        private String lastName;
        private double salary;
        private int joiningYear;

        Scanner scanner =new Scanner(System.in);

        public void displayDetails(){
            System.out.println("******* Employee Details*******");
            System.out.println("Firstname : "+firstName);
            System.out.println("Lastname : "+this.lastName);
            System.out.println("Employee ID : "+this.empId);
            System.out.println("Salary : "+this.salary);
            System.out.println("Joining year : "+this.joiningYear);
            System.out.println();
        }

       public void getDetails(){
            System.out.println("Enter first name: ");
            firstName = scanner.next();
            System.out.println("Enter last name: ");
            lastName = scanner.next();
            System.out.println("Enter emp id: ");
            empId = scanner.nextInt();
            System.out.println("Enter salary : ");
            salary = scanner.nextDouble();
            System.out.println("Enter joining date : ");
            joiningYear = scanner.nextInt();
        }

        public void workingExperience(){
            LocalDate today = LocalDate.now();
            System.out.println(firstName+" "+lastName+" has "+(today.getYear()-joiningYear)+" years of experience." );
        }


}
