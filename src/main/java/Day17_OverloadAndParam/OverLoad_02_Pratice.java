package Day17_OverloadAndParam;

public class OverLoad_02_Pratice {
    public static void main(String[] args) {
        Work work = new Work();
        System.out.println(work.m(3));
        System.out.println(work.m(3,3));
        System.out.println(work.m("hello"));
    }
}

class Work {
    public int m(int n1) {
        return n1 * n1;
    }

    public int m(int n1, int n2) {
        return n1 * n1 + n2 * n2;
    }

    public String m(String n1){
        return  n1;
    }
}
