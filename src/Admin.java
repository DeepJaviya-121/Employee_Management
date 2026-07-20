import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Introduction Statement .
        System.out.println("___I am the Admin___");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee Details");
        System.out.println("3. Calculate Salary");
        System.out.println("4. Remove Employee");

        //Implementing choice
        System.out.print("\nEnter your choice : ");

        //User's Choice
        int choice = input.nextInt();
        input.nextLine();


        // please remember to save every name in lower or upper case format.
        if (1 == choice){
            System.out.print("""
                     Which Department :
                     A -> Management(Can Add Manager)
                     B-> Developer(Can add developer)
                     C -> Intern(Can add Intern)
                     (type A/B/C) : 
                    """);
            //Local input variable
            int uniId;
            String NAME;
            int AGE;

            //Department selection
            String department = input.nextLine().toUpperCase();
            switch (department) {
                case "A" -> {
                    // Team size initialization locally
                    int teamSize;

                    Scanner input1 = new Scanner(System.in);
                    System.out.print("Enter the Unique id number : ");
                    uniId = input1.nextInt();
                    input1.nextLine();

                    System.out.print("Enter the name : ");
                    NAME = input1.nextLine();

                    System.out.print("Enter the age : ");
                    AGE = input1.nextInt();
                    input1.nextLine();

                    System.out.print("Enter the Team Size Manager will handle : ");
                    teamSize = input.nextInt();
                    input.nextLine();

                    Manager manager = new Manager(uniId, NAME, AGE, teamSize);
                    manager.addManager();
                }
                case "B" -> {

                    System.out.print("Enter the Unique id number : ");
                    uniId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter the name : ");
                    NAME = input.nextLine();

                    System.out.print("Enter the age : ");
                    AGE = input.nextInt();
                    input.nextLine();

                    Developer developer = new Developer(uniId, NAME, AGE);
                    developer.addDeveloper();
                }
                case "C" -> {

                    System.out.print("Enter the Unique id number : ");
                    uniId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter the name : ");
                    NAME = input.nextLine();

                    System.out.print("Enter the age : ");
                    AGE = input.nextInt();
                    input.nextLine();

                    Intern intern = new Intern(uniId, NAME, AGE);
                    intern.addIntern();
                }
                // add a loop breaker here to stop code when error comes.
                default -> System.out.print("Invalid Input");
            }
        } else if (2 == choice) {

            System.out.print(""" 
                    Which Department :
                    A : Management
                    B : Development
                    C : Intern
                    type -> (A/B/C) : 
                    """);

            String change = input.nextLine();
            switch (change) {
                case "A" -> {

                    System.out.print("Enter the ID of Manager you want to update :");
                    int checkID = input.nextInt();
                    input.nextLine();

                    Manager checkManager = new Manager();
                    checkManager.updateName(checkID);

                    checkManager.showManager();

                }
                case "B" -> {

                    System.out.print("Enter the ID of Developer you want to update :");
                    int checkID = input.nextInt();
                    input.nextLine();

                    Developer checkDeveloper = new Developer();
                    checkDeveloper.updateName(checkID);

                    checkDeveloper.showDeveloper();
                }
                case "C" -> {

                    System.out.print("Enter the ID of Intern you want to update :");
                    int checkID = input.nextInt();
                    input.nextLine();

                    Intern checkIntern = new Intern();
                    checkIntern.updateName(checkID);
                    checkIntern.showIntern();
                }
                // add a loop breaker here to stop code when error comes.
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
