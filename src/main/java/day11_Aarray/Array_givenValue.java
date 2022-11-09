package day11_Aarray;

public class Array_givenValue {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        n2 = 80;
        System.out.println("n1的值是"+ n1);
        System.out.println("n2的值是"+ n2);
        // 预期结果. n2= 80 n1 = 10
        // 基本数据类型是值拷贝
        // 数组的数据类型是引用传递， 传递的是地址， 叫做地址拷贝或者引用传递
    }
}
