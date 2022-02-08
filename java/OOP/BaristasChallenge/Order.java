import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        this.name = "guest";
        this.ready = false;
    }
    public Order(String name) {
        this.name = name;
        this.ready = false;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    public String getStatusMessage() {
        if (this.ready == true) {
            return "Order Up!";
        }
        return "Not Ready";
    }
    public double getOrderTotal() {
        double total = 0;
        for (Item x : this.items) {
            total += x.getPrice();
        }
        return total;
    }
    public void display() {
        System.out.println("------------------Order--------------------------");
        System.out.printf("Name: %s \n", this.name);
        for (Item x : this.items) {
            System.out.println(x.getName() + "  $" + x.getPrice());
        }
        System.out.println("Your order total: $" + this.getOrderTotal());
        System.out.println("------------------End----------------------------");
    }
}
