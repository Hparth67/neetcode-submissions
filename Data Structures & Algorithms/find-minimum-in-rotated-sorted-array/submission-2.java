class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        for(int n : nums) {
            return n;
        }
        return -1;
    }
}
