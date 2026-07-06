class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int st: nums) {
            if(set.contains(st)) {
                return true;
            }
            set.add(st);
        }
        return false;
    }
}