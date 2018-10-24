/**
 * Parser
 */
public abstract class Parser {
    //# Members:
    Parser next;

    //# Methods:
    /**
     * @param next the next to set
     */
    public void setNext(Parser next) {
        this.next = next;
    }

    public abstract Figure parse(String data);
    
}