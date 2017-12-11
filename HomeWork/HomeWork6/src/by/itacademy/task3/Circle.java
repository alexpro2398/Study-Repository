package by.itacademy.task3;

public class Circle extends Figure
{
    double radius;

    @Override
    public double getArea()
    {
        return (radius * 2 * Math.PI);
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }
}
