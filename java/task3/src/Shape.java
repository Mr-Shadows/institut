abstract class Shape
{
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled)
    {
       this.color = color;
       this.filled = filled;
    }

    public Shape() {}

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {

    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {

    }

    public double getArea()
    {
        return 0;
    }

    public double getPerimeter()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return color;
    }
}

class Circle extends Shape
{
    protected double radius;
    public Circle() {}

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {

    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {

    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return "Circle with radius: " + radius;
    }
}

class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {

    }

    public double getWidth()
    {
        return width;
    }

    public void getWidth(double width)
    {

    }
    public double setLength()
    {
        return length;
    }

    public void getLength()
    {

    }

    @Override
    public double getArea()
    {
        return length * width;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (length * width);
    }

    @Override
    public String toString()
    {
        return "Rectangle with length: " + length + " and width: " + width;
    }
}

class Square extends Rectangle
{
    protected double side;

    public Square() {}

    public Square (double side)
    {
        this.side = side;
    }

    public Square(double side, String collor, boolean filled)
    {

    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {

    }

    public void setWidth(double side)
    {

    }

    public void setLength(double side)
    {

    }

    @Override
    public String toString()
    {
        return null;
    }
}