class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums) {
            set.add(n);
        }
        int count1=0;
        for(int n:set) {
            if(!set.contains(n-1)) {
                int count2=0;
                while(set.contains(n+count2)) {
                    count2++;
                }
                count1 = Math.max(count1, count2);
            } 
        }
        return count1;
    }
}
