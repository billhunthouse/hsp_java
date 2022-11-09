package HomeWork;

public class HomeWorkTest {

    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("bill", 23, "test");
        p[1] = new Person("tom", 22, "develop");
        p[2] = new Person("jack", 21, "ops");

        // 冒泡排序， 逐个对比， 前后换位， 大的在前
        for(int i = 0;i < p.length;i++){
            if(p[i].getAge()<p[i+1].getAge()){

                p[0] = p[1];

            }
        }
    }
}
