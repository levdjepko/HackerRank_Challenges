public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        
        // find the numbers that are missing in arr compared to brr
        // with the hashmap
        HashMap <Integer, Integer> hm = new HashMap<>();
        // find out what is in brr:
        for (int i = 0; i < brr.size(); i++) {
            if (hm.containsKey(brr.get(i))) {
                Integer currentNumber = hm.get(brr.get(i));
                hm.put(brr.get(i), currentNumber + 1);
            } else {
                hm.put(brr.get(i), 1);
            }
        }
        List <Integer> resultSet = new ArrayList<>();
        
        // check items in the arr and see which ones have the same count as in brr
        for (int i = 0; i < arr.size(); i++) {
            if (hm.containsKey(arr.get(i))) {
                Integer currentCount = hm.get(arr.get(i));
                hm.put(arr.get(i), currentCount - 1);
            } else {
                resultSet.add(arr.get(i));
            }
        }
        
        // check possible remaining items in the HashMap
        for (int key : hm.keySet()) {
            if (hm.get(key) != 0) {
                resultSet.add(key);
            }
        }
        return resultSet;
    }
