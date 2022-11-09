package day04_variableAndDataType;
/*
*
*  +号的运算规则
*
 */

public class AddSymbol {
    public static void main(String[] args) {
        // 1.数值做加减
        System.out.println(100+108.3);

        // 2.数值加文字做拼接
        System.out.println("100"+"+"+"3"+"="+100+3);

        // 3.运算规则，从左到右
        //   3.1 从左到右，先做加减，然后拼接
        System.out.println(100+3+"hello");
        System.out.println("hello"+100+3);
    }
}
