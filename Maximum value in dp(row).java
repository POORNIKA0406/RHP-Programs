import java.util.*;
public class Main{
  public static void main(String[] args){
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
    for(int i=0;i<m;i++){
      c[0][j] = a[0][j];
    }
    for(int i=1;i<n;i++){
      long fmax = Long.MIN_VALUE,SMAX = Long.MIN_VAUE;
      for(int j=0;j<m;j++){
        if(c[i-1][j] > fmax){
          smax=fmax;
          fmax=c[i-1][j];
        }
        else if(c[i-1][j] > smax){
          smax = c[i-1][j];
        }
      }
      for(int j=0;j<m;j++){
        if(c[i-1][j] ==fmax){
          c[i][j] = a[i][j] + smax;
        }
        else{
          c[i][j] = a[i][j] + fmax;
        }
      }
    }
    long ans = Long.MIN_VALUE;
    for(int j=0;j<m;j++){
      ans = Math.max(ans,c[n-1][j]);
    }
    System.out.println(ans);
  }
}
