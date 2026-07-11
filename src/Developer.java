public class Developer extends Employee{


    double projectBonus = 0.20;
    double salary;
    public Developer(int id,String name,int age,double salary){
        super(id,name,age);
        this.salary = salary;

    }


    @Override
    double showSalary(){
        salary = baseSalary*projectBonus;
        return salary+baseSalary;
    }
}
