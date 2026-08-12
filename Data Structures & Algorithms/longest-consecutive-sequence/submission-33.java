class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int count = 1;
            int n = nums[i];
            if(!set.contains(nums[i] - 1)) {
                while(set.contains(n + 1)) {
                    count++;
                    n++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
