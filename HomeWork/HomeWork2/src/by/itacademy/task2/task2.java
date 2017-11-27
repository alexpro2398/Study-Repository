package by.itacademy.task2;

public class task2
{
    public static void main()
    {
        float[] myArray = new float[10];
        boolean[] myTrigger = new boolean[myArray.length];

        System.out.print("[");
        for(short myI = 0; myI <= myArray.length - 1; myI++)
        {
            myArray[myI] = (short)(Math.random() * 10);
            System.out.print(myArray[myI]);
            if(myI <= myArray.length - 2)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        for(short myI1 = 0; myI1 <= myArray.length - 2; myI1++)
        {
            short myCounter = 1;
            for (short myI2 = (short)(myI1 + 1); myI2 <= myArray.length - 1; myI2++)
            {
                if (myArray[myI1] == myArray[myI2])
                {
                    myCounter++;
                    myTrigger[myI2] = true;
                }
            }
            if (myCounter > 1 && !myTrigger[myI1])
            {
                System.out.println("Число " + myArray[myI1] + " повторяется " + (myCounter) + " раз(а).");
            }
        }
    }
}