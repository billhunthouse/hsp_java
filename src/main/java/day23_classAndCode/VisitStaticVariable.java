package day23_classAndCode;

public class VisitStaticVariable {
    public static void main(String[] args) {
        System.out.println(StaticVaiable.salary);
        StaticVaiable visit = new StaticVaiable();
        System.out.println(visit.salary);
    }
}



