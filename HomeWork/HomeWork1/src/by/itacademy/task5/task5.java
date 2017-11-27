package by.itacademy.task5;

public class task5
{
    public static void main()
    {
        String MyText = "?j#wbe?li#hnuy??glr?weiuf#q?ygbrqhyirg#f?llkhedbl#kgrbl?kebtwlgbsdjbf?hksa#legh?fuw";
        System.out.println(MyText);
        String MyEditedText = MyText.replace("?","HELLO");
        MyText = MyEditedText;
        MyEditedText = MyText.replace("#","");
        System.out.println(MyEditedText);
    }
}
