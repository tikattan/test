/**
 * 
 */
package lanterns;

/**
 * @author nirav
 *
 */
public class DedicationTokens {
	/** It gives the ID of the dedication token.	*/
	private int dedicationTokenID;
	/** It gives the dedication type of the dedication token.	*/
	private String dedicationType;
	/** It gives the Honor value of the dedication token.	*/
	private int honorValue;
	/** It gives number of dots printed on the dedication token.	*/
	private int numberOfDots;
	/** 
	 * It construct a dedication token.
	 * @param dedicationType
	 * @param honorValue
	 * @param numberOfDots	
	 */
	public DedicationTokens(int dedicationTokenID, String dedicationType, int numberOfDots, int honorValue){
		this.dedicationTokenID=dedicationTokenID;
		this.dedicationType=dedicationType;
		this.numberOfDots =numberOfDots;
		this.honorValue =honorValue;
	}
	/**
	 *  It converts name to string.	
	 *  return name
	 */
	public String toString()
	{
		return dedicationType;
	}
	
	public int getHonorValue()
	{
		return honorValue;
	}
	
	public int getDedicationTokenID()
	{
		return dedicationTokenID;
	}
	
	public int getDots()
	{
		return numberOfDots;
	}
}
