class Result {

    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Collections.sort(sticks);
        int side1, side2, side3;
        for (int i = sticks.size() - 1; i >= 2; i--) {
            side1 = sticks.get(i);      // the longest side
            side2 = sticks.get(i - 1);  // 2nd longest
            side3 =  sticks.get(i - 2); // shortest side
            if (side2 + side3 > side1){
                List<Integer> resultingTriangle = new ArrayList<Integer>(Arrays.asList(side3,side2,side1));
                return resultingTriangle;
            }
        }
        return new ArrayList<Integer>(Arrays.asList(-1));

    }

}
