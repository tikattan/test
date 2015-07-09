/**
 * 
 */
package lanterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author nirav
 *
 */
public class Master {
	
	private static Scanner scan;
	public static ArrayList<Player> playerList=new ArrayList<Player>();
	public static ArrayList<LanternCard> orange = new ArrayList<LanternCard>(8);
	public static ArrayList<LanternCard> green = new ArrayList<LanternCard>(8);
	public static ArrayList<LanternCard> purple = new ArrayList<LanternCard>(8);
	public static ArrayList<LanternCard> white = new ArrayList<LanternCard>(8);
	public static ArrayList<LanternCard> blue = new ArrayList<LanternCard>(8);
	public static ArrayList<LanternCard> red = new ArrayList<LanternCard>(8);
	public static ArrayList<LanternCard> black = new ArrayList<LanternCard>(8);

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		scan = new Scanner(System.in);
		int input = 0;
		boolean quit = false;
		for (int i=0; i<7; i++){
			//give three lake tiles
		}
		BufferedReader br=new BufferedReader(new FileReader("/home/nirav/workspace/Lanterns/Lanterns/src/DedicationTokens.txt"));
		String line;
		String[] info;
		DedicationTokens dt;
		int counter=0;
		while((line=br.readLine())!=null)
		{
			info=line.split(" ");
			dt=new DedicationTokens(counter,info[0],Integer.parseInt(info[2]),Integer.parseInt(info[1]));
			counter++;
		}
		br.close();
		do{
			System.out.println("Select the one of the options:");
			System.out.println("0. Exit");
			System.out.println("1. New Game");
			System.out.println("2. Load Game");
			do{	
				while (!scan.hasNextInt()){
					System.out.println("Invalid Input!! Please try again...");
					scan.next();
				}
				input = scan.nextInt();
				if (input < 0){
					System.out.println("Please enter a positive number!!!");
				}
			} while (input <= -1);
			switch (input) {
			case 1:
				System.out.println("Enter number of players: (WARNING: Minimum 2 players and Maximum 4 players)");
				//Master.newGame();
				break;

			case 2:
				//SaveGame.load();
				break;

			case 0:
				quit = true;
				break;

			default:
				System.out.println("Invalid input!!! Please do right selection...");
				break;
			}
		}while(!quit);
		System.out.println("Bye-bye!!!");
		scan.close();
	}
	
	public static int Menu(){
		int input=0;
		System.out.println("Select the one of the options(0-5):");
		System.out.println(" 0. Exit");
		System.out.println(" 1. Save Game");
		System.out.println(" 2. Load Game");
		//System.out.println(" 3. Play a Card");
		//System.out.println(" 4. Get the benefits");
		//System.out.println(" 5. Finish this turn and refill the card");
		do{	
			while (!scan.hasNextInt()){
				System.out.println("Invalid Input!! Please try again...");
				scan.next();
			}
			input = scan.nextInt();
			if (input < 0){
				System.out.println("Please enter a positive number!!!");
			}
		} while (input <= -1 || input>5);
		return input;
	}
	
	/**
	 * 
	 * The newGame method initiates the new game.
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * 
	 */
	public static void newGame() throws NumberFormatException, IOException{

		int players = 0;
		String first;
		String second;
		String third;
		String fourth;
		do{	
			while (!scan.hasNextInt()){
				System.out.println("Invalid Input!! Please try again...");
				scan.next();
			}
			players = scan.nextInt();
			if (players < 0){
				System.out.println("Please enter a positive number!!!");
			}
		} while (players <= -1);

		if (players != 2 && players != 3 && players != 4){
			System.out.println("Please enter number between 2 and 4!!!");
			//Master.newGame();
		} else {
			
			for (int i = 0; i < players; i++){
				if (i == 0){
				} 
				else if(i == 1){
					
				} 
				else if (i == 2){
					
				} 
				else if (i == 3){
					
				}
			}

			
		}
	}
}


