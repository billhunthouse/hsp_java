package Day15_MumberMethod;

public class Param_transmit {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        AA aa = new AA();
        aa.BasicDataType_transmit(10,20);
        System.out.println("主方法中，未交换位置之前，a的值是： "+ a +"b的值是" +b);
        System.out.println("主方法中，交换位置之后，a的值是： "+ a +"b的值是" +b);

    }
}

class AA {
   public void BasicDataType_transmit(int a,int b){
       System.out.println("未交换位置之前，a的值是： "+ a +"b的值是" +b);
       int tmp = a;
       a = b;
       b = tmp;
       System.out.println("交换位置之后，a的值是： "+ a +"b的值是" +b + "tmp的值是： "+ tmp);
   }
}
