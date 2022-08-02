public static int sansaXor(List<Integer> arr) {
  
        // XOR has this following interesting feature:
        // if we XOR the array of even size, we always get 0,
        // if we XOR the array of odd size, we get the XOR or odd elements:
  
        int xor = arr.get(0);
  
        if (arr.size() % 2 == 0) {
            return 0;
        } else {
            xor = arr.get(0);
            for (int i = 2; i < arr.size(); i = i + 2) {
                xor = xor ^ arr.get(i);
            }
        }
        return xor;
    }
