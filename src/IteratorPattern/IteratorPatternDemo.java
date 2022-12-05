package IteratorPattern;

public class IteratorPatternDemo {
    public void test() {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
        System.out.println("Done");
    }
}
