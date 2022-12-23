import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>(List.of(1, 2, 6, 3, 4, 5));
        Set<Integer> set2 = new LinkedHashSet<>(List.of(0, 1, 2, 3, 5));
        System.out.println(symmetricDifference(set1, set2));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setDifference = new TreeSet<>(set1);
        setDifference.addAll(set2);
        Set<Integer> symmetric = new TreeSet<>(set2);
        symmetric.retainAll(set1);
        setDifference.removeAll(symmetric);
        return setDifference;
    }
}