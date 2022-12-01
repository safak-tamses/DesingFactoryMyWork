package DecoratorPattern;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoretedShape;

    public ShapeDecorator(Shape decoretedShape) {
        this.decoretedShape = decoretedShape;
    }

    public void draw() {
        decoretedShape.draw();
    }
}
