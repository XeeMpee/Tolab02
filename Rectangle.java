/**
 * Rectangle
 */
public class Rectangle implements TwoDimension, Writable {
    //# Members:
    Point<Integer> startPoint;
    Point<Integer> endPoint;

    //# Constructors:
    public Rectangle(Point<Integer> startPoint, Point<Integer> endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    
    //# Methods:
    // <Getters and Setters>
     public Point<Integer> getStartPoint() {
        return this.startPoint;
    }

    public void setStartPoint(Point<Integer> startPoint) {
        this.startPoint = startPoint;
    }

    public Point<Integer> getEndPoint() {
        return this.endPoint;
    }

    public void setEndPoint(Point<Integer> endPoint) {
        this.endPoint = endPoint;
    }
    // </Getters and Setters>

    //<Override TwoDimension>
    @Override
    public double calculateCircumference() {
        double len1 =  this.startPoint.getY() - this.endPoint.getY();
        double len2 = this.startPoint.getX() - this.endPoint.getX();
        return 2*len1 + 2*len2;
    }

    @Override
    public double calculateField() {
        double len1 =  this.startPoint.getY() - this.endPoint.getY();
        double len2 = this.startPoint.getX() - this.endPoint.getX();
        return len1*len2;
    }
    //</Override TwoDimension>

    //<Override Writable>
    @Override
    public String writeFormat() {
        String str = "Rectangle," + this.startPoint.toString()+","+this.endPoint.toString();
        return str;
    }
    //</Override Writable>

}
