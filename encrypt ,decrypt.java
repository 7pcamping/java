import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner scanner =new Scanner(System.in);
       
       System.out.println("enter the number:");
       int orignalGrade=scanner .nextInt();
       
       int encryptedGrade=orignalGrade+8;
       System.out.println("encrypted grade:"+encryptedGrade);
       
       int decryptedGrade=encryptedGrade-8;
       System.out.println("decrypted grade:"+decryptedGrade);
       
       
    }
}
