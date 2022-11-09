package day25_interface;

public class ClassAndInterfaceRelation {
    public static void main(String[] args) {
        ComeTrue comeTrue = new ComeTrue();
        comeTrue.a();
        comeTrue.b();
    }
}


class ComeTrue implements B{

    @Override
    public void a() {
        System.out.println("我是a的方法");
    }

    @Override
    public void b() {
        System.out.println("我是b方法");

    }
}


interface A{
    public void a();
}

interface B extends A{
    public void b();
}