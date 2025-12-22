class Result {

    /*
     *     The function is expected to return a LONG_INTEGER.
     *     The function accepts LONG_INTEGER n as parameter.
           It accepts the Long number and flips every bit from 0 -> 1 and from 1 -> 0, then returns the resulting Long
     */

    public static long flippingBits(long n) {
    // Write your code here
        String intAsBinary = Long.toBinaryString(n);
        intAsBinary = String.format("%32s", intAsBinary).replaceAll(" ", "0");
        System.out.println(intAsBinary);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intAsBinary.length(); i++) {
            if (intAsBinary.charAt(i) == '1') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        String finalResult = sb.toString();
        Long newValue = Long.parseLong(finalResult, 2);
        return newValue;
    }

}
