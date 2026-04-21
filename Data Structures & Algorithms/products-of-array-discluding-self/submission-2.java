class Solution {
    public int[] productExceptSelf(int[] nums) {
       List<Integer> res = new ArrayList<>();
       for(int i=0; i<nums.length; i++) {
            int count = 1;
            for(int j=0; j<nums.length; j++) {
                if(i!=j) {
                    count *= nums[j];
                }
            }
            res.add(count);
       } 
       return res.stream().mapToInt(Integer::intValue).toArray();
    }
}  
