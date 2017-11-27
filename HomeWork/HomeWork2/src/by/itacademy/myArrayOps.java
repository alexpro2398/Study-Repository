package by.itacademy;

public class myArrayOps
{
    public static int[] random(boolean print)
    {
        int[] myArrTemp = new int[10];
        if(print)
        {
            System.out.print("[");
        }
        for(int myI = 0; myI <= myArrTemp.length - 1; myI++)
        {
            myArrTemp[myI] = (int)(Math.random() * 200 - 100);
            if(print)
            {
                System.out.print(myArrTemp[myI]);
                if(myI <= myArrTemp.length - 2){
                    System.out.print(", ");
                }
            }
        }
        if(print)
        {
            System.out.println("]");
        }
        return(myArrTemp);
    }

    public static void print(int[] myArrayPrint)
    {
        System.out.print("[");
        for(int myI = 0; myI <= myArrayPrint.length - 1; myI++)
        {
            System.out.print(myArrayPrint[myI]);
            if(myI <= myArrayPrint.length - 2)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
