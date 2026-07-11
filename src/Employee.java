public abstract class Employee {

    int id;
    int age;
    String name;
    double baseSalary = 25000;
    String department;

    public Employee(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }


    abstract double showSalary();

}
