class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0, bot = ROWS - 1;
        while(top <= bot) {
            int row = (top + bot) / 2;
            if(target > matrix[row][COLS - 1]) top = row + 1;
            else if(target < matrix[row][0]) bot = row - 1;
            else break;  
        }
        if(!(top <= bot)) return false;
        int row = (top + bot) / 2;
        int i = 0, j = COLS - 1;
        while(i <= j) {
            int mid = (i + j) / 2;
            if(target > matrix[row][mid]) {
                i = mid + 1;
            }
            else if(target < matrix[row][mid]) {
                j = mid - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
