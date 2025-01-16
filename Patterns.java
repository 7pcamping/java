import java.util.*;
public class Patterns{
  public static void main(String args[]){
    //define the row..
    int n=4;
    //define the column..
    int m=5;
    //Outer loop..
    for(int i=0;i<=n;i++){
      //inner loop..
       for(int j=0;j<=m;j++){
         System.out.print("*");
       }
      System.out.println();
    }
  }
}

output:
*****
*****
*****
*****
