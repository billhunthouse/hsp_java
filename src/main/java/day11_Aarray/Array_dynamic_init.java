package day11_Aarray;

import java.util.Scanner;

public class Array_dynamic_init {
    public static void main(String[] args) {
        //1.定义一个数组，用来接收6个学生的成绩，求平均值
        double[] score = new double[5];
        for (int i = 1; i < 7; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入6个学生的成绩");
            score[i] = scanner.nextDouble();
        }

    }
}
