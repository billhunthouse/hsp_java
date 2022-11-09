package day09_CycleControl;

public class Do_while_pratice {
    public static void main(String[] args) {
        //1. do while 练习1到100
        //2. 计算1- 100 的和
        //3. 统计1-200 之间能被5整除，但不能被3整除的个数

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 101);

        System.out.println("------分割线-------");

        // 2.定义1个sum 用来接收所有的和
        int sum = 0;
        int i2 = 1;
        do {
            sum += i2;
            i2++;
        } while (i2 < 101);
        System.out.println(sum);


        //3. 统计1-200 之间能被5整除，但不能被3整除的个数
        //  1.定义一个count用来接收个数
        //  2.do while be used judge whether greater than 200
        int i3 = 1;
        int count = 0;
        do {
            if (i3 % 5 == 0) {
                if (i3 % 3 != 0) {
                    count++;
                } else {

                }
            } else {
                System.out.println("不是5的倍数");
            }
            i3++;
            System.out.println(count);
        } while (i3<201);
    }


}
