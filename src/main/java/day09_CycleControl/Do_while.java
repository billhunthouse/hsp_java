package day09_CycleControl;

public class Do_while {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("你好，韩顺平教育" + i);
            i ++;
            // 1.如果为假的话，继续执行循环体
            // 2.如果为真的话，停止判断
        }while (i<11);
    }
}
