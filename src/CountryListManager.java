/* Author: Randall Carbonel
 * Date: 7/11/24
 * Class: ASD216 - Java Programming
 * Assignment: Update the Country List Manager so it stores the country list in a text file.
 * Specifications:
 *      - Create a class named CountryIO that contains these methods:
 *          - public ArrayList<String> getCountries()
 *          - public boolean saveCountries(ArrayList<String> countries)
 *      - Store the list of countries in a text file named countries.txt in the same directory as the CountriesIO class.
 *        If the countries.txt file doesn’t exist, the CountriesIO class should create it. This class should use
 *        buffered I/O streams, and it should close all I/O streams when they’re no longer needed.
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
