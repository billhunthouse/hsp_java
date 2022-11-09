package Day17_OverloadAndParam;
/*
类的属性的两种调用方法
1.通过对象调用
2.定义一个新的方法， 接收别的对象当做参数， 直接调用
 */

public class Class_call {
    public static void main(String[] args) {
        Person person = new Person();
        person.say();
        person.test(person);
    }
}


class Person{
    String name = "jack";
    public void say(){
        System.out.println(name);
    }

    // 在类的内部定义一个方法， 形参类别是类，通过类调用
    public void  test(Person p){
        System.out.println(p.name);
    }
}