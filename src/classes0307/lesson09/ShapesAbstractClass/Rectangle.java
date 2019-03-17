package classes0307.lesson09.ShapesAbstractClass;

public class Rectangle extends Shape {
    private int pointX1;
    private int pointX2;
    private int pointY1;
    private int pointY2;

    public Rectangle() {
    }

    public Rectangle(String color, int pointX1, int pointX2, int pointY1, int pointY2) {
        super(color);
        this.pointX1 = pointX1;
        this.pointX2 = pointX2;
        this.pointY1 = pointY1;
        this.pointY2 = pointY2;
    }

    public int getPointX1() {
        return pointX1;
    }

    public void setPointX1(int pointX1) {
        this.pointX1 = pointX1;
    }

    public int getPointX2() {
        return pointX2;
    }

    public void setPointX2(int pointX2) {
        this.pointX2 = pointX2;
    }

    public int getPointY1() {
        return pointY1;
    }

    public void setPointY1(int pointY1) {
        this.pointY1 = pointY1;
    }

    public int getPointY2() {
        return pointY2;
    }

    public void setPointY2(int pointY2) {
        this.pointY2 = pointY2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle " + getPointX1() + "; " + getPointY1() + getPointX1() + getPointY2() + " \tColor: " + getColor());
    }
}
