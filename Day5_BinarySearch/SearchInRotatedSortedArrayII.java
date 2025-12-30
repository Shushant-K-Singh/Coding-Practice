public class solution{
  public int findPosition(int[] arr, int target){
    int left = 0;
    int right = arr.length-1;

    while(left<rigt){
       int mid = left+(right-left)/2;

      if(nums[mid]==target)[
        return mid;
      }
      if(nums[mid]==nums[left] && nums[mid]==nums[right]){
        left++;
        right--;
      }
      else if(nums[left]<=nums[right]){
        if(nums[left]<=target && nums[mid]>target){
          right=mid-1;
        }
        else{
          left=mid+1;
        }
      }
      else{
        if(nums[mid]>target && nums[rigt]<=target){
          left = mid+1;
        }
        else{
          rigt = mid-1;
        }
      }
    }
    return -1;
  }
}
