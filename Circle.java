/**
 * Circle
 */
public class Circle implements TwoDimension, Writable {
    //# Members:
    private Point<Integer> startPoint;
    private double radius;

    //# Constructor:
    public Circle(Point<Integer> startPoint, double radius) {
        this.startPoint = startPoint;
        this.radius = radius;
    }
    
    //# Methods:
    // <Getters and setters>
    public Point<Integer> getStartPoint() {
        return this.startPoint;
    }

    public void setStartPoint(Point<Integer> startPoint) {
        this.startPoint = startPoint;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // </Getters and setters>

    // <TwoDimensionInterface>
    @Override
    public double calculateCircumference() {
        return 2*3.141592*this.radius;
    }

    @Override
    public double calculateField() {
        return (3.141592)*this.radius*this.radius;
    }
    // </TwoDimensionInterface>

    // <Writable Override>
    @Override
    public String writeFormat() {
        String format = "Circle,"+this.startPoint.toString()+","+this.radius;
        return format;
    }
    // </Writable Override>
    
}