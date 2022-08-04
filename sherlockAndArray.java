// THIS QUESTION IS FAULTY, as well as the answer. DON'T USE IT
public static String balancedSums(List<Integer> arr) {
        // find an element in the array such that sum of elements to the left equals sum of elements to the right
        int left = 0;
        int right = arr.size() - 1;
        
        int leftSum = arr.get(0);
        int rightSum = arr.get(arr.size() - 1);
        while (right - left > 1) {

            if (leftSum == rightSum && right - left == 2) {
                return "YES";
            }
            
            if (leftSum < rightSum) {
                left++;
                leftSum = leftSum + arr.get(left);
                continue;
            }
            if (rightSum < leftSum) {
                right--;
                rightSum += arr.get(right);
                continue;
            }

        }
        if (leftSum == rightSum && right - left == 2) {
                return "YES";
            } else {
                return "NO";
            }

    }
