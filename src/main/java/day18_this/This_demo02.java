package day18_this;

public class This_demo02 {
    public static void main(String[] args) {
        Person p = new Person("bill", 23);
        System.out.println(p.compareTo(p));

    }
}


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person p) {
        if (this.hashCode() == p.hashCode()) {
            return true;
        } else return false;
    }
}
