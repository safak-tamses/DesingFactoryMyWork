package BusinessDelegatePattern;

public class BusinessDelegatePatternDemo {

    public void test() {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
        System.out.println("Done");
    }
}