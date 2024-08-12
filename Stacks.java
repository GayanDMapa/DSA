package text;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		Stack<String> games = new Stack<String>();
		
		System.out.println(games.empty());
		
		games.push("Call of duty");
		games.push("Minecraft");
		games.push("Doom");
		games.push("Borderlands");
		games.push("FFVII");
		
		System.out.println();
		System.out.println("After Pop 5 element");
		System.out.println(games.empty());
		
		System.out.println();
		System.out.println("push After Stack");
		System.out.println(games);
		
		
		String popGames = games.pop();
		System.out.println();
		System.out.println("pop element");
		System.out.println(games.pop());
		
		System.out.println();
		System.out.println("one pop After");
		System.out.println(games);
		
		System.out.println();
		System.out.println("Search element to stack");
		System.out.println(games.search("Doom"));
		
		

	}

}
