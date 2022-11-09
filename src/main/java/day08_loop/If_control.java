package day08_loop;

import org.junit.Test;

import java.util.Scanner;
import java.util.Scanner.*;

public class If_control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();
        if(age>=18) {
            System.out.println("杂种，你可以蹲监狱了");
        }
        else{
            System.out.println("小杂种，年龄不够，继续上学吧");
        }
    }
////    @Test
////    public void single_contror(){
////        Scanner scanner = new Scanner(System.in);
////        int age = scanner.nextInt();
////
////        if(age>=18){
////            System.out.println("你的年龄超过18了，可以进监狱了");
////
////        }
//    }
}
