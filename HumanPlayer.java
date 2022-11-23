//Katsanou Aikaterini Panagiota
//AM:5249

import java.util.Scanner;

public class HumanPlayer extends Player 
{
    
    public HumanPlayer(String name){
        super(name);
    }

    public int selectNumber(){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Give a number between 1 and 5: ");

        int humanNumber = input.nextInt();

        while(humanNumber < 1 || humanNumber>5){
            System.out.print("Give a number between 1 and 5: ");
            humanNumber = input.nextInt();
        }


        return humanNumber;

    }
    
}
