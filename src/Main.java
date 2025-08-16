public class Main {
    public static void main(String[] args) {

        // fist employee
        Employee emp1 =new Employee(202,"Vijay", 2020, "Patil",2000000.0);
        System.out.println("******* Employee Details*******");
        emp1.displayDetails();
        emp1.workingExperience();

        Manager manager = new Manager(200,"Sam",2005,"Kontas",250000.0,"HR");
        manager.setJoiningYear(2015);
        System.out.println("\n******* Manager Details*******");
        manager.displayDetails();
        manager.workingExperience();
        manager.conductMeeting();

        Developer developer = new Developer(203,"Adhish",2024,"P",2000000.0,"Java");
        System.out.println("\n******* Developer Details*******");
        developer.displayDetails();
        developer.writingCode();
    }
}
