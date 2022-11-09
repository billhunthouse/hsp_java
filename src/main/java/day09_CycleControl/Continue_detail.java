package day09_CycleControl;

public class Continue_detail {
    public static void main(String[] args) {
        tag1:
        for (int i = 0; i < 3; i++) {
            tag2:
            for (int j = 1; j < 3; j++) {
                if (j % 2 == 0) {
                    // 调到指定的标签处
                    continue tag1;
                }else{
                    System.out.println("i"+"="+i);
                    System.out.println("j"+"="+j);
                }

            }

        }

    }
}
