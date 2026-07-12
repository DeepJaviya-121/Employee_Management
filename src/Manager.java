import java.util.HashMap;

public class Manager extends Employee{

    int teamSize;
    double bonus = 0.30 ;
    double salary;

    //for storing ID and NAME
    int ID = getId() ;
    String Name = getName();

    public Manager(int id,String name,int age,int teamSize){
        super(id,name,age);
        this.teamSize = teamSize;
    }

    HashMap<Integer,String> ManagerMap = new HashMap<>();

    @Override
    double showSalary(){
        salary = baseSalary*bonus;
        return salary+baseSalary;
    }

    public void addManager(){
        ManagerMap.put(ID,Name);
    }

    public void CheckID(){

    }
    // UID = unique ID. Mname - manager name
    public void showManager(){
        for(Integer UID : ManagerMap.keySet()){
            String Mname = ManagerMap.get(UID);

            System.out.println("Manager ID = " + UID);
            System.out.println("Manager Name = " + Mname);
        }
    }

}
