package day08_loop;
/*
1.switch 关键字
2.表达式对应一个值
3.case 常量1，就执行语句块1
4.break  停止当前的Switch，程序继续执行
5.如果都没有匹配上， 匹配default

6.如果都没有break 会一直穿透到最后一个逻辑里面，把所有内容都输出

 */

import java.util.Scanner;

public class Switch_control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符");
        char week = scanner.next().charAt(0);

        // a,= 1 ，b =2 c = 3
        switch (week) {
            case 'a':
                System.out.println("今天是周一");
                break;
            case 'b':
                System.out.println("今天是周二");
                break;
            case 'c':
                System.out.println("今天是周三");
                break;
            case 'd':
                System.out.println("今天是周四");
                break;
            case 'e':
                System.out.println("今天是周五");
                break;
            case 'f':
                System.out.println("今天是周六");
                break;
            case 'g':
                System.out.println("今天是周日");
                break;
            default:
                System.out.println("地球炸了");
        }
    }
}
