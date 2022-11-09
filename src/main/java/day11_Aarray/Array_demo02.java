package day11_Aarray;

public class Array_demo02 {
    public static void main(String[] args) {
        //1.数组练习，定义A-Z
        char chara = 'A';
        char[] charArray = new char[26];
        for (int i = 0; i < 26; i++) {
            // 数据类型转换，强制转换 (数据类型）  （值）
            charArray[i] = (char) (chara + i);

        }
        for (int j = 0; j < 26; j++) {
            System.out.println(charArray[j]);
        }
    }
}
