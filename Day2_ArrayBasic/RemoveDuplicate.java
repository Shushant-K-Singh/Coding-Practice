class Solution{
  public int removeDuplicate(int[] arr){
    if(arr.length==0){
      return 0;
    }
    
    int i = 0;
    
    for(int i=1;i<arr.length;i++){
      if(arr[i]!=arr[j]){
        i++;
        arr[i] = arr[j];
      }
    }
    return i+1;
  }
}
