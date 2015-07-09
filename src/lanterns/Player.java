/**
 * 
 */
package lanterns;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

/**
 * @author nirav
 *
 */
public class Player {

	protected int id;
	protected int favorTokens;
	protected int honor;
	
	private DedicationTokens dtokens;
	private ArrayList<LanternCard> holdingOrangeCards = new  ArrayList<LanternCard>();
	private ArrayList<LanternCard> holdingGreenCards = new  ArrayList<LanternCard>();
	private ArrayList<LanternCard> holdingPurpleCards = new  ArrayList<LanternCard>();
	private ArrayList<LanternCard> holdingWhiteCards = new  ArrayList<LanternCard>();
	private ArrayList<LanternCard> holdingBlueCards = new  ArrayList<LanternCard>();
	private ArrayList<LanternCard> holdingRedCards = new  ArrayList<LanternCard>();
	private ArrayList<LanternCard> holdingBlackCards = new  ArrayList<LanternCard>();
	private ArrayList<DedicationTokens> dedicationtokens = new  ArrayList<DedicationTokens>();

	/**
	 * 
	 * The Player constructor shows all the information, lantern cards,
	 * number of Dedication tokens and favor tokens 
	 * @param id
	 * @param lanterncards
	 * @param dedicationtokens
	 * @param favortokens
	 */

	public Player(int id,Vector<DedicationTokens> dedicationtokens,ArrayList<LanternCard> orange, ArrayList<LanternCard> green, ArrayList<LanternCard> purple , ArrayList<LanternCard> white , ArrayList<LanternCard> blue , ArrayList<LanternCard> red , ArrayList<LanternCard> black ){
		int numOrange = 0,numGreen = 0,numPurple = 0,numWhite = 0,numBlue = 0,numRed = 0, numBlack = 0;
		this.id = id;
		honor = 0;
		
		System.out.println("Player "+this.getID()+" has "+honor+" Honors.");
		favorTokens = 0;
		
		dtokens = this.gain_dedicationtokens(dtokens);
		System.out.println("Player "+this.getID()+" get personality card:"+this.personalityCard.toString());
		
		System.out.println("Player "+this.getID()+" has "+holdingOrangeCards.size()+" Orange Lantern Cards:");
		System.out.println("Player "+this.getID()+" has "+holdingGreenCards.size()+" Green Lantern Cards:");
		System.out.println("Player "+this.getID()+" has "+holdingPurpleCards.size()+" Purple Lantern Cards:");
		System.out.println("Player "+this.getID()+" has "+holdingWhiteCards.size()+" White Lantern Cards:");
		System.out.println("Player "+this.getID()+" has "+holdingBlueCards.size()+" Blue Lantern Cards:");
		System.out.println("Player "+this.getID()+" has "+holdingRedCards.size()+" Red Lantern Cards:");
		System.out.println("Player "+this.getID()+" has "+holdingBlackCards.size()+" Black Lantern Cards:");
	}
	/**
	 * Constructs an instance of player class with the given parameters.
	 * 
	 * This constructor will create a player with the id,money,color,
	 * minion,building,personalityCard and the holdingCards.
	 * 
	 * @param id  The id of the player
	 * @param money It shows how much amount a player has
	 * @param color  It shows the color of the player
	 * @param minion  It shows the number of minions a player have
	 * @param building It shows the number of buildings a player have
	 * @param personalityCard It shows the name of the personalityCard of a player
	 * @param holdingCards It shows the name of all the holdingCards
	 */

	public Player(int id, int money, int minion, int building,
			PersonalityCard personalityCard, ArrayList<BoardCard> holdingCards) {
		//super();
		this.id = id;
		this.money = money;
		this.minion = minion;
		this.building = building;
		this.personalityCard = personalityCard;
		this.holdingCards = holdingCards;
	}
	
	public int getID(){
		return id;
	}
	
	public int getFavorTokens() {
		return favorTokens;
	}
	
	public int getHonors() {
		return honor;
	}

}
