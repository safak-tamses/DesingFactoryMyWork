package InterceptingFilterPattern;

public class InterceptingFilterDemo {
    public void test() {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
        System.out.println("Done");
    }
}