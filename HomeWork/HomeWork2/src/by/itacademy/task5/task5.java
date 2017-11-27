package by.itacademy.task5;
import by.itacademy.myArrayOps;

public class task5
{
    public static void main()
    {
        int[] myArray = myArrayOps.random(true);
        for(int myI1 = 0; myI1 < myArray.length - 1; myI1++)
        {
            for (int myI = 0; myI < myArray.length - 1; myI++) {
                if (myArray[myI] > myArray[myI + 1]) {
                    int myTemp = myArray[myI];
                    myArray[myI] = myArray[myI + 1];
                    myArray[myI + 1] = myTemp;
                }
            }
        }
        myArrayOps.print(myArray);
    }
}
