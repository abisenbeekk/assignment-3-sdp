package implementor;


public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.printf("Drawing a VECTOR circle with radius %.2f%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("Drawing a VECTOR square with side %.2f%n", side);
    }
}