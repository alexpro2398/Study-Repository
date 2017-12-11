import by.itacademy.task1.ATM1;
import by.itacademy.task2.Task2;
import by.itacademy.task3.*;

public class Main
{
    public static void main(String[] args)
    {
        ATM1 myATM1 = new ATM1();
        myATM1.deposit(370);
        myATM1.withdraw(220);
        myATM1.balance();
        myATM1.withdraw(220);
        myATM1.deposit(430);
        myATM1.withdraw(130);
        System.out.println("Manufacturer: " + ATM1.manufacturerName + "\nBank: " + myATM1.getOwnerName() + "\n");
        Task2.task2();

        System.out.print("\n");

        Circle myCircle = new Circle(2);
        System.out.println(myCircle.getArea());

        Square mySquare = new Square(3);
        System.out.println(mySquare.getArea());

        Rectangle myRectangle = new Rectangle(4, 6);
        System.out.println(myRectangle.getArea());

        Triangle myTriangle = new Triangle(7, 9, 11);
        System.out.println(myTriangle.getArea());
    }
}