package Day15_MumberMethod;

public class ArrayMumberMethod {
    public static void main(String[] args) {
        Loop loop = new Loop();
        int[][] array01 = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
        loop.map = array01;
        loop.print();
        // 遍历输出所有元素

    }
}


class Loop {
    int[][] map = new int[3][3];

    public void print() {

        for (int i = 0; i < map.length; i++) {
            // 循环遍历内层的每个元素
            for (int j = 0; j < map[i].length; j++) {
                System.out.println(map[i][j]);
            }
        }
    }
}