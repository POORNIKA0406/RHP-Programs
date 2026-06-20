import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = s.nextLine();
    Map<Integer,Integer> map = new HashMap<>();
    map.put(0,-1);
    int csum=0,maxlen=0;
    for(int i=0;i<a.length();i++){
      if(a.charAt(i) =='1'){
        csum+=1;
      }
      else{
        csum-=1;
      }
      if(map.containsKey(csum)){
        maxlen=Math.max(maxlen,i-map.get(csum));
      }
      else{
        map.put(csum,i);
      }
      System.out.println(maxlen);
    }
  }
}
