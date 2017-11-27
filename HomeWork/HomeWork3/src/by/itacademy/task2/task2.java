package by.itacademy.task2;

public class task2
{
    public static int pages(int articles)
    {
        int myPages;
        if(articles % 10 == 0)
        {
            myPages = (articles / 10);
        }
        else
        {
            myPages = (articles / 10) + 1;
        }
        System.out.println(myPages);
        return(myPages);
    }
}
