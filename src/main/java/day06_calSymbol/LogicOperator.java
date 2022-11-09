package day06_calSymbol;

import org.junit.Test;

public class LogicOperator {

    @Test
    public void With(){
        // 逻辑与.
        int a = 3;
        if( a > 5 & a ++  < 10){
            System.out.println("条件都为真，a的值是"+ a);
            // a = 4
        }
        else{
            System.out.println("a的值是"+ a);

        }

        int b = 3;
        if( b > 5 && b ++  < 10){
            System.out.println("条件都为真，b的值是"+ a);
            // a = 3
        }
        else{
            System.out.println("b的值是"+ b);
        }
    }

    @Test
    public void Or(){
        // 或： 有一个为真则都为真
        int or1 = 10;
        if(or1 > 10 || or1++ > 20){
            System.out.println("条件有一个成立,or1的值是" + or1);
        }

        else{
            System.out.println("条件都不成立,or1的值是" + or1);
        }// F || F.  效率高， 条件后面的不执行,or1= 10

        int or2 = 10;
        if(or2 > 10 | or2++ > 20){
            System.out.println("条件有一个成立,or1的值是" + or2);
        }
        else{
            System.out.println("条件都不成立,or2的值是" + or2);
        }// F || F.  效率低， 条件后面的也执行,or1= 11


    }

    @Test
    public void Convert(){
        int a = 30;
        int b = 40;
        boolean flag = a == b;
        boolean convert = !(false);
        System.out.println(flag);
        System.out.println(convert);
    }

    @Test
    public void Xor(){
        // 当结果一为一为假时，才为真
        int a = 50;
        int b = 100;
        boolean xor1 = (a>30) ^(100>50);
        System.out.println("预期结果是false:" + xor1);
    }
}
