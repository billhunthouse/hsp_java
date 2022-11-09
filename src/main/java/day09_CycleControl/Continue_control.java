package day09_CycleControl;

public class Continue_control {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            if(i%3==0){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
