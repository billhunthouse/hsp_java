package day20_enucapsulation;

public class Person {

    public static void main(String[] args) {
        Person bill = new Person("bill", 160);
        System.out.println(bill.getAge());
        System.out.println(bill.getName());
    }

    // 设置构造器和get set 方法
    public String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    //1.设置get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() < 6) {
            this.name = name;
        } else {
            this.name = "无名氏";
            System.out.println("名称长度不合法");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 130) {
            this.age = age;
        }else{
            this.age = 0;
            System.out.println("年龄输入不合法");
        }
    }
}
