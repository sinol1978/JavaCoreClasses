package classes0307.lesson09.ShapesAbstractClass;

public class Circle extends Shape {
    private int pointX, pointY;
    private int radius;

    public Circle() {

    }

    public Circle(String color, int pointX, int pointY, int radius) {
        super(color);
        this.pointX = pointX;
        this.pointY = pointY;
        this.radius = radius;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle " + getPointX() + "; " + getPointY() + "\tRadius: " + getRadius() + " \tColor: " + getColor());
    }
}
