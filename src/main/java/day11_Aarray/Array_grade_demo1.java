package day11_Aarray;

import java.util.Scanner;

public class Array_grade_demo1 {
    //输入5个人的成绩， 求平均值
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的成绩");
        double [] student  = new double[5];
        for(int i=0;i<student.length;i++){
            student[i] =  scanner.nextDouble();
            System.out.println(student[i]);

        }



    }
}
