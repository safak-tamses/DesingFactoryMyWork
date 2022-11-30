package SingletonPattern;

public class SingleObject {
    private String[] log;
    int logIndex = 0;
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
        this.log = new String[100];
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

    public void addLog(String text) {
        this.log[logIndex] = text;
        logIndex++;
    }

    public void logCounter() {
        System.out.println(logIndex);
    }

    public void showLog() {
        for (int i = 0; i < this.log.length; i++) {
            if (log[i] != null) {
                System.out.println(this.log[i]);
            }

        }
    }

}
