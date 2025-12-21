public class solution(){
  public void rotate(int[] arr, int k){
    int n = arr.length;
    int[] temp = new int[n];
    k = k%n;
    for(int i=0;i<arr.length;i++){
      temp[(i+k)%n] = arr[i];
    }
    for(int i=0;i<temp.length;i++){
      arr[i] = temp[i];
    }
  }
}
