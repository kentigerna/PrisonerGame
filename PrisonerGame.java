//Katsanou Aikaterini Panagiota
//AM:5249

import java.util.Scanner;

class PrisonerGame 
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play 1.Human vs Computer, or 2. Computer vs Computer?");
        int choice = input.nextInt();

        Player player1;
        Player player2;

        if (choice == 1){
            player1 = new HumanPlayer("Human");
            player2 = new ComputerPlayer("Computer");            
        }else{
            player1 = new ComputerPlayer("Computer1");
            player2 = new ComputerPlayer("Computer2");
        }

        GameRounds game = new GameRounds(player1,player2);
        while (true){
            game.playRound();
            game.printScore();
            
            Scanner input1 = new Scanner(System.in);
            System.out.println("Do you want to play another round?");
            String s = input1.next();

            while((!s.equals("n"))&&(!s.equals("y"))){
                System.out.println("Do you want to play another round?");
                s = input1.next();
            }

            if (s.equals("n")){
                Player winner = player1.declareWinner(player2);

                if (winner == null){
                    System.out.println("No winner!");

                }else{
                    System.out.println(winner.toString()+" has won the game!");

                }

                break;

            }

        }
        
    }
    
}
