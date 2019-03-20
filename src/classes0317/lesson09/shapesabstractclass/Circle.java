package classes0317.lesson09.shapesabstractclass;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (pointX != circle.pointX) return false;
        if (pointY != circle.pointY) return false;
        return radius == circle.radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                ", radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + pointX;
        result = 31 * result + pointY;
        result = 31 * result + radius;
        return result;
    }
}
