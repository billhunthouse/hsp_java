package day25_interface;

public class InterfaceArray {
    public static void main(String[] args) {
        Usbs[] usb = new Usbs[2];
        usb[0] = new Phone();
        usb[1] = new Camera();
        for (int i = 0; i < usb.length; i++) {
            usb[i].work();
            if(usb[i] instanceof Phone){
                ((Phone) usb[i]).call();
            }

        }
    }

}

interface Usbs{
    public void work();
}


class Phone implements Usbs{

    @Override
    public void work() {
        System.out.println("手机在工作");
    }

    public void call(){
        System.out.println("手机可以打电话");
    }
}

class Camera implements Usbs{

    @Override
    public void work() {
        System.out.println("相机开始工作了");
    }


}