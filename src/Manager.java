public class Manager extends Employee{

    int teamSize;
    double bonus = 30/100 ;
    double salary;

    @Override
    double showSalary(){
        salary = baseSalary*bonus;
        return salary+baseSalary;
    }

}
