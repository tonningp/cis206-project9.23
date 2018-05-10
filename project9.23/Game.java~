import java.util.ArrayList;

public class Game{
   
   public static void main(String [] args){
      ArrayList<Character> playerList = new ArrayList<Character>();
      playerList.add(new Monster());
      playerList.add(new Hero());
      playerList.add(new Hero());

      for(Character p: playerList){
	//System.out.println(p);
	Event e = new Event();
	System.out.println(e.generateRandom(1,4));
	p.move(new Direction(0));
	p.move(new Direction(2));
      }
   }
}
