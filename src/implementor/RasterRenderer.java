package implementor;


public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.printf("Drawing a RASTER circle with radius %.2f (pixels)%n", radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.printf("Drawing a RASTER square with side %.2f (pixels)%n", side);
    }
}
