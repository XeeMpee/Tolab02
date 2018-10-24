/**
 * Line
 */
public class Line implements OneDimension, Writable {
    //# Members:
    private Point<Integer> startPoint;
    private Point<Integer> endPoint;


    //# Constructor:
    public Line(Point<Integer> startPoint, Point<Integer> endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    //# Methods:
    // <Setters and Getters>
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
    // </Setters and Getters>

    // <Override OneDimension>
    @Override
    public double calculateLenght() {
       return Math.sqrt(Math.pow((this.startPoint.getY() - this.endPoint.getY()), 2) + Math.pow((this.startPoint.getX() - this.endPoint.getX()), 2));
    } 
    // </Override OneDimension>

    // <Override Writable>
    @Override
    public String writeFormat() {
        String str = "Line," + this.startPoint.toString()+","+ this.endPoint.toString();
        return str;
    }
    // </Override Writable>
}