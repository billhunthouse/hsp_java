package day08_loop;

import java.util.Scanner;

/*
判断多分支场景
 */

public class MoreIf_control {
    public static void main(String[] args) {
        //判断学生的成绩
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        double grade = scanner.nextDouble();
        if(grade>=90){
            System.out.println("成绩优秀，牛逼");
        }else if (grade>=80&&grade<90){
            System.out.println("成绩不错，接近优秀");
        }else if(grade>=60&&grade<80){
            System.out.println("刚刚超过及格线");
        }else{
            System.out.println("没及格");
        }
    }
}
