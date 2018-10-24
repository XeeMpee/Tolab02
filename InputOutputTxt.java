import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * InputOutputTxt
 */
public class InputOutputTxt implements InputOutputController {
    //# Members:
    private String path;
    private BufferedReader inStream;
    private BufferedWriter outStream;
    //# Construcor:
    public InputOutputTxt(String path) throws FileNotFoundException, IOException {
        this.path = path;
        inStream = new BufferedReader(new FileReader(new File(path)));
        outStream = new BufferedWriter(new FileWriter( new File(path), true));
    }

    //# Methods:
    // <InputOutputController>    
    @Override
    public String readLine() throws IOException {
        String str = this.inStream.readLine(); 
        return str;
    }

    @Override
    public void writeLine(String line) throws IOException{
        this.outStream.write(line);
        this.outStream.newLine();
        this.outStream.flush();
    }

    @Override
    public void clearFile() throws IOException {
        FileWriter fw = new FileWriter(this.path);
        fw.close();
    }

    @Override
    public void close() throws IOException {
        this.inStream.close();
        this.outStream.close();
    }
    // </InputOutputController>    
}