package Day17_OverloadAndParam;


public class OverLoad_01_sequence {
    public static void main(String[] args) {
        OverLoad overLoad = new OverLoad();
        System.out.println(overLoad.cal(2.3, 2));
    }
}


class OverLoad {
    public int cal(int n1, int n2) {
        return n1 + n2;
    }

    public double cal(double n1,int n2){
        return n1 + n2;
    }

    // 1.形参名称不同，不构成重载
//    public void cal(int n2, int n1) {
//        System.out.println(n1);
//        System.out.println(n2);
//    }

    // 2.返回值类型不同，也不构成重载
//    public void cal(int n2, int n1) {
//        System.out.println(n1);
//        System.out.println(n2);
//    }
}