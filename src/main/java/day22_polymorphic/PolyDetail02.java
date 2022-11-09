package day22_polymorphic;

public class PolyDetail02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);  // 20
        s.display();  // 20
        Base b = s;   //向上转型
        System.out.println(b == s);  // b == s  == equal 和hashcode的区别  == 说明地址是同一个 True
        System.out.println(b.count); //调用的对象还是s，需要查看编译类型，  编译类型是10
        b.display();  //方法的调用正确，没加载
        System.out.println("--------");
        System.out.println(b.hashCode());
        System.out.println(s.hashCode());



    }
}

class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}


class Sub extends Base{
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}