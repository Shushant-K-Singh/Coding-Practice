public class solution(){
  public static void sortColors(int[] arr){
    int l=0, m=(l+r)/2, r= arr.length-1;

    while(m<=r){
      if(arr[m] == 0){
        int temp = arr[m];
        arr[m] = arr[l];
        arr[l] = temp;
        l++;
        m++;
      }

      else if(arr[m] == 1){
        m++; 
      }

      else{
        int temp = nums[m];
        arr[m] = arr[r];
        arr[r] = temp;
        r--;
      }
    }
  }
}
