import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    @Test
    public void testGetListMax() {
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(4, 1, 2, 7, 9, 2));
        expectedOutput = 9;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testWithoutLongWords() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;

        input = new ArrayList<String>(Arrays.asList("monkey", "snail", "frog", "gorilla"));
        expectedOutput = new ArrayList<String>(Arrays.asList("snail", "frog"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testRemoveLongWords() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;

        input = new ArrayList<String>(Arrays.asList("monkey", "snail", "frog", "gorilla"));
        expectedOutput = new ArrayList<String>(Arrays.asList("snail", "frog"));
        ArrayListUtilities.removeLongWords(input);
        assertEquals(expectedOutput, input);
    }
}
