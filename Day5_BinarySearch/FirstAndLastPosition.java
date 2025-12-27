class Solution {
    public int[] searchRange(int[] nums, int target) {
        int E1 = firstOccurance(nums,target);  
        int E2 = lastOccurance(nums,target);  
        return new int[]{E1,E2};
    }

    public int firstOccurance(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int first = -1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid]==target){
                first = mid;
                right = mid-1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return first;
    }
    public int lastOccurance(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int last = -1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid]==target){
                last = mid;
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return last;
    }
}
