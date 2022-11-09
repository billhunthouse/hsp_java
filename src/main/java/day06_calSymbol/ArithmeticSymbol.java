package day06_calSymbol;
/*
算术运算符
1.取余 %
 */

import org.junit.Test;

public class ArithmeticSymbol {
    @Test
    public void Eval() {
        //1. 取余
        System.out.println(10 % 4);
    }

    @Test
    public void navigate() {
        int d1 = 10 % -3;
        System.out.println(d1);
    }

    @Test
    public void AutoAdd(){
        int b = 2;
        int e = 2;

        int c = b++; //2

        int d = ++e;  // 3
        System.out.println(c);
        System.out.println(d);
    }

    @Test
    public void reduceData(){
        int days = 30;
        int week = 30 / 7 ;
        int day = 30 % 7; ;

        System.out.println(30 +"天,包含" + week +"周余"+ day + "天");

    }
}
