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
            System.out.print("\n Which Department :\n A -> Management \n B-> Developer \n C -> Intern \n (type A/B/C) : ");
            //Department selection
            String department = input.nextLine().toUpperCase();
            if (department.equals("A")){
                Employee manager = new Manager(00,"das",1,3,3);
            } else if (department.equals("B")) {
                //Developer developer = new Developer();
            } else if (department.equals("C")) {
                //Intern intern = new Intern();
            }else {
                System.out.println("Invalid Input");
            }

        }

    }
}
