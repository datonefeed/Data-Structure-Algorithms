class RemoveDupplicationFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for (int i = 0; i < k - 2; i++) {
            if (nums[i] == nums[i + 2]) {
                for (int j = i + 2; j < k - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                k--;
                i--;
            }
        }
        return k;

    }
}