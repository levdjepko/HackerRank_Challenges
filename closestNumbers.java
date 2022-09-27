    /*
     * Complete the 'closestNumbers' function below.
     *
     * In this case, it will make it easier to determine which pair or pairs of elements have the smallest absolute difference between them.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
    
        // sort an array
        Collections.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        //return array:
        List<Integer> toReturn = new ArrayList<Integer>();
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i+1) - arr.get(i) <= minDifference) {
                minDifference = arr.get(i+1) - arr.get(i);
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i+1) - arr.get(i) == minDifference) {
                toReturn.add(arr.get(i));
                toReturn.add(arr.get(i+1));
            }
        }
        return toReturn;
    }
