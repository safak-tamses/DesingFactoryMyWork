package MediatorPattern;

public class MediatorPatternDemo {
    public void test() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
        System.out.println("Done");
    }
}
