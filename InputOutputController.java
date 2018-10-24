import java.io.IOException;

/**
 * InputOutputController
 */
public interface InputOutputController {
    public String readLine() throws IOException;
    public void writeLine(String line) throws IOException;
    public void clearFile() throws IOException;
    public void close() throws IOException;
}