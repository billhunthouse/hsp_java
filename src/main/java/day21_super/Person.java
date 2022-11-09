package day21_super;

public class Person {
   private  String name;
   private  int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我被调用了");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String say(){
        return "我的姓名是：" + name + " " + "我的年龄是：" + age;
    }
}
