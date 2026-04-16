class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> set(nums.begin(), nums.end());
        int longest=0;
        
        for(int i: set) {
            int count=0;
            if(!set.count(i-1)) {
                while(set.count(i+count)) {
                    count++;
                }
                longest = max(longest, count);
            }
        }
        return longest;
    }
};
