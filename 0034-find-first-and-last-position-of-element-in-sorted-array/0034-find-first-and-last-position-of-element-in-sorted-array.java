class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int s = binarySearch(nums, target, true);
        int e = binarySearch(nums, target, false);
        result[0] = s;
        result[1] = e;
        return result;
    }

    private int binarySearch(int[] nums, int target, boolean isSearchLeft){
        int s = 0, e = nums.length - 1;
        int index = -1;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if (nums[mid] < target) s = mid + 1;
            else if (nums[mid] > target) e = mid - 1;
            else{
                index = mid;
                if(isSearchLeft) e = mid - 1;
                else s = mid + 1;
            }
        }
        return index; 
    }
}