package day08_loop;

import org.junit.Test;

import java.util.Scanner;

public class If_demo {
    public static void main(String[] args) {
        //double 变量并赋值，第一个数大于10，第二个数小于20，打印两数之和
        double d1 = 12.2;
        double d2 = 19.5;
        if(d1>10){
            if(d2>20){
                System.out.println();
            }else{
                System.out.println(d1+d2);
            }
        }else{
            System.out.println("d1小于等于10");
        }


    }

}
