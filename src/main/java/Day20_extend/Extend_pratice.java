package Day20_extend;

public class Extend_pratice {
    public static void main(String[] args) {


        // 1. 调用子类的对象时， 会直接调用父类的构造器
        Son son = new Son();
        System.out.println(son.tall);

        // 2. 可以调用父类的公共的方法和属性，  可以通过公共的方法获得私有的属性
        System.out.println(son.getSaraly());

        // 3.如果希望使用指定父类的哪个构造器， 那么使用super指定一下
    }
}
