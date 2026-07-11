public class Developer extends Employee{


    double projectBonus = 0.20;
    double salary;
    public Developer(int id,String name,int age){
        super(id,name,age);
    }


    @Override
    double showSalary(){
        salary = baseSalary*projectBonus;
        return salary+baseSalary;
    }
}
