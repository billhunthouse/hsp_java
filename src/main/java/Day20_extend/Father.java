package Day20_extend;
/*
继承的细节
 */


public class Father {
    public String name = "father";
    protected int age = 23;
    int tall = 187;
    private double saraly = 17000;

    public Father() {
        System.out.println("我是父类的无参构造器");
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是父类的有两个参数的构造器：String name, int age  ");
    }

    public void test1() {
        System.out.println("我是公共方法test1");
    }

    protected void test2() {
        System.out.println("我是受保护的方法test2");
    }

    void test3() {
        System.out.println("我是默认方法test3");
    }

    private void test4() {
        System.out.println("我是私有方法test4");
    }

    public double getSaraly() {
        return saraly;
    }

    public void setSaraly(double saraly) {
        this.saraly = saraly;
    }
}
