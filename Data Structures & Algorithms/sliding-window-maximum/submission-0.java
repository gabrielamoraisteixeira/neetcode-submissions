class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res=new int[nums.length-k+1];

        for (int l = 0; l <= nums.length - k; l++) {
            int max = nums[l]; 
            for (int r = l; r < l + k; r++) {
                max = Math.max(max, nums[r]);
            }
            res[l] = max;
        }
        return res;

        }
        
    }

