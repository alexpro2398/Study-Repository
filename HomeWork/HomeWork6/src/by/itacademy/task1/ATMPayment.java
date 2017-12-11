package by.itacademy.task1;

public interface ATMPayment
{
    int bill1 = 100;
    int bill2 = 50;
    int bill3 = 20;

    boolean deposit(int money);
    boolean withdraw(int money);

}
