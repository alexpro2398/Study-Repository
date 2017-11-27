package by.itacademy.task1;

import by.itacademy.myArrayOps;

public class task1
{
    public static void main()
    {
        int[] myArray = myArrayOps.random(true);
        double myMin = Double.POSITIVE_INFINITY;
        double myMax = Double.NEGATIVE_INFINITY;
        short myMinIndex = 0;
        short myMaxIndex = 0;
        for(short myI = 0; myI <= myArray.length - 1; myI++)
        {
            if(myArray[myI] > myMax)
            {
                myMax = myArray[myI];
                myMaxIndex = myI;
            }
            if(myArray[myI] < myMin)
            {
                myMin = myArray[myI];
                myMinIndex = myI;
            }
        }
        System.out.println("Min: " + myMin + "\n" + "Max: " + myMax);
        myArray[myMinIndex] = 0;
        myArray[myMaxIndex] = 99;
        myArrayOps.print(myArray);
    }
}