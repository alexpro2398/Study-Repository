public class Main
{
    public static void main(String[] args)
    {
        //Задание 1
        String MyJohnny = "Wendy? Darling? Light, of my life. I'm not gonna hurt ya. You didn't let me finish my sentence. I said, I'm not gonna hurt ya. I'm just going to bash your brains in!";
        System.out.println("Text: " + MyJohnny + "\n" + "Length: " + MyJohnny.length());
        String MyJohnnyHalf1 = MyJohnny.substring(0, MyJohnny.length()/2);
        String MyJohnnyHalf2 = MyJohnny.substring(MyJohnny.length()/2);
        System.out.println("First half: " + MyJohnnyHalf1 + "\n" + "Second half: " + MyJohnnyHalf2 + "\n");


        //Задание 2
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


        //Задание 3
        int MyHeight = (int)(Math.random()*1000);
        int MyWidh = (int)(Math.random()*1000);
        int MyRadius = (int)(Math.random()*1000);
        System.out.println("Height = " + MyHeight + "\n" + "Width = " + MyWidh + "\n" + "Radius = " + MyRadius);
        if(Math.pow(Math.pow(MyWidh, 2) + Math.pow(MyHeight, 2), 0.5) <= MyRadius * 2)
        {
            System.out.println("True" + "\n");
        }
        else
        {
            System.out.println("False" + "\n");
        }


        //Задание 4
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


        //Задание 5
        String MyText = "?j#wbe?li#hnuy??glr?weiuf#q?ygbrqhyirg#f?llkhedbl#kgrbl?kebtwlgbsdjbf?hksa#legh?fuw";
        System.out.println(MyText);
        String MyEditedText = MyText.replace("?","HELLO");
        MyText = MyEditedText;
        MyEditedText = MyText.replace("#","");
        System.out.println(MyEditedText);






    }
}
