package day09_CycleControl;

/*
循环控制练习，统计9的倍数和总和
 */
public class For_control {

    public static void main(String[] args) {
        // 1.for 循环， 从1 + 到 100 ， 判断取余是否 = 0, 如果等于=0 那么是 9 的倍数
        // 2.如果是9的倍数， 再定义一个变量，用来接收是9 的倍数的有多少个
        // 3.定义sum 总和  += 这个变量
        int number = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                number++;
                sum += i;
                System.out.println("9的倍数总共有" + i+" "+ number + "个," + "总和是：" +sum);
            }
        }
    }
}
