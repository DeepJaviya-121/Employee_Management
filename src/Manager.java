public class Manager extends Employee{

    int teamSize;
    double bonus = 0.30 ;
    double salary;

    public Manager(int id,String name,int age,int teamSize){
        super(id,name,age);
        this.teamSize = teamSize;
    }

    @Override
    double showSalary(){
        salary = baseSalary*bonus;
        return salary+baseSalary;
    }

}
