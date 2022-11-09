package day25_interface;

public class InterfaceMoreStatus {
    public static void main(String[] args) {
        interface_A f = new D();
        System.out.println(f.getClass());
    }


}


interface interface_A{};


class D implements interface_A{
}