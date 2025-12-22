class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count=0;
        int cursum=0;
        for(int i=0;i<arr.length;i++){
            cursum = cursum+arr[i];
            if(map.containsKey(cursum-k)){
                count += map.get(cursum-k);
            }
            map.put(cursum,map.getOrDefault(cursum,0)+1);
        }
        return count;
    }
}
