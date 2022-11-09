package HomeWork;

public class Access_Symbol {
    public String name;// 全都可以访问
    protected String job; // 同一个包下的可以访问
    String salary ; // 默认访问权限， 同一个类下的可以访问
    private int age; // 只有本类才可以访问
 }
