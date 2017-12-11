package by.itacademy.task3;

public class Triangle extends Figure
{
    double side1;
    double side2;
    double side3;

    @Override
    public double getArea()
    {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}
