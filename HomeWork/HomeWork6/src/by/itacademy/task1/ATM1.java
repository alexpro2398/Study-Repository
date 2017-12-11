package by.itacademy.task1;

public class ATM1 extends ATMtmp implements ATMBalance, ATMManufacturerName, ATMOwnerName
{
    public String getManufacturerName()
    {
        return manufacturerName;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public int balance()
    {
        System.out.println("Balance: " + ((bill1 * bills1) + (bill2 * bills2) + (bill3 * bills3)));
        return((bill1 * bills1) + (bill2 * bills2) + (bill3 * bills3));
    }

    public boolean deposit(int money)
    {
        if(((money % bill1) % bill2) % bill3 == 0)
        {
            bills1 = bills1 + (money / bill1);
            bills2 = bills2 + ((money % bill1) / bill2);
            bills3 = bills3 + (((money % bill1) % bill2) / bill3);
            System.out.println("Successfully deposited " + money);
            return true;
        }
        else
        {
            System.out.println("Failed to deposit " + money);
            return false;
        }
    }

    public boolean withdraw(int money)
    {
        if((((money % bill1) % bill2) % bill3 == 0) && (bill1 * bills1) + (bill2 * bills2) + (bill3 * bills3) >= money)
        {
            bills1 = bills1 - (money / bill1);
            bills2 = bills2 - ((money % bill1) / bill2);
            bills3 = bills3 - (((money % bill1) % bill2) / bill3);
            System.out.println("Successfully withdrawn " + money + " (x" + (money / bill1) + " " + bill1 + " bills, x" + ((money % bill1) / bill2) + " " + bill2 + " bills, x" + (((money % bill1) % bill2) / bill3) + " " + bill3 + " bills)");
            return true;
        }
        else
        {
            System.out.println("Failed to withdraw " + money);
            return false;
        }
    }
}
