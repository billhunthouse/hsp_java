package day11_Aarray;

public class ArrayCopy {
    public static void main(String[] args) {
        // 1.数组拷贝
        int [] array1 = {3,4,56,7};
        // 1.将数组1的每个值赋值给数组2
        int[] array2 = new int[array1.length];
        for(int i = 0;i<array1.length;i++){
            array2[i] = array1[i];
        }

        for(int j = 0;j<array2.length;j++){
            System.out.println(array2[j]);
        }
    }
}
