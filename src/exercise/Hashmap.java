package exercise;
/*
 * 
 * import java.util.Collection; import java.util.HashMap; import java.util.Map;
 * import java.util.Map.Entry; import java.util.Scanner;
 * 
 * public class Hashmap {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * Scanner scan = new Scanner(System.in); Bowling game = new Bowling();
 * 
 * for(int i = 0; i < 3; i++) { String input = scan.nextLine(); String [] inputs
 * = input.split(" "); String name = inputs[0]; int point =
 * Integer.parseInt(inputs[1]); game.addPlayer(name, point); } game.getWinner();
 * }
 * 
 * 
 * }
 * 
 * class Bowling{
 * 
 * Map<String, Integer> players;
 * 
 * Bowling(){
 * 
 * players = new HashMap<String, Integer>(); }
 * 
 * public void addPlayer(String name, int points){ players.put(name, points);
 * 
 * }
 * 
 * public void getWinner(){
 * 
 * int winnerPoint = 0; String winnerPlayer = ""; for(Entry<String, Integer>
 * data : players.entrySet()) { int value = data.getValue(); String player =
 * data.getKey(); if(winnerPoint < value) { winnerPoint = value; winnerPlayer =
 * player; }
 * 
 * 
 * } System.out.println(winnerPlayer + " with value of: " + winnerPoint);
 * 
 * } }
 * 
 * 
 * 
 */




import java.util.*;
import java.util.Map.Entry; 

 class Bowling {
    Map<String,Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
		
		int winnerPoint = 0;
		String WinnerPlayer = "";
        int value = 0;
        String player = "";
		for(Entry<String, Integer> data : players.entrySet()) {
			value = data.getValue();
			player = data.getKey();
			if(winnerPoint < value) {
				winnerPoint = value;
				WinnerPlayer = player;
		}
		
		
	}

		System.out.println(WinnerPlayer);
	
}
}

public class Hashmap {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
       game.getWinner();
    }
}













