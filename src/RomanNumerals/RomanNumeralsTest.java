package RomanNumerals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RomanNumeralsTest {

    /**
     * The roman numeral generator instance
     */
    private RomanNumerals generator;

    /**
     * Holds the decimal that is currently being tested
     */
    @Parameterized.Parameter
    public int decimal = 0;

    /**
     * Holds the expected numeral
     */
    @Parameterized.Parameter(value = 1)
    public String expectedResult = null;

    /**
     * Holds the expected exception
     */
    @Parameterized.Parameter(value = 2)
    public Class<Exception> expectedExceptionClass = null;

    /**
     * Rule for the expected exception
     */
    @Rule
    public ExpectedException exception = ExpectedException.none();

    /**
     * Used to setup before the test, instantiates the generator object
     */
    @Before
    public void setUp() {
        this.generator = new RomanNumerals();
    }

    /**
     * Creates a collection of parameters to be used in the tests
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

                {-123, "", RuntimeException.class},
                {-1, "", RuntimeException.class},
                {0, "", RuntimeException.class},
                {1, "I", null},
                {2, "II", null},
                {3, "III", null},
                {4, "IV", null},
                {5, "V", null},
                {6, "VI", null},
                {7, "VII", null},
                {8, "VIII", null},
                {9, "IX", null},
                {10, "X", null},
                {11, "XI", null},
                {12, "XII", null},
                {13, "XIII", null},
                {14, "XIV", null},
                {15, "XV", null},
                {16, "XVI", null},
                {17, "XVII", null},
                {18, "XVIII", null},
                {19, "XIX", null},
                {20, "XX", null},
                {21, "XXI", null},
                {22, "XXII", null},
                {23, "XXIII", null},
                {24, "XXIV", null},
                {25, "XXV", null},
                {26, "XXVI", null},
                {27, "XXVII", null},
                {28, "XXVIII", null},
                {29, "XXIX", null},
                {30, "XXX", null},
                {31, "XXXI", null},
                {32, "XXXII", null},
                {33, "XXXIII", null},
                {34, "XXXIV", null},
                {35, "XXXV", null},
                {36, "XXXVI", null},
                {37, "XXXVII", null},
                {38, "XXXVIII", null},
                {39, "XXXIX", null},
                {40, "XL", null},
                {41, "XLI", null},
                {42, "XLII", null},
                {43, "XLIII", null},
                {44, "XLIV", null},
                {45, "XLV", null},
                {46, "XLVI", null},
                {47, "XLVII", null},
                {48, "XLVIII", null},
                {49, "XLIX", null},
                {50, "L", null},
                {51, "LI", null},
                {52, "LII", null},
                {53, "LIII", null},
                {54, "LIV", null},
                {55, "LV", null},
                {56, "LVI", null},
                {57, "LVII", null},
                {58, "LVIII", null},
                {59, "LIX", null},
                {60, "LX", null},
                {61, "LXI", null},
                {62, "LXII", null},
                {63, "LXIII", null},
                {64, "LXIV", null},
                {65, "LXV", null},
                {66, "LXVI", null},
                {67, "LXVII", null},
                {68, "LXVIII", null},
                {69, "LXIX", null},
                {70, "LXX", null},
                {71, "LXXI", null},
                {72, "LXXII", null},
                {73, "LXXIII", null},
                {74, "LXXIV", null},
                {75, "LXXV", null},
                {76, "LXXVI", null},
                {77, "LXXVII", null},
                {78, "LXXVIII", null},
                {79, "LXXIX", null},
                {80, "LXXX", null},
                {81, "LXXXI", null},
                {82, "LXXXII", null},
                {83, "LXXXIII", null},
                {84, "LXXXIV", null},
                {85, "LXXXV", null},
                {86, "LXXXVI", null},
                {87, "LXXXVII", null},
                {88, "LXXXVIII", null},
                {89, "LXXXIX", null},
                {90, "XC", null},
                {91, "XCI", null},
                {92, "XCII", null},
                {93, "XCIII", null},
                {94, "XCIV", null},
                {95, "XCV", null},
                {96, "XCVI", null},
                {97, "XCVII", null},
                {98, "XCVIII", null},
                {99, "XCIX", null},
                {100, "C", null},
                {400, "CD", null},
                {500, "D", null},
                {900, "CM", null},
                {1000, "M", null},
                {2001, "MMI", null},
                {2002, "MMII", null},
                {2003, "MMIII", null},
                {2004, "MMIV", null},
                {2005, "MMV", null},
                {2006, "MMVI", null},
                {2007, "MMVII", null},
                {2008, "MMVIII", null},
                {2009, "MMIX", null},
                {2010, "MMX", null},
                {2011, "MMXI", null},
                {2012, "MMXII", null},
                {2013, "MMXIII", null},
                {2014, "MMXIV", null},
                {2292, "MMCCXCII", null},
                {2888, "MMDCCCLXXXVIII", null},
                {3069, "MMMLXIX", null},
                {3640, "MMMDCXL", null},
                {3924, "MMMCMXXIV", null},
                {3999, "MMMCMXCIX", null},

        });
    }

    /**
     * Asserts the current set decimal equals the currently set
     */
    @Test
    public void testGenerate() {

        if(this.expectedExceptionClass != null) {
            this.exception.expect(this.expectedExceptionClass);
        }

        String actual = this.generator.generate(this.decimal);
        org.junit.Assert.assertEquals(this.expectedResult, actual);

    }

}