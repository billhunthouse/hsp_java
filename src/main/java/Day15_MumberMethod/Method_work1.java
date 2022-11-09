package Day15_MumberMethod;

public class Method_work1 {
    public static void main(String[] args) {
        Externet externet = new Externet();
        externet.other();
    }
}

class ClassWork{
    public void Inter(){
        System.out.println("我是内部的方法1");
    }

    public void Internet2(){
        System.out.println("我也是内部的方法");
        Inter();
        System.out.println("继续执行本方法");
    }
}
class  Externet{
    public void other(){
        ClassWork classWork = new ClassWork();
        classWork.Internet2();
        System.out.println("我是另外一个类");
    }
}
