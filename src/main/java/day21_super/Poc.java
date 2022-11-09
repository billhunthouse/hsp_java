package day21_super;

public class Poc {
    public static void main(String[] args) {
        Student student = new Student("bill",24);
        System.out.println(student.say());
        Student student2 = new Student("jack",31,23,607);
        System.out.println(student2.say());

    }
}
