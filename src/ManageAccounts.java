public class ManageAccounts {

    public static void main(String[] args)
    {
       Account account1 = new Account(1000, 1111, "Sally");
       Account account2 = new Account(500, 2222, "Joe");

       account2.deposit(500);
       System.out.println(account2.getBalance());

       account1.withdraw(50);
       System.out.println(account1.getBalance());

       account1.chargeFee();
       account2.chargeFee();

       account2.changeName("Joeseph");

       System.out.println(account1.toString());
       System.out.println(account2.toString());

    }
}
