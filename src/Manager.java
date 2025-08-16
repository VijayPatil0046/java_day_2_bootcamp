public class Manager extends Employee{
    private String department;

    public Manager(int empId, String firstName, int joiningYear, String lastName, double salary,String department) {
        super(empId, firstName, joiningYear, lastName, salary);
        this.department = department;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Department : "+this.department);
    }

    public void conductMeeting(){
        System.out.println(firstName+" "+lastName+" is conducting meeting.");
    }
}
