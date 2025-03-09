import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;


public class Rock_paper_scissor {
    public static void main(String[] args) {
        // 0 --> Rock
        // 1 --> paper
        // 2 --> scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock");
        System.out.println("Enter 1 for Paper");
        System.out.println("Enter 2 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int botInput = random.nextInt(3);

        if (userInput == botInput) {
            System.out.println("Draw");

        } else if (userInput == 0 && botInput == 2 || userInput == 1 && botInput == 0 || userInput ==2 && botInput ==1) {
            System.out.println(" User Win");

        } else{
            System.out.println("Bot Win");
        }
        if (botInput == 0){
            System.out.println("Bot choice Rock");
        } else if(botInput == 1 ){
            System.out.println("Bot choice paper");
        }else if(botInput == 2){
            System.out.println("Bot choice scissor");
        }



    }
}
