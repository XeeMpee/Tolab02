/**
 * Point
 */
public class Point <T extends Number> {
    
    //# Members:
    private T x;
    private T y;

    //# Constructors:
    public Point() {
        this.x = null;
        this.y = null;
    }

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }
    
    //# Getters:
    public T getX() {
        return this.x;
    }

    public T getY() {
        return this.y;
    }

    //# Setters:
    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    //# Other methods:
    public String toString() {
        //String str = "("+ this.x +","+ this.y + ")";
        String str = this.x +","+ this.y;
        return str;
    }

    
}