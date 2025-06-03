public static int pickingNumbers(List<Integer> a) 
    {    	
        HashMap <Integer, Integer> frequency = new HashMap<>();  
      
        for (int i = 0; i < a.size(); ++i) 
        {  
            if (frequency.containsKey(a.get(i)))  
                frequency.put(a.get(i), freq.get(a.get(i)) + 1);  
            else
                frequency.put(a.get(i), 1);  
        }        
        // Finding the max sum of adjacent indices  
        int ans = 0;        
        for (Integer key : freq.keySet())  
        {  
            if (frequency.containsKey(key+1))  
                ans = Math.max(ans, frequency.get(key) + frequency.get(key+1));  
        }  
        return ans;  
    }  
