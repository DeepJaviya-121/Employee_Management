import java.util.HashMap;
import java.util.Scanner;

public class Manager extends Employee{

    Scanner input = new Scanner(System.in);

    int teamSize;
    double bonus = 0.30 ;
    double salary;

    //for storing ID and NAME
    int ID = getId() ;
    String Name = getName();

    // Constructor
    public Manager(){};
    public Manager(int id,String name,int age,int teamSize){
        super(id,name,age);
        this.teamSize = teamSize;
    }

    // static because can be used for multiple object of this class
    static HashMap<Integer,String> ManagerMap = new HashMap<>();

    @Override
    double showSalary(){
        salary = baseSalary*bonus;
        return salary+baseSalary;
    }

    public void addManager(){
        ManagerMap.put(ID,Name);
    }

    public void updateName(int checkID){

        for (int key : ManagerMap.keySet()){
            if (key == checkID){
                String name = ManagerMap.get(key);
                System.out.println("ID : " + key + " NAME : " + name);
                System.out.print("Enter the name you want to Update : ");
                String updateName = input.nextLine();
                ManagerMap.put(key,updateName);

            }
            else {
                System.out.print("Invalid Input");
            }
        }

    }
    // UID = unique ID. Mname - manager name
    public void showManager(){
        for(Integer UID : ManagerMap.keySet()){
            String Mname = ManagerMap.get(UID);

            System.out.println("Manager (ID : Name) is : ");
            System.out.println(UID + " : " + Mname);
        }
    }

}
