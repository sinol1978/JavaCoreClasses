package classes0307.lesson09.ShapesAbstractClass;

abstract public class Shape {
    private String color;

    public Shape(){

    }
    public Shape (String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return color.equals(shape.color);

    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }
}
