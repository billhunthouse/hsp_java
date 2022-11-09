package Day17_OverloadAndParam;

public class Construction_03 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.age);
        System.out.println(dog.name);
    }
}


class Dog{
    String name;
    int age;

    public Dog() {
        // 1.定义的无参构造器
        this.age = 18;
    }

    public Dog( int age) {
        // 不能在构造器内部为属性赋值， 否则调用时无法为其赋值
        this.age = age;
    }

    public Dog(String pname, int page) {
        this.name = pname;
        this.age = page;
    }
}