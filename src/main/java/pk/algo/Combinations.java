package pk.algo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A subset of items in a set is called combination.
 * Number of combinations of k elements from n elements:
 * - with duplicates: n^k
 * - without duplicates: n*(n-1)*(n-2)*...*(n-k) = n! / k!
 */
public class Combinations {



    public static List<String> findSelections(String input, int length) {

        return findSelections("", input, length, true);

    }

    private static List<String> findSelections(String prefix, String input, int length, boolean allowDuplicates) {
        if (prefix.length() == length) {
            return Collections.singletonList(prefix);
        }
        List<String> selections = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            String ithPrefix = prefix + input.charAt(i);
            String nextInput = input.substring(allowDuplicates ? i : i + 1);
            List<String> prefixedSelections = findSelections(ithPrefix, nextInput, length, allowDuplicates);
            selections.addAll(prefixedSelections);
        }
        return selections;
    }
}
