/* Author: Randall Carbonel
 * Date: 7/11/24
 * Class: ASD216 - Java Programming
 * Assignment: Project 8-4: Country List Manager
 * Specifications:
 *      - Store the country names in an array list.
 *      - Sort the country names so that they’re displayed in alphabetical order.
 *      - Use the Console class presented in chapter 7 or an enhanced version of it to get and validate the user’s
 *        entries.
 */

public class CountryListManager {
    public static void main(String[] args) {

        // Create the Menu object
        Menu menu = new Menu();

        // Create the Countries object
        Countries countries = new Countries();

        // Build the menu
        menu.addItem(new MenuItem(1, "List Countries"));
        menu.addItem(new MenuItem(2, "Add a Country"));
        menu.addItem(new MenuItem(3, "Exit"));

        // Display the menu
        menu.display();

        // While loop to run the program until the user exits
        while (true) {
            int choice = Console.getInt("Enter menu number: ", 0, menu.getSize() + 1);
            MenuItem selectedItem = menu.getItem(choice);
            countries.menuAction(selectedItem.getId());
            if (selectedItem.getId() == 3) {
                break;
            }
        }
    }
}
