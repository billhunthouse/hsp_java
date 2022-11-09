package Day15_MumberMethod;

public class Work2 {
    public static void main(String[] args) {
        work work = new work();
//        System.out.println(work.judge(10));
        work.print(10, 10, '$');
    }

}


class work {
    // 1. 根据参数number返回是否为奇数还是偶数
    // 2. number %2 != 0 的话， 返回false
    public boolean judge(int number) {
        return number % 2 != 0;
    }

    public void print(int row, int column, char sym) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(sym);

            }
            System.out.println();


        }
    }
}