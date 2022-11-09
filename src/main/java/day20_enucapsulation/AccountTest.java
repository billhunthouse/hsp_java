package day20_enucapsulation;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account("张三",19,"aaabbb");
        System.out.println(account.getBalance());
        System.out.println(account.getName());
        System.out.println(account.getBalance());
    }
}


class Account {
    public String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    // 1.设置get 和set 方法
    // 2.在set设置业务逻辑，name = 2.3,4   余额大于20； 密码是6位，否则报错
    // 3.在构造器中调用set方法判断业务

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            System.out.println("名称长度不合法");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("存款太少了");
        }
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;

        } else {
            System.out.println("密码长度不合法");
        }
    }
}