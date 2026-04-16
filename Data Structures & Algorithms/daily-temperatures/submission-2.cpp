class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        vector<int> result(temperatures.size(), 0);
        int n = temperatures.size();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(temperatures[j]>temperatures[i]) {
                    result[i] = j-i;
                    break;
                }
            }
        }
        return result;
    }
};
