package day24_codeBlock;

public class CodeBlockDetail {
    public String name = "hello";
    static {
        System.out.println("我是静态代码块，我只会被执行一次");
    }

    public static int age = 3;
    public CodeBlockDetail() {
        System.out.println("我是无参构造器，我被调用了");
    }

    {
        System.out.println("我是普通代码块,我是第一次被执行");
    }
    {
        System.out.println("我是普通代码块,我是第二次被执行");  // 代码块都会被执行，无论是第几次

    }

    public void say(){
        System.out.println("我是普通的方法");
    }

    public static void hi(){
        System.out.println("我是静态方法");
    }
}
