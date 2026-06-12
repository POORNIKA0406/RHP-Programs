import java.util.*;
public class Main{
  public static String lcs(String a ,String b){
    int m = a.length();
    int n = b.length();
    int[][] dp = new int[m+1][n+1];
    int len =0;
    int index =0;
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(a.charAt(i-1) == b.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1]+1;
          if(dp[i][j] > len){
            len=dp[i][j];
            index=i;
          }
        }
        else{
          dp[i][j] = 0;
        }
      }
    }
    return a.substring(index-len,index);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String str = lcs(s1,s2);
    System.out.println(str);
  }
}
