package day21_super;

import day21_super.Son;

public class Caller {
    public static void main(String[] args) {
        Son son = new Son();
        son.say();
        System.out.println(son.getPrivateKey());
        System.out.println("----------------分割线---------------");
        Son_extend son_extend = new Son_extend();
        son_extend.action();

    }
}
