class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int ptr1 = i + 1;
            int ptr2 = nums.length - 1;

            while (ptr1 < ptr2) {
                int sum = nums[i] + nums[ptr1] + nums[ptr2];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[ptr1], nums[ptr2]));

                    //skip duplicates
                    while (ptr1 < ptr2 && nums[ptr1] == nums[ptr1 + 1]) ptr1++;
                    while (ptr1 < ptr2 && nums[ptr2] == nums[ptr2 - 1]) ptr2--;

                    ptr1++;
                    ptr2--;
                } else if (sum > 0) {
                    ptr2--;
                } else {
                    ptr1++;
                }
            }
        }

        return res;
    }
}
