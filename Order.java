public class Order {
    private boolean order_judge = true;
    private String dish_name = null;
    private int dish_count = 0;
    private double dish_price = 0;

    public Order() {
    }

    public Order(boolean order_judge, String dish_name, int dish_count, float dish_price, float total) {
        this.order_judge = order_judge;
        this.dish_name = dish_name;
        this.dish_count = dish_count;
        this.dish_price = dish_price;

    }

    public boolean isOrder_judge() {
        return order_judge;
    }

    public void setOrder_judge(boolean order_judge) {
        this.order_judge = order_judge;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public int getDish_count() {
        return dish_count;
    }

    public void setDish_count(int dish_count) {
        this.dish_count = dish_count;
    }

    public double getDish_price() {
        return dish_price;
    }

    public void setDish_price(double dish_price) {
        this.dish_price = dish_price;
    }
}


