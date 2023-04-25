import java.util.Comparator;
import java.util.List;

public class ListUtils {

    public static <T> T findMaxInRange(List<T> list, int begin, int end, Comparator<T> comparator) {
        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T element = list.get(i);
            if (comparator.compare(element, max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
