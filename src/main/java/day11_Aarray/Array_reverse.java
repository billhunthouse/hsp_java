package day11_Aarray;

public class Array_reverse {
    public static void main(String[] args) {
        // 1.数组反转
        double[]  Oreverse= {3,4,234.3,31};
        double[]  Nreverse= new double[Oreverse.length];
        // 从旧数组开始遍历， 旧数组的第一个值等于新数组的第一个值，  以此类推
        for(int i = 0; i<Oreverse.length;i++){
            Nreverse[Oreverse.length-i-1]  = Oreverse[i];
        }
        for(int j = 0; j<Nreverse.length;j++){
            System.out.println(Nreverse[j]);
        }
    }
}
