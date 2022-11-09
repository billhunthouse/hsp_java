package day22_polymorphic;

public class Cat extends  Animal {
    public void sleep() {
        System.out.println("猫会睡觉");
    }

    public void eat() {
        System.out.println("猫会吃鱼");
    }
    public void run() {
        System.out.println("猫会蹦");
    }
}
