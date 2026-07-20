public abstract class Employee {

    int id;
    int age;
    String name;
    double baseSalary = 25000;
    String department;

    public Employee(){};

    public Employee(int id,String name,int age){
        this();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    abstract double showSalary();

}
