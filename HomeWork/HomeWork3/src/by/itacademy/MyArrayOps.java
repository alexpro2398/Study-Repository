package by.itacademy;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrayOps
{
    public static void print(int[] myArrayPrint)
    {
        for(int myI = 0; myI <= myArrayPrint.length - 1; myI++)
        {
            System.out.print(myArrayPrint[myI]);
            if(myI <= myArrayPrint.length - 2)
            {
                System.out.print(" | ");
            }
        }
        System.out.println("");
    }
    public static int[] enter()
    {
        int[] myArrayEnter = new int[10];
        Scanner myScanner = new Scanner(System.in);
        for(int myI = 0; myI < myArrayEnter.length; myI++)
        {
            myArrayEnter[myI] = myScanner.nextInt();
        }
        return(myArrayEnter);
    }

    public static int[] nativeSort(int[] mySort)
    {
        Arrays.sort(mySort);
        return(mySort);
    }

    public static int[] selectionSort(int[] mySort)
    {
        for(int myI1 = 0; myI1 < mySort.length - 1; myI1++)
        {
            for (int myI = 0; myI < mySort.length - 1; myI++)
            {
                if (mySort[myI] > mySort[myI + 1])
                {
                    int myTemp = mySort[myI];
                    mySort[myI] = mySort[myI + 1];
                    mySort[myI + 1] = myTemp;
                }
            }
        }
        return(mySort);
    }

    public static int[] BubbleSort(int[] mySort)
    {
        for(int myI1 = 0; myI1 < mySort.length; myI1++)
        {
            int myMin = (int) Double.POSITIVE_INFINITY;
            int myMinIndex = 0;
            for (int myI = myI1; myI <= mySort.length - 1; myI++)
            {
                if (mySort[myI] < myMin)
                {
                    myMin = mySort[myI];
                    myMinIndex = myI;
                }
            }
            mySort[myMinIndex] = mySort[myI1];
            mySort[myI1] = myMin;
        }
        return(mySort);
    }
}
