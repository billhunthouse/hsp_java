package day04_variableAndDataType;

/*
* 变量的使用规则
 */

public class variable {
    public static void main(String[] args) {
        // 1.定义并赋值
        int a = 1;
        System.out.println(a);
        // 2.先定义，然后再赋值， 然后再使用
        int b;
        b = 200;
        System.out.println(b);

        // 3.值可变，类型不可变
        a = 100;
        System.out.println(a);
        // a 是int类型， 不能赋值成为string类型
        // a = "jack";

        // 4.不能重名
        // 变量在同一个作用域内不能重名，变量a已经被使用，不能重名
        // int  a = 80;
    }


}
