package day12_practice_tasks;

public class Circle {
    //	Attributes:
    private double radius;

//    public Circle(double radius) {
//        this.radius = radius;
//    }


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if (radius<=0){
            System.err.println("The radius cannot be set to a negative or zero value.");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea(){
        return (radius * radius) * Math.PI;
    }

    public double calcPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius = " + radius +
                " Area = " + Math.round(calcArea()) +
                " Perimeter = " + Math.round(calcPerimeter()) +
                '}';
    }
}
