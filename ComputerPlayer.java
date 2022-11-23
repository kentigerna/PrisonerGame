//Katsanou Aikaterini Panagiota
//AM:5249

import java.util.Random;


public class ComputerPlayer extends Player 
{
    public ComputerPlayer(String name){
        super(name);
    }

    public int selectNumber(){

        Random rand = new Random();
        int computerNumber = rand.nextInt(6-1)+1;

        return computerNumber;

    }

}


