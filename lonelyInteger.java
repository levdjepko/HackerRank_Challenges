public static int lonelyinteger(List<Integer> a) {
        // Find an integer that doesn't have a duplicate in the array
        Collections.sort(a);
        int lonelyInt = -1;
        if (a.size() == 1) {
            return a.get(0);
        }
        if (a.get(0) != a.get(1)) {
            lonelyInt = a.get(0);
        }
        if (a.get(a.size() - 1) != a.get(a.size() - 2)) {
            lonelyInt = a.get(a.size() - 1);
        }
        for (int i = 1; i < a.size() - 1; i++) {
            if (a.get(i) != a.get(i-1) && a.get(i) !=  a.get(i+1)){
                lonelyInt = a.get(i);
            }
        }
        
        return lonelyInt;

    }
