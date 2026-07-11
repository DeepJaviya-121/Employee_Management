public class Manager extends Employee{

    int teamSize;
    double bonus = 0.30 ;
    double salary;

    public Manager(int id,String name,int age,int teamSize,double salary){
        super(id,name,age);
        this.teamSize = teamSize;
        this.salary=salary;
    }

    @Override
    double showSalary(){
        salary = baseSalary*bonus;
        return salary+baseSalary;
    }

}
