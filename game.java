import java.util.*;
public class Play{
    public static void main(String[] args) {  
    	Scanner sc = new Scanner(System.in);
    	Queue<Player> players = new LinkedList<>();
    	System.out.println("Enter number of dice : ");
    	int no_dice = sc.nextInt();
    	Dice dice = new Dice(no_dice);
    	System.out.println("Enter number of players: ");
    	int n = sc.nextInt();
    	sc.nextLine();
    	while(n-- > 0) {
    		System.out.println("Enter player name: ");
    		String name = sc.nextLine();
    		Player p = new Player(name);
    		players.add(p);
    	}
    	Snakes snake1 = new Snakes(17,6);
        Snakes snake2 = new Snakes(26,3);
        Snakes snake3 = new Snakes(42,21);
        Snakes snake4 = new Snakes(47,25);
        Snakes snake5 = new Snakes(55,32);
        Snakes snake6 = new Snakes(59,8);
        Snakes snake7 = new Snakes(75,10);
        Snakes snake8 = new Snakes(95,85);
        Snakes snake9 = new Snakes(98,1);
        Map<Integer,Snakes> snakes = new HashMap<>();
        snakes.put(26,snake2);
        snakes.put(17,snake1);
        snakes.put(42,snake3);
        snakes.put(59,snake6);
        snakes.put(75,snake7);
        snakes.put(55,snake5);
        snakes.put(47,snake4);
        snakes.put(98,snake9);
        snakes.put(95,snake8);
        Ladder ladder1 = new Ladder(16,26);
        Ladder ladder2 = new Ladder(19,39);
        Ladder ladder3 = new Ladder(47,61);
        Ladder ladder4 = new Ladder(65,97);
        Ladder ladder5 = new Ladder(85,92);
        Map<Integer,Ladder> ladders = new HashMap<>();
        ladders.put(16,ladder1);
        ladders.put(19,ladder2);
        ladders.put(47,ladder3);
        ladders.put(65,ladder4);
        ladders.put(85,ladder5);
        //System.out.println(players.poll().getPlayerName());
        Board gb=new Board(dice,players,snakes,ladders);
        gb.startGame();
        sc.close();
    }
}
