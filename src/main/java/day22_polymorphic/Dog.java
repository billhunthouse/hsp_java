package day22_polymorphic;

public class Dog extends Animal{

    public void sleep() {
        System.out.println("狗会躺着睡觉");
    }

    public void eat() {
        System.out.println("狗会吃骨头");
    }
    public void run() {
        System.out.println("狗会四条腿跑");
    }

}
