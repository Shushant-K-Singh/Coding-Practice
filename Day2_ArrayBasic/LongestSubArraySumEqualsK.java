// arr[] = [10, 5, 2, 7, 1, -10] k=15
class Solution {
    public int longestSubarray(int[] arr, int k) {
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum==k){
                maxLength = i+1;
            }
            if(map.containsKey(sum-k)){
                int length = i-map.get(sum-k);
                maxLength = Math.max(maxLength,length);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
}
