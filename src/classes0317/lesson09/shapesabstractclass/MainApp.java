package classes0317.lesson09.shapesabstractclass;

/**
 * Создайте суперкласс Shape и его наследники Circle, Rectangle.
 * Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
 * В цикле нарисовать их (вызвать метод draw).
 */

public class MainApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Red", 3, 4, 10);
        Shape[] shapes = {
                new Circle("Red", 3, 4, 10),
                new Rectangle("Red", 3, 4, 10, 12),
                new Circle("Red", 3, 4, 10),
                new Rectangle("Red", 3, 4, 10, 12)};
        for(Shape item : shapes){
            item.draw();
        }

        Circle circle2 = new Circle("Red", 3, 4, 10);
        Rectangle rect = new Rectangle("Blue", 1,1,1,1);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(rect));

        System.out.println(circle1);
        System.out.println(rect);
    }
}
