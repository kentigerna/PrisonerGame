//Katsanou Aikaterini Panagiota
//AM:5249

public abstract class Player
{
    private String name;
    private int round = 0;

    public Player (String name){
        this.name = name;
    }

    public abstract int selectNumber();

    public int play(Player player2){

        int points=0;

        while(points<26){
            int x1 = this.selectNumber();
            System.out.println(toString()+" selected "+ x1);

            int x2 = player2.selectNumber();
            System.out.println(player2.toString()+" selected "+ x2);

            points = points + x1 + x2;
            System.out.println(toString()+" has " +points+" points.");

        } return points;
    }

    public Player declareWinner(Player player2){
        if (round < player2.round){
            return this;

        }else if (round > player2.round){
            return player2;

        }return null;

    }

    public String toString(){
        return "Player "+name;
    }

    public void addWin(){
        round =+ 1;
    }

    public int getRound(){
        return round;
    }

}