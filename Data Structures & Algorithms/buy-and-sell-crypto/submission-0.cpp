class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int l=0;
        int r=l+1;
        int profit=0;
        while(r<prices.size()) {
            if(prices[l]>prices[r]) {
                l=r;
                r++;
            }
            else {
                int diff=prices[r]-prices[l];
                profit=max(profit, diff);
                r++;
            }
        }
        return profit;
    }
};
