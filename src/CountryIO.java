import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CountryIO {

    private static final String FILENAME = "countries.txt";

    public ArrayList<String> getCountries() {
        ArrayList<String> countries = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                countries.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from countries file: " + e.getMessage());
        }

        return countries;
    }

    public boolean saveCountries(ArrayList<String> countries) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (String country : countries) {
                writer.write(country);
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error writing to countries file: " + e.getMessage());
            return false;
        }
    }
}