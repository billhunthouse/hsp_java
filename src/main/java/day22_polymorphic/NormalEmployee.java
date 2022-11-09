package day22_polymorphic;

public class NormalEmployee extends Employee{
    public NormalEmployee(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工要工作");
    }
}
