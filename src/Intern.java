public class Intern extends Employee{

    double stipend = 12000;

    public Intern(int id, String name, int age){
        super(id,name,age);
    }

    @Override
    double showSalary(){
        return stipend;
    }
}
