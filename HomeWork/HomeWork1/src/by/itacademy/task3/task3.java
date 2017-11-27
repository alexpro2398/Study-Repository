package by.itacademy.task3;

public class task3
{
    public static void main()
    {
        int MyHeight = (int)(Math.random()*1000);
        int MyWidh = (int)(Math.random()*1000);
        int MyRadius = (int)(Math.random()*1000);
        System.out.println("Height = " + MyHeight + "\n" + "Width = " + MyWidh + "\n" + "Radius = " + MyRadius);
        if(Math.pow(Math.pow(MyWidh, 2) + Math.pow(MyHeight, 2), 0.5) <= MyRadius * 2)
        {
            System.out.println("True" + "\n");
        }
        else
        {
            System.out.println("False" + "\n");
        }
    }
}
