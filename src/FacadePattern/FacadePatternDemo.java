package FacadePattern;

public class FacadePatternDemo {
    public void test() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        System.out.println("Done");
    }
}
