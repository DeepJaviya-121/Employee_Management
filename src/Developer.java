import java.util.HashMap;

public class Developer extends Employee{


    double projectBonus = 0.20;
    double salary;
    public Developer(int id,String name,int age){
        super(id,name,age);
    }

    int ID = getId();
    String Name = getName();

    HashMap<Integer,String> DeveloperMap = new HashMap<>();
    // Add developer name
    public void addDeveloper(){
        DeveloperMap.put(ID,Name);
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
