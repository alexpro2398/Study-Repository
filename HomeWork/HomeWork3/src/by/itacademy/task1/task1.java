package by.itacademy.task1;

import by.itacademy.MyArrayOps;

import java.util.Arrays;

public class task1
{
    public static void main()
    {
        int[] myArray = MyArrayOps.enter();
        MyArrayOps.print(myArray);

        int[] myArrayCopy = MyArrayOps.bubbleSort(myArray);
        MyArrayOps.print(myArrayCopy);

        myArrayCopy = MyArrayOps.selectionSort(myArray);
        MyArrayOps.print(myArrayCopy);

        myArrayCopy = MyArrayOps.nativeSort(myArray);
        MyArrayOps.print(myArrayCopy);

        boolean myPrint = false;
        for(int myI = 0; myI < myArray.length; myI++)
        {
            if (myPrint)
            {
                System.out.print(" | ");
            }
            myPrint = false;
            if (Math.abs(myArray[myI]) % 2 == 0)
            {
                System.out.print(myArray[myI]);
                myPrint = true;
            }
        }


    }
}
