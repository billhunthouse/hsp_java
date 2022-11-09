package day22_polymorphic;

public class TestWork {
    public static void main(String[] args) {
        Employee bill = new NormalEmployee("bill", 17000);
        System.out.println(bill.getAnnual());


        Employee jack = new Manage("jck",30000,30000);
        System.out.println(jack.getAnnual());

        TestWork testWork = new TestWork();
        testWork.Checkwork(bill);
        testWork.Checkwork(jack);

        String a = "1";
        System.out.println(a.equals(1));
    }


    public void Checkwork(Employee p){
        if(p instanceof NormalEmployee){
            ((NormalEmployee) p).work();
        }else if(p instanceof Manage){
            ((Manage) p).Mange();
        }
    }
}
