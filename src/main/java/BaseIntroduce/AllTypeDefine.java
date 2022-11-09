package BaseIntroduce;

public class AllTypeDefine {
    public static void main(String[] args) {
        /*
        基本数据类型的定义：
        1.整形：byte,short,int,long
        2.浮点类型：double,float
        3.字符型：char
        4.布尔型：Boolean
         */

        byte b1 = 3;
        short s1 = 10;
        int i1 = 13;
        long l1 = 18;

        System.out.println("整型数据定义输出如下：");
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);




        System.out.println("浮点型数据定义输出如下：");
        double d1 = 13.13;
        float f1 = 119;
        System.out.println(d1);
        System.out.println(f1);

        System.out.println("字符串的定义和输出如下：");
        char char1 = 'h';
        char char2 = '段';
        System.out.println(char1);
        System.out.println(char2);

        // char 字符，代表了单个字符，也可以代表单个字符，用来存放一个汉字
        // char 的定义只能是单引号， 双引号会报错
        // char 定义的值只能是一个字母或者是一个汉字，否则会报错

        boolean boo1 = true;
        boolean boo2 = false;
        System.out.println(boo1);
        System.out.println(boo2);

    }
}
