package day05_AutoTypeCovert;
/*

强制类型转换笔记:
1.使用小括号提升优先级
2.字符串类型转换  variable + ""
3.

 */

import org.junit.Test;

public class ForceTypeConvert {
    @Test
    public static void main(String[] args) {
        int b1 = 2000;
        byte b2 = (byte) b1;
        System.out.println(b2);
    }
}
