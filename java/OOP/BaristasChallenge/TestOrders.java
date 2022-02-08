public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("cappucino", 3.50);
        Item item2 = new Item("high class tea", 6.5);
        Item item3 = new Item("hot coco", 4.5);
        Item item4 = new Item("drip coffee", 1.50);
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Billy");
        Order order4 = new Order("Tommy");
        Order order5 = new Order("Bob");
        order1.addItem(item1);
        order1.addItem(item2);
        order4.addItem(item3);
        order5.addItem(item4);
        System.out.println(order1.getStatusMessage());
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order3.addItem(item1);
        order3.addItem(item2);
        order3.addItem(item3);
        order2.addItem(item4);
        System.out.println(order2.getStatusMessage());
        order3.display();
    }
}
