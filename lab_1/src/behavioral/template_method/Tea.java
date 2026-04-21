package behavioral.template_method;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Brewing tea (infusing a bag)...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon.");
    }
}
