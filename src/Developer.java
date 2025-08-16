public class Developer extends Employee{
    String progLang;

    public Developer(int empId, String firstName, int joiningYear, String lastName, double salary, String progLang) {
        super(empId, firstName, joiningYear, lastName, salary);
        this.progLang = progLang;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : "+this.progLang);
    }

    public void writingCode(){
        System.out.println(firstName+" "+lastName+" is developing in "+progLang );
    }
}
