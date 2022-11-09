package Day19_AccessModifier;
/*
封装的步骤：
1.在类中定义属性
2.通过get 和set 方法对属性进行赋值
3.通过set方法进行赋值， 并添加业务逻辑
 */


public class PublicClassTest {
    public static void main(String[] args) {
        B b = new B("张三到此", 2145);

    }

}

class B {
    public String name;
    private int age;

    public String getName() {
        return name;
    }


    void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;

        } else {
            this.name = "无名氏";
        }
    }

    public int getAge() {
        return age;
    }

    public String setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
            return "客户的年龄是：" + this.age;
        } else {
            return "输入的年龄不合法，这特么是老妖怪";
        }
    }

    // 1.创建构造器. 通过构造器来防止程序出现被卡bug的情况
    // 2.如果不在构造器中写入set方法，那么通过构造器即可对属性进行赋值
    public B(String name, int age) {
        setName(name);
        setAge(age);
    }
}