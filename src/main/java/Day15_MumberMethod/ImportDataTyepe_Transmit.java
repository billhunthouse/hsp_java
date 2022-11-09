package Day15_MumberMethod;

public class ImportDataTyepe_Transmit {
    //1.应用数据类型
    public static void main(String[] args) {
        BB bb = new BB();
        //原来的数组是
        int[] new_arr = bb.test100(new int[]{3, 5});

    }

}

class BB {
    // 在定义传参类型的时候， 需要为数组也定义形参的名字
    public int[] test100(int[] arr) {
        //数组名称= new  数组 + 值
        arr[0] = 100;
        System.out.println(arr[0]);
        return arr;
    }
}
