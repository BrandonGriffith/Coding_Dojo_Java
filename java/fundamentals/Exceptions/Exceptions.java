import java.util.ArrayList;
import java.util.Random;

class Exceptions {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("14");
        myList.add("hello world");
        myList.add(69);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch(ClassCastException e ) {
                System.out.println(e);
            }
        }
    }
}
