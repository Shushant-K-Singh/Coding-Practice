class solution(){
  public boolean checkIsSortedRotated(int[] arr){
    int count = 0;
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]>arr[i+1]){
        count++;
      }
    }
    
    if(arr[arr.length-1]>arr[0]){
      coount++;
    }

    return count<=1;
  }
}
