public class solutions(){
  public static List<List<Integer>> generate(int row){
    List<List<Integer>> res = new ArrayList<>();
    for(int i=0 ; i<row.length;i++){
      List<Integer> r = new ArrayList<>();
      for(int j=0;j<=i;j++){
        if(j==0 || j==i){
          r.add(1);
        }
        else{
          r.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
        }
      }
      res.add(r);
    }
    return res;
  }
}
