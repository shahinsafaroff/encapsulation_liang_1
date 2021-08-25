public class Circle {
    private double radius = 1; //ENCAPSULATE radius
    private static int numberOfObjects = 0; //ENCAPSULATE number of objects

    public Circle(){
        numberOfObjects++;
    }

    public Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;

    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
