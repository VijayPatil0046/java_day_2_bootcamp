import java.util.Scanner;
import java.time.LocalDate;

public class Employee {
         int empId;
         String firstName;
         String lastName;
         double salary;
         int joiningYear;

    public Employee(int empId, String firstName, int joiningYear, String lastName, double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.joiningYear = joiningYear;
        this.lastName = lastName;
        this.salary = salary;
    }

    Scanner scanner =new Scanner(System.in);

        public void displayDetails(){
            System.out.println("Firstname : "+firstName);
            System.out.println("Lastname : "+this.lastName);
            System.out.println("Employee ID : "+this.empId);
            System.out.println("Salary : "+this.salary);
            System.out.println("Joining year : "+this.joiningYear);
        }



    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    public void workingExperience(){
            LocalDate today = LocalDate.now();
            System.out.println(firstName+" "+lastName+" has "+(today.getYear()-joiningYear)+" years of experience." );
        }


}
