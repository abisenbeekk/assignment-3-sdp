import abstraction.Circle;
import abstraction.Shape;
import abstraction.Square;
import implementor.RasterRenderer;
import implementor.Renderer;
import implementor.VectorRenderer;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        System.out.println(" Bridge Pattern Demo \n");

        Shape circle1 = new Circle(vector, 5.0);
        circle1.draw();

        Shape circle2 = new Circle(raster, 5.0);
        circle2.draw();

        Shape square1 = new Square(vector, 3.0);
        square1.draw();

        Shape square2 = new Square(raster, 3.0);
        square2.draw();

        System.out.println("\n Runtime Switching Demo \n");

        Shape dynamicCircle = new Circle(vector, 7.0);
        System.out.print("First, vector: ");
        dynamicCircle.draw();

        dynamicCircle.setRenderer(raster);
        System.out.print("Then, raster:  ");
        dynamicCircle.draw();
    }
}