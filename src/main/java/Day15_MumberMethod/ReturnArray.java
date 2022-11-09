package Day15_MumberMethod;

public class ReturnArray {
    public static void main(String[] args) {
        Method_demo d1 = new Method_demo();
        // 2.调用方法，需要定义一个对象去接收
        int[] arr = d1.returnObject(5,3);
        // 3.要取用数组的值，需要再接收
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}

class Method_demo {
    // 1. 返回类型是数组
    public int[] returnObject(int n1, int n2) {
        int[] arr = new int[2];
        arr[0] = n1 + n2;
        arr[1] = n1 - n2;
        return arr;
    }
}
