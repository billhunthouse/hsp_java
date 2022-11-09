package day25_interface;

public class InterfaceExercise02 {
    public static void main(String[] args) {
        new CC().px();
    }
}

interface AA {
    int x = 0;
};


class BB {
    int x = 1;
}

class CC extends BB implements AA{
    public void px(){
        System.out.println(A.x);
    }


}

