package behavioral.template_method;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Passing boiling water through ground coffee...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }
}
