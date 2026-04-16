class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int max=0;
        for(int i=0; i<piles.size(); i++) {
            if(piles[i]>max) {
                max=piles[i];
            }
        }
        int l = 1;
        int r = max;
        int res=0;
        while(l<=r) {
            int c = l+((r-l)/2);
            long long sum=0;
            for(int i:piles) {
                sum += (i+c-1)/c;
            }
            if(sum<=h) {
                res = c;
                r=c-1;
            }
            else {
                l=c+1;
            }
        }
        return res;
    }
};
