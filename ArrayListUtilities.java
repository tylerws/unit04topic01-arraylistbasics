import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtilities {
    public static int getListMax(ArrayList<Integer> items) {
        int maxVal = items.get(0);
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) > maxVal) {
                maxVal = items.get(i);
            }
        }
        return maxVal;
    }

    public static ArrayList<String> withoutLongWords(ArrayList<String> items) {
        ArrayList<String> newItems = items;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).length() > 5) {
                newItems.remove(i);
                i--;
            }
        }
        return newItems;
    }

    public static void removeLongWords(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).length() > 5) {
                items.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("method returns " + 
        getListMax(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 1)))
        );
    }
}