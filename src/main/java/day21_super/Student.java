package day21_super;

public class Student extends Person{

  private int id;
  private int score;


    public Student(String name,int age){
        super(name,age);
    }

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return super.say() + "我是子类的say方法" + "子类的姓名是" + this.getName() + "子类的年龄是" +
                this.getAge() +"子类的学号是" + this.id + "子类的成绩是" + this.score;
    }
}
