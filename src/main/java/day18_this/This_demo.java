package day18_this;

/*
this 关键字的学习
哪个对象调用， 就代表哪个this
 */
public class This_demo {
    public static void main(String[] args) {
        Dog lucky = new Dog("lucky");

        Dog bill = new Dog("lucky",23);
    }
}

class Dog{
    String name;
    int age;

    public Dog(String name, int age) {
        // this 关键字指向对象本身
        this.name = name;
        this.age = age;
        System.out.println(this.hashCode());
    }

    public Dog(String name){
        this.name = name;
        System.out.println(this.hashCode());
    }
}


class T{
    //1. this关键字可以访问本类的属性，方法，构造器
    String name;
    int age;

        // this 访问本类的属性
    public T(String name, int age) {
        this.name = name;
        this.age = age;

    }


}