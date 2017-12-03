import by.itacademy.task2.ATM;

public class Main
{
    public static void main(String[] args)
    {
        ATM myATM = new ATM();
        myATM.deposit(370);
        myATM.withdraw(220);
        myATM.balance();
        myATM.withdraw(220);
        myATM.deposit(430);
        myATM.withdraw(130);
    }
}