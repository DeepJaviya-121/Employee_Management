public class Developer extends Employee{


    double projectBonus = 20/100;
    double salary;

    @Override
    double showSalary(){
        salary = baseSalary*projectBonus;
        return salary+baseSalary;
    }
}
