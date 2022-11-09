package Day19_AccessModifier;
/*
1.访问修饰符可修饰 类的属性，成员方法 以及类
 */

public class Modifiler {

}

class PublicClass {
    public String name;
    protected String tall;
    int age;
    private double weight;

    public void demo1() {
        System.out.println(this.name);
        System.out.println(this.tall);
        System.out.println(this.age);
        System.out.println(this.age);

    }
}

class B {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.name = "hello";
        System.out.println(publicClass.name);
    }
}
