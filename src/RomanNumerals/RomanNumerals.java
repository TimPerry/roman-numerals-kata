package RomanNumerals;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals implements RomanNumeralGenerator {

    /**
     *  A string builder used to create the numeral
     */
    private StringBuilder numeralBuilder = null;

    /**
     * A map to hold the symbol mappings e.g. 5 = V
     */
    private LinkedHashMap<Integer, String> symbols = null;

    /**
     * Initialise and instances the properties
     */
    public RomanNumerals() {

        this.numeralBuilder = new StringBuilder();
        this.symbols = new LinkedHashMap<Integer, String>();

        this.addSymbolMappings();

    }

    /**
     *
     * For a given decimal number returns the numeral equivalent
     *
     * @param number
     * @return String
     */
    public String generate(int number) {

        if(number < 1) {
            throw new RuntimeException("Please supply a real number greater than zero");
        }

        this.clearBuilder();
        this.appendToNumeral(number);

        return this.numeralBuilder.toString();

    }

    /**
     * Used to add a key value mapping for a decimal number and its corresponding numeral
     */
    private void addSymbolMappings() {

        this.symbols.put(1000, "M");
        this.symbols.put(900, "CM");
        this.symbols.put(500, "D");
        this.symbols.put(400, "CD");
        this.symbols.put(100, "C");
        this.symbols.put(90, "XC");
        this.symbols.put(50, "L");
        this.symbols.put(40, "XL");
        this.symbols.put(10, "X");
        this.symbols.put(9, "IX");
        this.symbols.put(5, "V");
        this.symbols.put(4, "IV");
        this.symbols.put(1, "I");

    }

    /**
     * Simple facade method to clear the numeral builders contents
     */
    private void clearBuilder() {
        this.numeralBuilder.setLength(0);
    }

    /**
     *
     * For a given number it recursively appends the corresponding
     * numeral to the numeral builder
     *
     * @param number
     */
    private void appendToNumeral(int number) {

        if (number > 0) {

            for (Map.Entry<Integer, String> symbol : this.symbols.entrySet()) {

                Integer decimal = symbol.getKey();
                String numeral = symbol.getValue();

                if (number >= decimal) {

                    number -= decimal;
                    this.numeralBuilder.append(numeral);

                    break;

                }

            }

            this.appendToNumeral(number);

        }

    }

}
