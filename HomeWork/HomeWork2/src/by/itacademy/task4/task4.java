package by.itacademy.task4;

public class task4
{
    public static void main()
    {
        int myNumber = (int) (Math.random() * 1000);
        System.out.println(myNumber);
        boolean myIsProgressive = true;
        for(int myI = 0; myI < String.valueOf(myNumber).length() - 1; myI++)
        {
            if(Integer.valueOf(String.valueOf(myNumber).substring(myI, myI +1)) >= Integer.valueOf(String.valueOf(myNumber).substring(myI + 1, myI +2)))
            {
                myIsProgressive = false;
            }
        }
        System.out.println(myIsProgressive);

    }
}
