class Solution {
    public int removeDuplicates(int[] nums) {
       /*int k = 1;
        for (int i = 1;i < nums.length;i++){
            if(nums[i] != nums[i - 1]){
                nums[k] = nums[i];
                k++;
                
            }
        }
        return k;*/

        //cach khac
        int k = nums.length;
        for (int i = 0;i < k - 1; i++){
            if(nums[i] == nums[i+1]){
                k--;
                for(int j = i+1; j < k; j++) {
                    nums[j] = nums[j+1];
                }
                i--;
            }
        }
        return k;
    }
}
