class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Đảm bảo mid luôn là chỉ số chẵn để kiểm tra cặp (chẵn, lẻ)
            if (mid % 2 == 1) {
                mid--;
            }

            // Nếu cặp (mid, mid + 1) khớp nhau, phần tử đơn lẻ nằm ở bên phải
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                // Nếu không khớp, phần tử đơn lẻ là chính mid hoặc nằm bên trái mid
                right = mid;
            }
        }

        // Khi left == right, đó chính là vị trí của phần tử đơn lẻ
        return nums[left];
    }
}