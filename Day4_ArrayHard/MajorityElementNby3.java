public class solution(){
  public static ArrayList<Integer> find(int[] arr){
    List<Integer> res = new ArrayList<>();
    int Element1 = 0, Element2 = 0;
    int count1 = 0, count2 = 0;

    for(int num : arr){
      if(Element1 == num){
        count1++;
      }
      else if(Element2 == num){
        count2++;
      }
      else if(count1==0){
        Element1 = num;
        count1++;
      }
      else if(count2==0){
        count2++;
      }
      else{
        count1--;
        count2--;
      }
    }
    
    int count1 = 0;
    int count2 = 0;
    for(int num:arr){
      if(num==Element1){
        count1++;
      }
      else if(num==Element2){
        count2++;
      }
    }

    if(count1>arr.length/3){
      res.add(Element1);
    }
    if(count2>arr.length/3){
      res.add(Element2);
    }

    return res;
  }
}
