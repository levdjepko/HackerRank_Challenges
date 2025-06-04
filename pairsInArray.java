import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {


    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap <Integer, Integer> pairs = new HashMap<>();
        int totalPairs = 0;
        
        for (int i = 0; i < n; i++) {
            if (!pairs.containsKey(ar.get(i))){
                pairs.put(ar.get(i), 1);
            } else {
                int currentCount = pairs.get(ar.get(i)) + 1;
                pairs.put(ar.get(i), currentCount);
                if (currentCount % 2 == 0){
                    totalPairs++;
                }
            }
        }
        return totalPairs;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
