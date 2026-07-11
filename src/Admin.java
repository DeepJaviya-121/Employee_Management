import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Introduction Statement .
        System.out.println("___I am the Admin___");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Calculate");
        System.out.println("4. Remove");

        //User's Choice
        System.out.print("\nEnter your choice : ");
        int choice = input.nextInt();
        input.nextLine();

        //Implementing choice
        if (1 == choice){
            System.out.print("\n Which Department :\n A -> Management(Can Add Manager) \n" +
                    " B-> Developer(Can add developer) \n C -> Intern(Can add Intern) \n (type A/B/C) : ");

            //Local input variable
            int uniId;
            String NAME;
            int AGE;


            //Department selection
            String department = input.nextLine().toUpperCase();
            if (department.equals("A")){
                // Team size initialisation locally
                int teamSize;

                Scanner input1 = new Scanner(System.in);
                System.out.println("Enter the Unique id number : ");
                uniId = input1.nextInt();
                input1.nextLine();

                System.out.println("Enter the name : ");
                NAME = input1.nextLine();

                System.out.println("Enter the age : ");
                AGE=input1.nextInt();
                input1.nextLine();

                System.out.println("Enter the Team Size Manager will handle : ");
                teamSize = input.nextInt();
                input.nextLine();

                Employee manager = new Manager(uniId,NAME,AGE,teamSize);

            } else if (department.equals("B")) {

                System.out.println("Enter the Unique id number : ");
                uniId = input.nextInt();
                input.nextLine();

                System.out.println("Enter the name : ");
                NAME = input.nextLine();

                System.out.println("Enter the age : ");
                AGE=input.nextInt();
                input.nextLine();

                Developer developer = new Developer(uniId,NAME,AGE);
            } else if (department.equals("C")) {

                System.out.println("Enter the Unique id number : ");
                uniId = input.nextInt();
                input.nextLine();

                System.out.println("Enter the name : ");
                NAME = input.nextLine();

                System.out.println("Enter the age : ");
                AGE=input.nextInt();
                input.nextLine();

                Intern intern = new Intern(uniId,NAME,AGE);
            }else {
                System.out.println("Invalid Input");
            }

        }

    }
}
