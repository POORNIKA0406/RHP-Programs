import java.util.*;
public class Main{
  public static void main(string[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        a[i][j] = sc.nextInt();
      }
    }
    long[][] c = new long[n][m];
    for(int i=0;i<n;i++){
      c[i][0] = a[i][0];
    }
    for(int j=1;j<m;j++){
      long fmax = Long.MIN_VALUE,smax=Long.MIN_VALUE;
      for(int i=0;i<n;i++){
        if(c[i][j-1] > fmax){
          smax=fmax;
          fmax=c[i][j-1];
        }
        else if(c[i][j-1]>smax){
          smax=c[i][j-1];
        }
      }
      for(int i=0;i<n;i++){
        if(c[i][j-1] == fmax){
          c[i][j] = a[i][j] + smax;
        }
        else{
          c[i][j] = a[i][j] + fmax;
        }
      }
    }
    long ans = Long.MIN_VALUE;
    for(int i=0;i<n;i++){
      ans=Math.max(ans,c[i][m-1]);
    }
    System.out.println(ans);
  }
}
