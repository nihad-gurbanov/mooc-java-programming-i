
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account userMatt = new Account("Matthews account", 1000);
        Account userMe = new Account("My account", 0);
        userMatt.withdrawal(100);
        userMe.deposit(100);
        System.out.println(userMatt);
        System.out.println(userMe);
    }
}
