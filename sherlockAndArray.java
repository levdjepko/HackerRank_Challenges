
public static String balancedSums(List<Integer> arr) {
        // find such an element in the array such that the sum of elements to the left equals the sum of elements to the right
        int left = 0;
        int right = 0;
        for (int i = 1; i < arr.size(); i++) {
            right += arr.get(i);
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (left == right) {
                return "YES";
            }
            left += arr.get(i);
            right -= arr.get(i + 1);
        }
        return "NO";
    }
