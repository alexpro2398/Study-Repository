package by.itacademy.task2;

import by.itacademy.MyArrayOps;

public class Task2
{
    public static void task2()
    {
        int[] myArrayShort = MyArrayOps.random(10, true);
        int[] myArrayLong = MyArrayOps.random(20, true);
        System.arraycopy(myArrayShort, 0, myArrayLong, ((myArrayLong.length / 2) - (myArrayShort.length / 2)), myArrayShort.length);
        MyArrayOps.print(myArrayLong);
    }
}
