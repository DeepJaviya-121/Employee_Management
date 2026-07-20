import java.util.HashMap;
import java.util.Scanner;

public class Developer extends Employee{
    // To take input
    Scanner input = new Scanner(System.in);

    double projectBonus = 0.20;
    double salary;

    // Constructor
    public Developer(){};
    public Developer(int id,String name,int age){
        super(id,name,age);
    }

    int ID = getId();
    String Name = getName();

    // static because can be used for multiple object of this class
    static HashMap<Integer,String> DeveloperMap = new HashMap<>();
    // Add developer name
    public void addDeveloper(){
        DeveloperMap.put(ID,Name);
    }

    public void updateName(int checkID) {

        for (int key : DeveloperMap.keySet()) {
            if (key == checkID) {
                String name = DeveloperMap.get(key);
                System.out.println("ID : " + key + " NAME : " + name);
                System.out.print("Enter the name you want to Update : ");
                String updateName = input.nextLine();
                DeveloperMap.put(key, updateName);

            } else {
                System.out.print("Invalid Input");
            }
        }
    }

    //Show all developer name DID - Developer id , Dname - Developer name
    public void showDeveloper(){
        for(Integer DID : DeveloperMap.keySet()){
            String Dname = DeveloperMap.get(DID);

            System.out.println("Developer (ID : Name) is : ");
            System.out.println(DID + " : " + Dname);
        }
    }

    // Show Salary Method
    @Override
    double showSalary(){
        salary = baseSalary*projectBonus;
        return salary+baseSalary;
    }

}
