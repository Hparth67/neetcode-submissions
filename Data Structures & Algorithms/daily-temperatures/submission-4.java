class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = i + 1; j < n; j++) {
                count++;
                if(temperatures[i] < temperatures[j]) {
                    res[i] = count;
                    break;
                }
                if(j == n - 1) {
                    res[i] = 0;
                }
            }
        }
        return res;
    }
}
