class Solution {
    public int search(int[] nums, int target) {

        int mid=(nums.length)/2;
        if(nums[mid] == target) return mid;
        if (nums[mid] < target){
            while(mid<nums.length) {
                if(nums[mid]==target){
                    return mid;
                }
                mid++;
            }
        } else{
            while(mid>=0) {
                if(nums[mid] == target){
                    return mid;
                }
                mid--;
            }
        }

        return -1;
    }
}
