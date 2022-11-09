package Dynamic;

public class Bind {

    public static void main(String[] args) {
        Person[] p = new Person[5];
        p[0] = new Person("jack", 20);
        p[1] = new Student("bill", 20, 2010);
        p[2] = new Student("water", 21, 2011);
        p[3] = new Teacher("lion", 21, 25000);
        p[4] = new Teacher("moony", 30, 35000);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].say());
        }

    }
}
