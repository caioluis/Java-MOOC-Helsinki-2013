
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account account = new Account("Conta da Rebeca: ", 100.00);
        account.deposit(20);
        
        System.out.println(account.toString());
    }

}
