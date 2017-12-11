package by.itacademy.task3;

public class Square extends Figure
{
    double side;

    @Override
    public double getArea()
    {
        return (side * side);
    }

    public Square(double side)
    {
        this.side = side;
    }
}
