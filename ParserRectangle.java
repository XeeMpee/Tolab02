/**
 * ParseRectangle
 */
public class ParserRectangle extends Parser {
    
    //# Methods:
    @Override
    public Figure parse(String data) {
        try {
            String [] dataArray = data.split(",");
            if(dataArray[0] == "Rectangle"){ 
                Point<Integer> startPoint = new Point<Integer>(Integer.parseInt(dataArray[1]), Integer.parseInt(dataArray[2]));
                Point<Integer> endPoint = new Point<Integer>(Integer.parseInt(dataArray[3]), Integer.parseInt(dataArray[4]));
                return new Rectangle(startPoint, endPoint);    
            } else {
                throw new Exception("Wrong rectangle input!");
            }
        } catch (Exception e) {
            this.next.parse(data);
        }
        return null;
    }
}   
 