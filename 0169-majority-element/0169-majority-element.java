class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, element = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if (count == 0){
                count = 1;
                element = nums[i];
            }
            else if(element != nums[i]) count--;
            else count++;
        }

        int count1 = 0;
        for(int i = 0; i < n; i++){
            if (element == nums[i]) count1++;
        }

        if(count1 > n/2) return element;
        return -1;
    }
}