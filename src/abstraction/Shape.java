package abstraction;

import implementor.Renderer;


public abstract class Shape {

    protected Renderer renderer;   // ← көпір осы жерде

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }
}
