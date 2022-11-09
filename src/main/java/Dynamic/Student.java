package Dynamic;

public class Student extends Person {
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    public void getScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String say() {
        return super.say() + this.score;

    }
}
