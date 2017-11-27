package by.itacademy.task3;

import by.itacademy.myArrayOps;

public class task3
{
    public static void main()
    {
        int[] myArray = myArrayOps.random(true);
        for(int myI = 0; myI <= myArray.length / 2; myI++)
        {
            int myTemp = myArray[myI];
            myArray[myI] = myArray[myArray.length - 1 - myI];
            myArray[myArray.length - 1 - myI] = myTemp;
        }
        myArrayOps.print(myArray);
    }
}