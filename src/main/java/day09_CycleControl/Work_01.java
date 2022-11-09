package day09_CycleControl;

public class Work_01 {
    public static void main(String[] args) {
        // 1.某人有100,000元  当现金>50000时，缴纳5%，当现金小于等于50,000时，每次缴纳1000
        // 2.使用while  break 计算,该人可以经过多少次路口
        double cash = 100000;
        int count = 0;
        while (true){
            if(cash>50000){
                cash = cash-cash*0.05;
                count++;
            }else if (cash<=5000&&cash>1000){
                cash = cash-1000;
                count++;
            }else{
                break;
            }
            System.out.println(count);
        }

    }
}
