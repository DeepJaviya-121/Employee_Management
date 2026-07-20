import java.util.HashMap;
import java.util.Scanner;

public class Intern extends Employee {

    Scanner input = new Scanner(System.in);

    double stipend = 12000;

    // Constructor
    public Intern(){};
    public Intern(int id, String name, int age) {super(id, name, age);
    }

    @Override
    double showSalary() {
        return stipend;
    }

    int ID = getId();
    String Name = getName();

    // static because can be used for multiple object of this class
    static HashMap<Integer, String> InternMap = new HashMap<>();

    public void addIntern() {
        InternMap.put(ID, Name);
    }

    public void showIntern() {
        for (Integer IID : InternMap.keySet()) {
            String Iname = InternMap.get(IID);

            System.out.println("Intern (Id : Name) is :");
            System.out.print(IID + " : " + Iname);

        }

    }

    public void updateName(int checkID) {

        for (int key : InternMap.keySet()) {
            if (key == checkID) {
                String name = InternMap.get(key);
                System.out.println("ID : " + key + " NAME : " + name);
                System.out.print("Enter the name you want to Update : ");
                String updateName = input.nextLine();
                InternMap.put(key, updateName);

            } else {
                System.out.print("Invalid Input");
            }
        }
    }
}