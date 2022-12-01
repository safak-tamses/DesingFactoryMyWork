package DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {
    @Override
    public void draw() {
        decoretedShape.draw();
        setRedBorder(decoretedShape);
    }

    public RedShapeDecorator(Shape decoretedShape) {
        super(decoretedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
