package Day20_extend;

public class B extends A {
    B() {
        // 1.如果无this ,n那么此处可以有super
        // 2.如果有this ,那么此处不得有super
        super("bill");
//        this("abc");
        System.out.println("b");
    }
    B(String name){
        //1. super 无参构造器在此处
        super();
        System.out.println("b name");
    }

}
