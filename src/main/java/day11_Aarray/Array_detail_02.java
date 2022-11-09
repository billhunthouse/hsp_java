package day11_Aarray;

public class Array_detail_02 {
    public static void main(String[] args) {
        //Todo 1： 求一个数组的最大值
        // int[] max = {4,-1,9,10,23};
        int[] max = {4,-1,9,10,23};
        for(int i =0;i< max.length;i++){
            if(max[i]>max[i+1]){
                max[0] = max[i];
            }
        }
    }
}
