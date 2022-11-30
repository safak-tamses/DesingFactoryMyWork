package SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
        SingleObject object1 = SingleObject.getInstance();
        object1.addLog("bu bir log kaydıdır");
        object1.logCounter();

        object.showLog();
        object1.showLog();

        object.addLog("bu ikinci bir log kaydıdır");
        object.logCounter();

        object1.showLog();
        object.showLog();
    }
}
