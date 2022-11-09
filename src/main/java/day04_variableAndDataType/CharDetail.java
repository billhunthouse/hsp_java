package day04_variableAndDataType;
/*
char 类型使用细节
 */

import org.junit.Test;

public class CharDetail {


    @Test
    public void charDetail() {
        char n1 = 'c';
        System.out.println(n1);
    }

    // 字符转数字
    @Test //字符转数字
    public void charTurnNumber() {
        char c1 = 'h';
        System.out.println((int)(c1));
    }




    //数字转字符
    @Test
    public void NumberTurnChar(){
        int n1 = 114;
        char n2 = (char) n1;
        System.out.println(n2);
    }

    @Test
    public void  CharAdd(){
        char h1 = 'h';
        int i2 = 10;
        int i3 = 13;
        System.out.println(h1+i2);
        int add = i2 + i3;
        char newValue = (char)(add);
        // 想要输出数字对应的字符
        System.out.println(newValue);
    }

}
