package StructuralPattern;

public class GroceryItemAdaptor implements Item {
    private GroceryItem item;

    public GroceryItemAdaptor(GroceryItem item) {
        this.item = item;
    }

    @Override
    public String getItemName() {
        return item.getName();
    }

    @Override
    public String getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return item.getStoreName();
    }
}
