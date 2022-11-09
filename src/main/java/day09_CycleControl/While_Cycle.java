package day09_CycleControl;

public class While_Cycle {
    public static void main(String[] args) {
        int i = 1;
        while (i<10){
            System.out.println("韩顺平你好："+i);
            i++;
        }

        int p1 = 1;
        while (p1<=100){
            if(p1%3==0){
                System.out.println(p1+"能够被3整除");
            }
            p1++;
        }
    }
}
