package day08_loop;

import java.util.Scanner;

public class If_demo02 {
    public static void main(String[] args) {
        // 给定一个数，判断是否又能被3整除，又能被5整除
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数：");
            int number = scanner.nextInt();
            if(number%3==0){
                if (number%5==0){
                    System.out.println("number是3和5的倍数");
                }else{
                    System.out.println("是3的倍数，但不是5的倍数");
                }
            }else{
                System.out.println("不是3的倍数，也不是5的倍数");

        }
    }
}
