package day22_polymorphic;

public class Poly_dynamic {
    public static void main(String[] args) {
        //编译类型是父类，运行类型是子类
        A a = new B();
        System.out.println(a.sum());  // 40
        System.out.println(a.sum1()); // 30

    }

}


class A{
    public int i = 10;
    public int sum(){
        return geti() +10;
    }
    public int geti(){
        return i;
    }

    public int sum1(){
        return i +10;
    }

}

class  B extends A{
    public int i = 20;
    public int sum(){
        return i + 20;
    }

    public int geti(){
        return i;
    }

    public int sum1(){
        return i +10;
    }
}
