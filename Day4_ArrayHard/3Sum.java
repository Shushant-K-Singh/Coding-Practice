public class solution{
  public List<List<Integer>> find(int[] arr){
    Arrays.sort(arr);
    HashSet<List<Integer>> res = new HashSet<>();
    
    for(int i=0;i<arr.length-2;i++){
      int left = i+1;
      int right = arr.length-1;

      while(left<right){
        int sum = arr[i]+arr[left]+arr[right];
        if(sum == 0){
          res.add(Arrays.asList(arr[i], arr[left], arr[right]));
          left++;
          rigt--;
        }
        else if(sum>0){
          right--;
        }
        else{
          left++;
        }
      }
    }
    return new ArrayList<>(res);
  }
}
