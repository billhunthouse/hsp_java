package Day21_extend;

public class C extends B{
    public C(){
        this("hello");
        System.out.println("我是C类的无参构造器");
    }
    public C(String name){
        super("hello");
        System.out.println("我是C类的有参构造器");
    }
}
