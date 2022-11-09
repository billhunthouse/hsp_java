package Day20_extend;


// 子类继承了父类，然后调用父类的公共的属性和方法
public class Son extends Father {
    public String sonName;

    // 3.如果希望使用指定父类的哪个构造器， 那么使用super指定一下
    public Son() {
        super();
        System.out.println("我是子类的无参构造器");
    }


    public Son(String sonName) {
        this.sonName = sonName;
    }

    // 3.如果希望使用指定父类的哪个构造器， 那么使用super指定一下 ,在子类的形参中定义父类的形参
    public Son(String name, int age, String sonName) {
        super(name, age);
        this.sonName = sonName;
    }


}
