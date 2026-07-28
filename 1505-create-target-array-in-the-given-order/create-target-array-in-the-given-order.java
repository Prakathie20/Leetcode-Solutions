class Solution { 
    public int[] createTargetArray(int[] nums, int[] index) { 
        int n1 = nums.length; 
        int n2 = index.length; 
        int[] arr = new int[n1]; 
        
        if (n1 == n2) { 
            for (int i = 0; i < n2; i++) { 
                int t = index[i]; 
                
                // Shift elements to the right to make room at position t
                for (int j = i; j > t; j--) {
                    arr[j] = arr[j - 1];
                }
                
                // Now place the number at the target index
                arr[t] = nums[i]; 
            } 
        } 
        return arr; 
    } 
}