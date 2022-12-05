package CompositeEntityPattern;

public class CompositeEntityPatternDemo {
    public void test(){

        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
        System.out.println("Done");
    }
}