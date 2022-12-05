package FrontControllerPattern;

public class FrontControllerPatternDemo {
    public void test() {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
        System.out.println("Done");
    }
}