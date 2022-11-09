package day22_polymorphic;

public class Polymorphic {
    public static void main(String[] args) {

        // 1.向上转型： 父类的引用对象， 指向了子类的空间
        // 2.编译类型对象指向的运行对象是其子类
        // 3.为什么叫向上转型呢， 因为是指向了父类的编译对象

        Animal animal = new Dog();
        animal.sleep();
        animal.sleep();


        // 1.类的向下转型
        // 2.向下转型的定义：
        // 3.编译类型是子类： 运行类型是子类本身引用的对象
        // a2 是指向子类的对象，在向下转型使用的时候指向了自己本身的空间
        // 4.向下转型的好处：

        // 编译类型才决定了可以调用的方法， 决定是向上还是向下转型

        System.out.println("--------");
        //向下转型
        Animal a2 = new Cat();
        Cat cat = (Cat) a2;
        cat.sleep();
        cat.run();



        Cat c2 = new Cat();
        // c2 指向的并不是父类的引用， 所以这只是一个普通的类加载和调用的过程
        Cat c3 = (Cat) c2;
        c3.run();


        Object obj = "hello";
        System.out.println(obj);
        String objStr = (String) obj;
        System.out.println(objStr);
    }
}
