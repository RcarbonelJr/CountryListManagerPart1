import java.util.ArrayList;

public class Menu {

    // Instance Variables
    private ArrayList<MenuItem> items;

    // Constructor
    public Menu() {
        items = new ArrayList<>();
    }

    // Setter
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // Display the menu
    public void display() {
        System.out.println("--------------------");
        System.out.println("Country List Manager");
        System.out.println("--------------------");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + " - " + items.get(i).getDescription());
        }
    }

    // Get a menu item
    public MenuItem getItem(int choice) {
        if (choice > 0 && choice <= items.size()) {
            return items.get(choice - 1);
        } else {
            return null;
        }
    }

    // Get the size of the menu
    public int getSize() {
        return items.size();
    }
}
