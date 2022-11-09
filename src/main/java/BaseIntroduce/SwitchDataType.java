package BaseIntroduce;

public class SwitchDataType {

    public static void main(String[] args) {
        /*
        数据类型转换细节：

        1.数据类型之间有的可以发生转换,有的无法发生转换， 如： String 无法直接转换成int
        2.当精度小的和精度大的同时存在的时候， 会自动转换成为精度大的数据，然后再进行计算

         */

        String s1 = "2";
        int i1 = 3;
//        System.out.println((Integer)s1+3);

        int i2 = 8;
        double d1 = 9.8;

        //2.当精度小的和精度大的同时存在的时候， 会自动转换成为精度大的数据，然后再进行计算
        System.out.println(i2 + d1);

        //3.

    }

}
