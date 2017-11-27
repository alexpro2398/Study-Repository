package by.itacademy.task1;

public class task1
{
    public static void main()
    {
        String MyJohnny = "Wendy? Darling? Light, of my life. I'm not gonna hurt ya. You didn't let me finish my sentence. I said, I'm not gonna hurt ya. I'm just going to bash your brains in!";
        System.out.println("Text: " + MyJohnny + "\n" + "Length: " + MyJohnny.length());
        String MyJohnnyHalf1 = MyJohnny.substring(0, MyJohnny.length()/2);
        String MyJohnnyHalf2 = MyJohnny.substring(MyJohnny.length()/2);
        System.out.println("First half: " + MyJohnnyHalf1 + "\n" + "Second half: " + MyJohnnyHalf2 + "\n");
    }
}
