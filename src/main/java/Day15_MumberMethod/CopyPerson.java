package Day15_MumberMethod;

public class CopyPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "jack";
        person.age = 23;
        CopyObject copyClass = new CopyObject();
        copyClass.copyPerson(person);
        //复制成功，查看类成员变量
        System.out.println(copyClass.hashCode());
        System.out.println(person.hashCode());
    }
}


class Person {
    String name;
    int age;
}

class CopyObject{
    public Person copyPerson(Person p){
        //1. 入参是Person
        //2. 不改变原来的值
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}