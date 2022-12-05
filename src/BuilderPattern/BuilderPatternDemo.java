package BuilderPattern;

public class BuilderPatternDemo {
    public void test() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non veg");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
        System.out.println("Done");

    }
}
