import java.util.ArrayList;
import java.util.Collections;

public class Countries {

    // Instance Variables
    private final ArrayList<String> countries;
    private final CountryIO countryIO;

    // Constructor
    public Countries() {
        countryIO = new CountryIO();
        countries = countryIO.getCountries();
    }

    // Setter
    public void addCountry(String country) {
        countries.add(country);
        Collections.sort(countries);
        System.out.println(country + " has been saved.");
        countryIO.saveCountries(countries);
    }

    public void displayCountries() {
        if (countries.isEmpty()) {
            System.out.println("No countries in the list.");
        } else {
            for (int i = 0; i < countries.size(); i++) {
                System.out.println(countries.get(i));
            }
        }
    }

    public void menuAction(int id) {
        switch (id) {
            case 1:
                displayCountries();
                break;
            case 2:
                String input = Console.getString("Enter Country: ");
                addCountry(input);
                break;
            case 3:
                System.out.println("Goodbye.");
                break;
            default:
                System.out.println("Invalid entry. Please try again.");
        }
    }
}
