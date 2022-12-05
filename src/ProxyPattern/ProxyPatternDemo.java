package ProxyPattern;

public class ProxyPatternDemo {
    public void test() {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        System.out.println(" ");
        image.display();
        System.out.println("Done");
    }
}
