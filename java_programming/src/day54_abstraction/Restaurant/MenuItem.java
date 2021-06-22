package day54_abstraction.Restaurant;

public abstract class MenuItem {
    public abstract void prepare();

    public abstract void serve();

}

class Pizza extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("prep dough , put sauce ,put mozzarella, put basil");
    }

    @Override
    public void serve() {
        System.out.println("serve margarita pizza ");
    }
}

class RestaurantApp {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.serve();
    }
}