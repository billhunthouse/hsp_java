package day08_loop;

import java.util.Scanner;

/*
switch 加强练习
如果输入的月份是3,4,5那么是春季，6,7,8是夏季，9,10,11是秋季，12,1,2是冬季
原理:利用的switch 的穿透特性，简化代码， 如果都在同一个范围内，那么则不用写
 */
public class Switch_Ensure {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("input number");
            int season = scanner.nextInt();
            switch (season){
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
                    break;
            }
        }
    }
}
