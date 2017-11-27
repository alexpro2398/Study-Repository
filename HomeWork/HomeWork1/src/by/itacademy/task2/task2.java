package by.itacademy.task2;

public class task2
{
    public static void main()
    {
        String MyNum = Integer.toString((int)(Math.random()*2000 - 1000));
        System.out.println(MyNum);
        if(MyNum.substring(MyNum.length()-1).equals("7"))
        {
            System.out.println("True" + "\n");
        }
        else
        {
            System.out.println("False" + '\n');
        }
    }
}
