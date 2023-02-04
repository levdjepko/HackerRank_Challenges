    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> newArray = new ArrayList<>(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            int element = d + i;
            if (element < arr.size()) {
                newArray.add(arr.get(element));
            } else {
                element = element % arr.size();
                newArray.add(arr.get(element));
            }
        }
        return newArray;
    }
