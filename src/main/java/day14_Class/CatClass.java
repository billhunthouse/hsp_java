package day14_Class;

import java.util.Scanner;

public class CatClass {
    public static void main(String[] args) {
        // 1.定义一个输入，查看是否和cat 相等
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个名字");
        // 2.判断输入的名字和猫的名字是否相等
        Cat cat2 = new Cat();
        cat2.name = scanner.next();
        // 3.定义花猫的信息
        Cat color = new Cat();
        color.name = "小花";
        color.age = 3;
        color.color = "red";

        if(cat2.name=="小花"){
            System.out.println(color.name);
        }else {
            System.out.println("没有这个猫");
        }

    }
}

class Cat{
    String name ;
    String color ;
    int age;
}