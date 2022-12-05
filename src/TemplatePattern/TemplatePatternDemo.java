package TemplatePattern;

public class TemplatePatternDemo {
    public void test() {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
        System.out.println("Done");
    }
}