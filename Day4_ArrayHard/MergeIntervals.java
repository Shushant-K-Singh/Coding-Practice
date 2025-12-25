class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> sol = new ArrayList<>();
        int[] checker = intervals[0];

        for(int i=1;i<intervals.length;i++){            
            if(checker[1] >= intervals[i][0]){
                checker[1] = Math.max(checker[1],intervals[i][1]);
            }
            else{
                sol.add(checker);
                checker = intervals[i];
            }
        }
      
        sol.add(checker);
        return sol.toArray(new int[sol.size()][]);
    }
}
