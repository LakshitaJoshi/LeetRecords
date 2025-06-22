class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        int n = nums.length;

        for(i = 0; i < n; i++){
            if(nums[i] != val){
                // int temp = nums[i];
                // nums[i] = nums[j];
                nums[j] = nums[i];
                // nums[j] = temp;
                j++;
            }
        }
        return j;
    }
}