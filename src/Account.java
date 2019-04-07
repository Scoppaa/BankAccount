public class Account {

    private double balance;
    private int accNum;
    private String name;

    public Account(double initiateBalance, int initiateAccNum, String initiateName)
    {
        balance = initiateBalance;
        accNum = initiateAccNum;
        name = initiateName;
    }

    public double withdraw(double amount)
    {
        balance = balance - amount;
        return balance;
    }

    public double deposit(double amount)
    {
        balance = balance + amount;
        return balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public double chargeFee()
    {
        balance = balance - 10;
        return balance;
    }

    public String changeName(String newName)
    {
        name = newName;
        return name;
    }

    public String toString()
    {
        return "Name: " + name  + "\n" + " Account Number: " + accNum + "\n" + " Balance: " + balance;
    }
}
