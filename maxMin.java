public static int maxMin(int k, List<Integer> arr) {
        // create an array of length k with 
        // the smallest difference between MAX element and MIN element
        Collections.sort(arr);
        // we implement a sliding window and check Max 
        // and Min while iterating over all the elements of the input array
        int left = 0;
        int right = k - 1;
        int currentMax = arr.get(right);
        int currentMin = arr.get(0);
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.size() > i + k - 1) {
                int max = arr.get(i + k - 1);
                int min = arr.get(i);
                if (max - min < currentMax - currentMin) {
                    currentMax = max;
                    currentMin = min;
                }
            }
        }
        return currentMax - currentMin;

    }
