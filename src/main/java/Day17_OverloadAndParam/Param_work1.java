package Day17_OverloadAndParam;

public class Param_work1 {
    public static void main(String[] args) {
        ParamWork p = new ParamWork();
        System.out.println(p.totalGrade("小明", 20, 30, 35.2, 33));
        System.out.println(p.totalGrade("王雷", 88, 138, 88.5, 69,33));
    }

}

class ParamWork {
    public String totalGrade(String name, double... score) {
        double totalscore = 0;
        for (int i = 0; i < score.length; i++) {
            totalscore += score[i];
        }
        return name + "的总成绩是："+ totalscore;
    }
}
