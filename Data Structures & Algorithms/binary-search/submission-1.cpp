class Solution {
public:
    int search(vector<int>& nums, int target) {
        int l = 0;
        int r = nums.size()-1;
        
        while(l<=r) {
            int x = (l+r)/2;
            if(nums[x]==target) {
                return x;
            }
            else if(nums[x]>target) {
                r=x-1;
            }
            else {
                l=x+1;
            }
        }
        return -1;
    }
};
