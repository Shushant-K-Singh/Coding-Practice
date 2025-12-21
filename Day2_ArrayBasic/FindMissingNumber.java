public class Solution(){
  public static int missingNumber(int[] arr){

    int xor = arr.length;
    for(int i=0;i<arr.length;i++){
      xor ^= i^arr[i];
    }
    return xor;
  }
}
