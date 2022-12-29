import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Account2 account;

        System.out.print("Enter account number: ");
        int number = ent.nextInt();
        System.out.print("Enter account holder: ");
        ent.nextLine();
        String holder = ent.nextLine();
        System.out.print("Is there an initial deposit (s/n)? ");
        char response=ent.next().charAt(0);
        if(response=='y'){
            System.out.print("Enter initial deposit value: ");
            double initialDepoosit=ent.nextDouble();
            account = new Account2(number, holder, initialDepoosit);
        }else{
            account = new Account2(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = ent.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double WithdrawValue = ent.nextDouble();
        account.Withdraw(WithdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);



        ent.close();
    }
}
