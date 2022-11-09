package day22_polymorphic;

public class Manage extends Employee{
    public Manage(String name, double salary) {
        super(name, salary);
    }

    private double bounds;

    public double getBounds() {
        return bounds;
    }

    public void setBounds(double bounds) {
        this.bounds = bounds;
    }

    public Manage(String name, double salary, double bounds) {
        super(name, salary);
        this.bounds = bounds;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bounds;
    }

    public void Mange(){
        System.out.println("领导要管理");
    }


}
