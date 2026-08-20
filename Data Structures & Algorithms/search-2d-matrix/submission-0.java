public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0) return false;

        int rows = matrix.length;
        int col= matrix[0].length;

        int left=0;
        int right=rows*col -1;

        while(left<=right) {
            int midpoint = left + (right-left) /2;
            int element = matrix[midpoint/col][midpoint%col];
            if(element == target ) {
            return true;
            }
         else if(target<element) {
           right=midpoint-1;
         }else if(target > element) {
            left = midpoint +1;
         }

        }

        return false;    
    
    
    }
}