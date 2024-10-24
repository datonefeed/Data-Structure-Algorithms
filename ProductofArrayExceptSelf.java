public class ProductofArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int k = nums.length;
            int sum = 1;
            int[] myArray = new int[k];
            for (int i = 0; i < k; i++) {
                int loc = i;
                for (int j = 0; j < k; j++) {
                    if (j != loc) {
                        sum = sum * nums[j];
                    }
                }
                myArray[i] = sum;
                sum = 1;
            }
            return myArray;
        }
    }
}
