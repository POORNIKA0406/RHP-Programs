import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows and columns: ");
    int r = sc.nextInt();
    int c = sc.nextInt();
    if(r<=0 || c<=0){
      System.out.print("Invalid");
      return;
    }
    int[][] mat = new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        mat[i][j] = sc.nextInt();
      }
    }
    int targetrow = sc.nextInt();
    int targetcol = sc.nextInt();
    if(targetrow<0 || targetrow>=r || targetcol<0 || targetcol >=c){
      System.out.println("Error");
      return;
    }
    int sum=0;
    int[] rowoffset = {-1,-1,-1,0,0,1,1,1};
    int[] coloffset = {-1,0,1,-1,1,-1,0,1};
    for(int i=0;i<8;i++){
      int a = targetrow + rowoffset[i];
      int b = targetcol + coloffset[i];
      if(a>=0 && a<r && b>=0 && b<c){
        sum=sum + mat[a][b];
      }
    }
    System.out.println(sum);
  }
}
