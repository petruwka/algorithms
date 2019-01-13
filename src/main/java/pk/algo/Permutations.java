package pk.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Permutations is an ordered subset of the items in a set
 *
 */
public class Permutations {

    public static List<String> findPermutations(String input, int length) {
        StringBuilder currentPermutation = new StringBuilder(length);
        return findPermutations(currentPermutation, input, length);
    }

    private static List<String> findPermutations(StringBuilder permutationState, String input, int length) {

        if (length == permutationState.length()) {
            return Collections.singletonList(permutationState.toString());
        }

        List<String> combinations = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            StringBuilder ithPrefix = new StringBuilder(permutationState);
            ithPrefix.append(input.charAt(i));
            List<String> ithCombinations = findPermutations(ithPrefix, input.substring(0, i) + input.substring(i+1), length);
            combinations.addAll(ithCombinations);
        }
        return combinations;
    }

}
