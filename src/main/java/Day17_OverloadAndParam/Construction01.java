package Day17_OverloadAndParam;

public class Construction01 {
    public static void main(String[] args) {
        Person02 p2 = new Person02("Tom",24);
        System.out.println(p2.name);
        System.out.println(p2.age);

    }
}


class Person02{
    String name;
    int age;

    public Person02(String name, int age) {
        this.name = name;
        this.age = age;
    }


}