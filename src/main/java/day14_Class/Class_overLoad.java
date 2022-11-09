package day14_Class;

public class Class_overLoad {
    public static void main(String[] args) {
        Person a = new Person();
        a.age =10;
        a.name = "小明";
        Person b;
        b = a;
        System.out.println(b.name);
        // 预期 小明
        b.age = 200;
        b = null;
        System.out.println(a.age);
        //预期200
        System.out.println(b.age);
        // 预期 0·
    }
}

class Person{
    String name;
    int age;
}