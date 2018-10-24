/**
 * ParserCircle
 */
public class ParserCircle extends Parser {
    
    //# Methods:
    @Override
    public Figure parse(String data) {
        try {
            String [] dataArray = data.split(",");
            if(dataArray[0] == "Circle"){ 
                Point<Integer> centerPoint = new Point<Integer>((Integer)Integer.parseInt(dataArray[1]), (Integer)Integer.parseInt(dataArray[2]));
                double radius = (Double.parseDouble(dataArray[3]));
                return new Circle(centerPoint, radius);
            } else {
                throw new Exception("Wrong circle input!");
            }
        } catch (Exception e) {
            this.next.parse(data);
        }
        return null;
    }
}