public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0 || target==0) return false;

        int rows=matrix.length;
        int col=matrix[0].length;

        int l=0;
        int r=rows*col-1;

        while(l<=r){
           int mid=l+(r-l) /2;
           if(matrix[mid/col][mid%col] < target){
            l=mid+1;
           }else if((matrix[mid/col][mid%col] > target)){
            r=mid-1;
        }else{
            return true;
        }
    }
    return false;
}
}