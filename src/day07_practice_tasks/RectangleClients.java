package day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        Rectangle.width = 10;
        Rectangle.length = 5;
        Rectangle.calculateArea();
        Rectangle.calculatePerimeter();
        System.out.println(rectangle);

        System.out.println("----------------------------");

        Rectangle rectangle1 = new Rectangle();

        Rectangle.width = 5;
        Rectangle.length = 5;
        Rectangle.calculateArea();
        Rectangle.calculatePerimeter();
        System.out.println(rectangle1);

        System.out.println("----------------------------");

        Rectangle rectangle2 = new Rectangle();

        Rectangle.width = 3;
        Rectangle.length = 2;
        Rectangle.calculateArea();
        Rectangle.calculatePerimeter();
        System.out.println(rectangle2);


    }

}
