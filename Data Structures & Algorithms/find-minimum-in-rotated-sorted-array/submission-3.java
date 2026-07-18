class Solution {
    public int findMin(int[] nums) {
        int num = nums[0];
        for(int i = 0; i < nums.length; i++) {
            num = Math.min(num, nums[i]);
        }
        return num;
    }
}
