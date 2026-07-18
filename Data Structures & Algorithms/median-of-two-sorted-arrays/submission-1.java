class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int index = 0;
        for(int i = 0; i < nums1.length; i++) {
            nums[index++] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++) {
            nums[index++] = nums2[i];
        }
        Arrays.sort(nums);

        if(nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        }
        else {
            return nums[nums.length / 2];
        }
    }
}
