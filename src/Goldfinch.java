/**
 * 
 * @author sells
 *	The Goldfinch class represents a simulation of a Goldfinch
 */
public class Goldfinch extends Animal implements Flyable, Walkable {
/**
 * Initiates variables 	
 */	
	private double wingSpan ;
/**
 * Empty Constructor  	
 */
	public Goldfinch() {
		super();
		this.wingSpan =9.0;
	}
/**
 * 	
 * @param simID
 * @param l
 * @param ws
 * Preferred Constructor 
 */
	public Goldfinch(int simID, Location l, double ws) {
		super(simID , l);  
		if(ws >4.99 && ws<11.01) {
		this.wingSpan = ws;
		}
		if(ws<5.00) {
			System.out.println("Enter a wingSpan between 5.00 and 11.0");
		}
		if(ws>11.00) {
			System.out.println("Enter a wingSpan between 5.00 and 11.0");
		}
			return;
			}

/**
 * 
 * @return
 */
	public double getWingSpan() {
		return wingSpan;
	}
/**
 * 
 * @param wingSpan
 */
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
/**
 * Method to represent a Goldfinch flying on a grid. Moves a Goldfinch from any location on a grid to any new location on the grid.			
 */
	@Override
	public void fly(Location l) {
			super.setLocation(l);
	}
/**
 * Method to represent a Goldfinch Walking on a grid. Moves a Goldfinch object in any direction based on Integer passed to method.		
 */
	@Override
	public void walk(int direction) {
		//capture current location
		int xCurrent = location.getxCoord();
		int yCurrent = location.getyCoord();
			
		//Update this objects location
		if(direction <= 0) {//0 or less
			System.out.println("Invalid direction pick an integer between 1 and 100");
			
		}
		if(direction<=25 && direction > 0) {// 1 - 25 
		Location newLoc = new Location((xCurrent + 1),(yCurrent)) ;
			super.setLocation(newLoc);
		}
		
		if(direction <=50 && direction > 25) {// 26 - 50
			Location newLoc = new Location((xCurrent),(yCurrent +1)) ;
				super.setLocation(newLoc);
				
		}
		if(direction <=75 && direction > 50) {//51 - 75
			Location newLoc = new Location((xCurrent - 1),(yCurrent)) ;
				super.setLocation(newLoc);
		 }	
		
		if(direction <=100 && direction > 75) {//76 - 100
			Location newLoc = new Location((xCurrent),(yCurrent-1)) ;
				super.setLocation(newLoc);
		}
		if(direction > 100) {//above 100
			System.out.println("Invalid direction pick an integer between 1 and 100");
		}	
	}
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";	
	}	
}	

