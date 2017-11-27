package by.itacademy.task4;

public class task4
{
    public static void main()
    {
        String MyRoubles = Integer.toString((int)(Math.random()*1000));
        if(Integer.valueOf(MyRoubles.substring((MyRoubles.length()-2), (MyRoubles.length()-1))).equals(1))
        {
            System.out.println(MyRoubles + " рублей" + "\n");
        }
        else
        {
            switch(Integer.valueOf(MyRoubles.substring(MyRoubles.length()-1)))
            {
                case 9:
                case 8:
                case 7:
                case 6:
                case 0:
                case 5:
                    System.out.println(MyRoubles + " рублей" + "\n");
                    break;
                case 4:
                case 3:
                case 2:
                    System.out.println(MyRoubles + " рубля" + "\n");
                    break;
                case 1:
                    System.out.println(MyRoubles + " рубль" + "\n");
                    break;
            }
        }
    }
}
