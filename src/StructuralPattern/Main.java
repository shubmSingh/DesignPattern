package StructuralPattern;

public class Main {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItems(new FoodItem());
        swiggyStore.addItems(new FoodItem());

        swiggyStore.addItems(new GroceryItemAdaptor(new GroceryProducts()));
    }
}
