import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(new Rectangle(new Point<Integer>(12, 13), new Point<Integer>(23, 67)));
        figures.add(new Line(new Point<Integer>(7, 7), new Point<Integer>(23, 23)));
        figures.add(new Circle(new Point<Integer>(0, 0), 23));

        System.out.println("Hello");

        ParserCircle parserCircle = new ParserCircle();
        ParserRectangle parserRectangle = new ParserRectangle();
        ParserLine parserLine = new ParserLine();
        parserCircle.setNext(parserRectangle);
        parserRectangle.setNext(parserLine);
       
        // try {
        //     InputOutputController ioController = new  InputOutputTxt("test.txt");
        //     FiguresCollection figuresCollection = new FiguresCollection(ioController, parserCircle);
        //     figuresCollection.add(figures);
        //     figuresCollection.save();
        
        // } catch (Exception e) {
        //     System.out.println("Ni ma!");
        //     System.exit(-1);
        // }
        
        try {
            InputOutputController ioController = new  InputOutputTxt("test.txt");
            FiguresCollection figuresCollection = new FiguresCollection(ioController, parserCircle);
            figuresCollection.read();
        } catch (Exception e) {
            System.out.println("Ni ma!");
            System.exit(-1);
        }

    }
}