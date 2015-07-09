/**
 * 
 */
package lanterns;

/**
 * This class provides information of the Lantern Cards
 * @author nirav
 *
 */
public class LanternCard {
	
		protected String color;
		protected int id;
		/**
		 * Constructs an instance of LanternCard class with the given parameters.
		 * 
		 * This constructor will create LanternCard of a particular color,
		 * the id.
		 * 
		 * @param id
		 * @param color
		 * @param 
		 */
		public LanternCard(int id, String color){
			this.id=id;
			this.color=color;
		}
		
		public String getLanternCardColor()
		{
			return color;
		}
		
		public int getLanternCardID()
		{
			return id;
		}


}

