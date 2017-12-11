package by.itacademy.task3;

public class Rectangle extends Figure
{
    double side1;
    double side2;

    @Override
    public double getArea()
    {
        return (side1 * side2);
    }

    public Rectangle(double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }
}
