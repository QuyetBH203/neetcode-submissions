class Solution {
    public int[] searchRange(int[] nums, int target) {
         int first = lowerBound(nums, target);

        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }

     private int lowerBound(int[] nums, int target) {
        int l = -1;
        int r = nums.length;

        while (r - l > 1) {
            int m = l + (r - l) / 2;

            if (nums[m] >= target) {
                r = m;
            } else {
                l = m;
            }
        }

        return r;
    }

    // Tìm vị trí đầu tiên có nums[i] > target
    private int upperBound(int[] nums, int target) {
        int l = -1;
        int r = nums.length;

        while (r - l > 1) {
            int m = l + (r - l) / 2;

            if (nums[m] > target) {
                r = m;
            } else {
                l = m;
            }
        }

        return r;
    }
}