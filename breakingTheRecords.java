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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    
        int minSoFar = scores.get(0);
        int maxSoFar = scores.get(0);
        int numOfMinRecords = 0;
        int numOfMAXRecords = 0;
        
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > maxSoFar) {
                //this brakes the Max record
                maxSoFar = scores.get(i);
                numOfMAXRecords++;
            }
            if (scores.get(i) < minSoFar) {
                //this brakes the Max record
                minSoFar = scores.get(i);
                numOfMinRecords++;
            }
        }
        List<Integer> resultingList = new ArrayList<Integer>();
        resultingList.add(0, numOfMAXRecords);
        resultingList.add(1, numOfMinRecords);
        return resultingList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
