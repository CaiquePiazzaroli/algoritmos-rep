import java.util.ArrayList;
import java.util.List;

public class Algorithm002SelectionSort {

   
    private static Integer findMinor(List<Integer> numbers) {
        Integer minor = numbers.get(0);
        Integer indexMinor = 0;
        for(int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) < minor) {
                minor = numbers.get(i);
                indexMinor = i;
            }
        }
        return indexMinor;
    }

    private static List<Integer> selectionSort(List<Integer> unorderedList) {
        List<Integer> orderedList = new ArrayList<>();

        int unorderedListSize = unorderedList.size();
        for(int i = 0; i < unorderedListSize; i++) {
            int indexMinor = findMinor(unorderedList);
            orderedList.add(unorderedList.get(indexMinor));
            unorderedList.remove(indexMinor);
        }

        return orderedList;
    }

    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7879);
        numbers.add(40);
        numbers.add(10);
        numbers.add(-1);

        List<Integer> orderedList = selectionSort(numbers);
        System.out.println(orderedList);

    }
}
