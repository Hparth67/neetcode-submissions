class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int f=0;
        int l=numbers.size()-1;
        
        while (f<l) {
            int sum=numbers[f]+numbers[l];
            if(sum==target) {
                return {f+1, l+1};
            }
            if(sum>target) {
                l--;
            }
            else {
                f++;
            }
        }
        return {};
    }
};
