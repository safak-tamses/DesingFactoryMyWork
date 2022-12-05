package VisitorPattern;

public class VisitorPatternDemo {
    public void test() {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        System.out.println("Done");
    }
}