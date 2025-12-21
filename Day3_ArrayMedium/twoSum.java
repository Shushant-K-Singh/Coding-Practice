public class Solution(){
  public int[] twoSum(int[] arr, int k){
    HashMap<Integer,Integer> map = new HashMap<>();
    
    for(int i=0;i<arr.length;i++){
      int diff = k-nums[i];
      if(map.containsKey(diff)){
        return new int[] {map.get(diff),i};
      }
      else{
        map.put(nums[i],i);
      }
    }
    return new int[]{};
  }
}
