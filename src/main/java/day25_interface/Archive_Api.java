package day25_interface;

public class Archive_Api implements Interface_demo{

    @Override
    public void say() {
        System.out.println("我实现了类");
    }

    @Override
    public void hello() {
        System.out.println("我也实现了类");
    }
}
