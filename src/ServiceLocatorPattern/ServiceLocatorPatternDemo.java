package ServiceLocatorPattern;

public class ServiceLocatorPatternDemo {
    public void test() {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        System.out.println("Done");
    }
}