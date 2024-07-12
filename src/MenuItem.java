public class MenuItem {

    // Instance Variables
    private final int id;
    private final String  description;

    // Constructor
    public MenuItem(int id, String description) {
        this.id = id;
        this.description = description;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
