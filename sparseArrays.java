import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
        Integer[] results = new Integer[queries.size()];
        Arrays.fill(results, 0);
        for (int i = 0; i < queries.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                if (queries.get(i).equals(strings.get(j))){
                    results[i]++;
                }
            }
            
        }
        List<Integer> listResults = Arrays.asList(results);
        return listResults;
    }
    // BELOW IS MORE EFFICIENT SOLUTION WITH HASMAP:
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // this can be solved with a HashMap
        HashMap <String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            if (!map.containsKey(strings.get(i))) {
                map.put(strings.get(i), 1);
            } else {
                int currentCount = map.get(strings.get(i));
                int newCount = currentCount + 1;
                map.put(strings.get(i), newCount);
            }
        }
        List <Integer> results = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            if (map.containsKey(queries.get(i))) {
                int count = map.get(queries.get(i));
                results.add(count);
            } else {
                results.add(0);
            }
        }
        return results;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.matchingStrings(strings, queries);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
