import java.util.HashMap;

public class Intern extends Employee{

    double stipend = 12000;

    public Intern(int id, String name, int age){
        super(id,name,age);
    }

    @Override
    double showSalary(){
        return stipend;
    }

    int ID = getId();
    String Name = getName();

    HashMap<Integer,String> InternMap = new HashMap<>();

    public void addIntern(){
        InternMap.put(ID,Name);
    }

    public void showIntern (){
        for(Integer IID : InternMap.keySet()){
            String Iname = InternMap.get(IID);

            System.out.println("Intern (Id : Name) is :");
            System.out.print(IID + " : " + Iname);

        }

    }
}
