package example6;

public class CountryValue {

    private String country;
    private double value;

    public CountryValue(String line) {
        int i = 0; // Locate the start of the first digit
        while (!Character.isDigit(line.charAt(i))) {
            i++;
        }

        int j = i - 1; // Locate the end of the preceding word
        while (Character.isWhitespace(line.charAt(j))) {
            j--;
        }
        // Extract the country name
        country = line.substring(0, j + 1);
        // Extract the value
        value = Double.parseDouble(line.substring(i).trim());
    }

    public String getCountry() {
        return country;
    }

    public double getValue() {
        return value;
    }
}
