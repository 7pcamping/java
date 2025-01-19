import java.util.*;
public class Functions{
  public static int calculateSum(int a,int b){
    int sum=a+b;
    return sum;
  }
  public static void main(String args[]){
    Scanner scanner =new Scanner (System.in);
    int a=sc.nextInt();
    int b= sc.nextInt();
    int sum=calculatesSum(a,b);
    System.out.println(sum);
  }
}
