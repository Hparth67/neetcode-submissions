class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int rows=matrix.size();
        int cols=matrix[0].size();
        int bot=0;
        int top=rows-1;
        while(bot<=top) {
            int mrow=bot+((top-bot)/2);
            if(target>matrix[mrow][cols-1]) {
                bot=mrow+1;
            }
            else if(target<matrix[mrow][0]) {
                top=mrow-1;
            }
            else {
                break;
            }
        }
        if(!(bot<=top)) {
            return false;
        }
        int mrow=bot+((top-bot)/2);
        int l=0;
        int r=cols-1;
        while(l<=r) {
            int m=l+((r-l)/2);
            if(target>matrix[mrow][m]) {
                l=m+1;
            }
            else if(target<matrix[mrow][m]) {
                r=m-1;
            }
            else {
                return true;
            }
        }
        return false;
    }
};
