import java.util.Random; 
/**
 * 
 * @author sells
 *	@summary
 *	The Animal class is abstract and is extended by Goldfinch and Animal
 *	The class is used to create different animal classes with a standard format and setup
 **/
public abstract class Animal{
/**
 * Initiates variables  
 */
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
/**
 * 	Empty constructor
 */
	public Animal() {
		this.simID = 0;
		this.location = new Location(0,0); 
		this.full = false;
		this.rested = true;
		
		
	}
/**
 * 
 * @param simID
 * @param l
 * Preferred constructor
 */
	public Animal(int simID, Location l) {
		this.simID = simID;
		this.location = l;
		this.full = false;
		this.rested = true;
	}
/**
 * 	
 * @return a number between 0 and 1. If the number is below .5 return false. If the number if above .5 return true. 
 */
	public boolean eat() {
		Random rEat = new Random(); 
		int max = 1;
		double eat = rEat.nextDouble(max);
		
		if (eat<=.5) {
			this.full=false;
			return false;
		}
		else
			this.full=true;
			return true;
	}
/**	
*   
*  	
* @return a number between 0 and 1. If the number is below .5 return false. If the number if above .5 return true. 
*/
	public boolean sleep() {
		Random rSleep = new Random(); 
		int max = 1;
		double sleep = rSleep.nextDouble(max);
	
		if (sleep<=.5) {
		this.rested = false;
		return false;
		
	}
		else {
		this.rested = true;	
		return true;
		}	
	}
/**
 * 
 * @return
 */
	public int getSimID() {
		return simID;
	}
/**
 * 
 * @param simID
 */
	public void setSimID(int simID) {
		this.simID = simID;
	}
/**
 * 
 * @return
 */
	public Location getLocation() {
		return location;
	}
/**
 * 
 * @param location
 */
	public void setLocation(Location location) {
		this.location = location;
	}
/**
 * 
 * @return
 */
	public boolean isFull() {
		return full;
	}
/**
 * 
 * @param full
 */
	public void setFull(boolean full) {
		this.full = full;
	}
/**
 * 
 * @return
 */
	public boolean isRested() {
		return rested;
	}
/**
 * 
 * @param rested
 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}
}
