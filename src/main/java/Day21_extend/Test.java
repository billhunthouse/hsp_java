package Day21_extend;

public class Test {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.CPU = "32";
        notepad.memory = "32";
        notepad.disk = "32";
        notepad.getDetail();
        notepad.color = "white";
        notepad.getinfo();

    }
}


class Computer{
    String CPU = "8core";
    String memory = "16G";
    String disk = "32";
    public void getDetail(){
        System.out.println(this.CPU + this.disk + this.memory);
    }

}

class PC extends Computer{
    String brand = "inter";
}

class  Notepad extends Computer{
    String color = "black";
    public void getinfo(){
        System.out.println("这个电脑的颜色是" + this.color);
    }
}

