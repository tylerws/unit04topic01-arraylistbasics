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
}
