import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int i = 0;
        int sum = 0;
        while( i <= numWeeks ){
            sum += i;
            i++;
        }
    return sum;
    }
    public double getOrderTotal(double[] prices){
        int i = 0;
        int sum = 0;
        while( i < prices.length){
            sum += prices[i];
            i++;
        }
    return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        int i = 0;
        while( i < menuItems.size()){
            System.out.println(i + " " + menuItems.get(i) + "%n");
            i++;
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("enter your name:");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello, " + userName);
        System.out.printf("There are %s people in front of you", customers.size()-1);
    }
}