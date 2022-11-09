package day08_loop;
/*
switch 练习题
 */

import java.util.Scanner;

public class Switch_Detail02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小写字母a-d");
        char chartac = scanner.next().charAt(0);
        switch (chartac) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            default:
                System.out.println("other");
        }

    }
}

