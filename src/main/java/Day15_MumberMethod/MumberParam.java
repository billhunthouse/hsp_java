package Day15_MumberMethod;

public class MumberParam {
    public static void main(String[] args) {
        ReturnDemo returnDemo = new ReturnDemo();
        System.out.println(returnDemo.param("hi"));
    }
}

class ReturnDemo {
    // 返回值是int ， 形参可以是string类型， 可以不一致
    // 方法如果有返回值， 要调用sout 打印查看， 如果没有返回值， 不可传递给其他人调用，且要查看是否有print
    public int param(String name) {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
}
