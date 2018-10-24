/**
 * ParseLine
 */
public class ParserLine extends Parser {
    
    //# Methods:
    @Override
    public Figure parse(String data) {
        try {
            String [] dataArray = data.split(",");
            if(dataArray[0] == "Line"){ 
                Point<Integer> startPoint = new Point<Integer>(Integer.parseInt(dataArray[1]), Integer.parseInt(dataArray[2]));
                Point<Integer> endPoint = new Point<Integer>(Integer.parseInt(dataArray[3]), Integer.parseInt(dataArray[4]));
                return new Line(startPoint, endPoint);    
            } else {
                throw new Exception("Wrong line input!");
                
            }
        } catch (Exception e) {
            this.next.parse(data);
        }
        return null;
    }
}   
   