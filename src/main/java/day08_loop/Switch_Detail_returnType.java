package day08_loop;

/*
1.switch 表达式类型是否可以为boolean : 不可以
2.表达式的返回值只能是byte short int char enum , string
 */
public class Switch_Detail_returnType {
    public static void main(String[] args) {
        String b1 = "hi";
        boolean b2 = true;
        switch (b1) {
            case "hi":
                System.out.println("welcome");
                break;
            case "fuck":
                System.out.println("滚");
                break;
            default:
                System.out.println("whatever");
        }
    }
}
