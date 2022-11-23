//Katsanou Aikaterini Panagiota
//AM:5249

import java.util.ArrayList;


class GameRounds 
{

    private ArrayList<Player> arr = new ArrayList<Player>();
    private int firstPlace = 0;

    public GameRounds(Player player1, Player player2){
        arr.add(player1);
        arr.add(player2);
    }

    public void playRound(){

        Player x = arr.get(firstPlace);
        Player y = arr.get(1-firstPlace);

        System.out.println();
        System.out.println(x+" turn.");

        int points1 = x.play(y); 

        if (points1>31){
            y.addWin();
            System.out.println(x+" busted!");
            System.out.println(y+" has won");

            firstPlace = 1 - firstPlace;
            
            return;
        }

        System.out.println();
        System.out.println(y+" turn.");

        int points2 = y.play(x);

        if (points2>31){
            x.addWin();
            System.out.println(y+" busted!");
            System.out.println(x+" has won");

            firstPlace = 1 - firstPlace;

            return;
        }

        if (points1 >= points2){
            x.addWin();
            System.out.println(x+" has won");

            firstPlace = 1- firstPlace;

            return;

        }else{
            y.addWin();
            System.out.println(y+" has won");

            firstPlace = 1- firstPlace;

            return;
        }



    }

    public void printScore(){
        System.out.println(arr.get(0).toString()+": "+arr.get(0).getRound());
        System.out.println(arr.get(1).toString()+": "+arr.get(1).getRound());
    }  
    
    
}
