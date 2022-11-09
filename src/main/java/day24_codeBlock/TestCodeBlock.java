package day24_codeBlock;

public class TestCodeBlock {
    public static void main(String[] args) {
        CodeBlockDetail c1 = new CodeBlockDetail();
        c1.say();
        c1.hi();
        System.out.println(c1.name);
        CodeBlockDetail c2 = new CodeBlockDetail();
        System.out.println(c2.age); // 仅输出当前的值
        System.out.println(c2.name); //调用普通的静态成员时。 类会被加载
    }
}
