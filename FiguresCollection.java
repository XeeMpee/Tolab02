import java.io.IOException;
import java.util.ArrayList;

/**
 * FiguresCollection
 */
public class FiguresCollection {
    
    //# Members:
    private ArrayList<Figure> figures;
    private InputOutputController ioController;
    private Parser parser;

    //# Constructor:
    public FiguresCollection(InputOutputController ioController, Parser parser) {
        this.figures = new ArrayList<Figure>();
        this.ioController = ioController;
        this.parser = parser;
    }

    //# Methods:
    // <Collection methods>
    public void add(Figure figure) {
        this.figures.add(figure);
    }

    public void add(ArrayList<Figure> figures) {
        this.figures.addAll(figures);
    }

    public void remove(int index) {
        this.figures.remove(index);
    }

    public void remove(Figure figure) {
        this.figures.remove(figure);
    }

    public void clear() {
        this.figures.clear();
    }

    public void save() throws IOException, Exception {
        this.ioController.clearFile();
        for(Figure f : this.figures) {
            if(f instanceof Writable) {
                ioController.writeLine(((Writable)(f)).writeFormat());
            } else {
                throw new Exception("Object in figures collection doesnt implement Writable interface ");
            }
        }
    }

    public void read() {
        try {
            this.clear();
            String data;
            do {
                data = this.ioController.readLine();
                Figure figure = this.parser.parse(data);
                System.out.println(figure.toString());
                this.add(figure);
            } while (data != null);
        } catch (Exception e) {
            System.out.println("Error: FiguresCollection.read(): " + e.toString());
            System.exit(-1);
        }
       
    }
    // </Collection methods>

    
}