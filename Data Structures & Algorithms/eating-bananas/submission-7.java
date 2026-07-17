class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = 0;
        for(int pile : piles) {
            j = Math.max(j, pile);
        }
        int res = j;

        while(i <= j) {
            int k = (i + j) / 2;
            int hours = 0;
            for(int p : piles) {
                hours += Math.ceil((double) p / k);
            }
            if(hours <= h) {
                res = Math.min(res, k);
                j = k - 1;
            } 
            else {
                i = k + 1;
            }
        }
        return res;
    }
}
