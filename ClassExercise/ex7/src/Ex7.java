

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex7 {

    public static void main(String[] args) {
        // Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
        List<Integer> numberList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int count = CollectionUtils.countElementsWithProperty(numberList1, n -> n % 2 != 0);
        System.out.println("Count of odd integers: " + count);

        // Write a generic method to exchange the positions of two different elements in an array.
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};
        ArrayUtils.exchangeElements(stringArray, 0, 4);
        System.out.println(Arrays.toString(stringArray));

        //Write a generic method to find the maximal element in the range [begin, end) of a list.
        List<Integer> numberList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = ListUtils.findMaxInRange(numberList2, 2, 5, Comparator.naturalOrder());
        System.out.println("Maximal element: " + max);

    }
}
