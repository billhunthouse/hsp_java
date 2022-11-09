package day11_Aarray;

/*
Array 的使用细节：
1.类型可以兼容，但并不是全部兼容,只能大兼容小的。小的无法自动转换类型为大的
2.数组中的类型， 可以是任何类型，基本数据类型和引用类型， String
3.如果定义了数组但是没赋值，那么会有默认值
 */
public class Array_detatil_01 {
    public static void main(String[] args) {
        double [] array_detail01 = {3,3.5,22};
        for(int i = 0;i<array_detail01.length;i++){
            // 3-> 3.0  int  自动转变成double
            System.out.println(array_detail01[i]);
        }
        // 1.int 默认值为0
        int[] intDefault = new int[1];
        System.out.println(intDefault[0]);
        char[] charDefault = new char[1];
        System.out.println(charDefault[0]);
        String[] stringDefault = new String[1];
        System.out.println(stringDefault[0]);

    }
}
