class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        List<Integer>[] count = new ArrayList[nums.length+1];
        for(int i=0; i<count.length; i++) {
            count[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index=0;
        for(int i=count.length-1; i>0 && index<k; i--) {
            for(int n: count[i]) {
                res[index]=n;
                index++;
                if(index==k) {
                    return res;
                }
            }
        }
        return res;
    }
}
