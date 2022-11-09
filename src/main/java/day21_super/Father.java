package day21_super;

public class Father {
    public  String name = "father";
    protected  String att = "父类的属性";
    private String privateKey = "私有属性";


    public Father() {
        System.out.println("father的无参构造器");
    }

    public void say(){
        System.out.println("这是父类的公共方法");
    }

    private void fatherMethod(){
        System.out.println("这是父类的隐私方法， 不可以被调用");
    }

    public String getPrivateKey() {
        return "privateKey的值是：" + privateKey;
    }
}
