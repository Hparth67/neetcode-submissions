class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }
        int count=0;
        for(int num: nums) {
            if(!set.contains(num-1)) {
                int l=1;
                while(set.contains(num+l)) {
                    l++;
                }
                count=Math.max(count, l);
            }
        }
        return count;
    }
}
