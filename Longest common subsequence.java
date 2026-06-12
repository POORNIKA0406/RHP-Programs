import java.util.*;
public class Main{
  public static int lcs(String a,String b){
    int m = a.length();
    int n = b.length();
    int[][] dp = new int[m+1][n+1];
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(a.charAt(i-1) == a.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1]+1;
        }
        else{
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
    }
    return dp[m][n];
  }
  public static String getlcs(String a,String b){
    int m = a.length();
    int n = a.length();
    int[][] dp = new int[m+1][n+1];
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(a.charAt(i-1) == b.charAt(j-1)){
          dp[i][j] = dp[i-1][j-1]+1;
        }
        else{
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
    }
    StringBuilder lcs = new StringBuilder();
    int i=m,j=n;
    while(i>0 && j>0){
      if(a.charAt(i-1)==b.charAt(j-1)){
        lcs.append(a.charAt(i-1));
        i--;
        j--;
      }
      else if(dp[i-1)[j] > dp[i][j-1]){
        i--;
      }
      else{
        j--;
      }
    }
    return lcs.reverse().toString();
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int len = lcs(s1,s2);
    String str = getlcs(s1,s2);
    System.out.println(len);
    System.out.println(str);
  }
}
