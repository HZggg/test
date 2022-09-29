public class Dish {
    private String dish_name;
    private double dish_price;

    public Dish() {
    }

    public Dish(String dish_name, double dish_price) {
        this.dish_name = dish_name;
        this.dish_price = dish_price;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public double getDish_price() {
        return dish_price;
    }

    public void setDish_price(double dish_price) {
        this.dish_price = dish_price;
    }
}
