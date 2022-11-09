package day11_Aarray;

public class Array_demo {
    public static void main(String[] args) {
        double sum = 0;
        double[] eggs = {3, 4, 5};
        for (int i = 1; i < eggs.length; i++) {
            sum += eggs[i];
            double average = sum / eggs.length;
            System.out.println(average);

        }

    }
}
