/**
 * 
 * @author sells
 * The BrownBear class represents a simulation of a brown bear.
 */
public class BrownBear extends Animal implements Swimmable, Walkable{

/**
 * Initiates variables
 * Decided to a Enum instead of a String for subSpecies due to the fact there was a set list of possible subSpecies	
 */
	private SubSpecies subSpecies;
/**
 * Empty Constructor  
 */
	public BrownBear() {
		super();
		this.subSpecies = SubSpecies.Alaskan; 
	}
/**
 * 	
 * @param simID
 * @param l
 * @param subSpecies
 * Preferred Constructor
 */
	public BrownBear(int simID, Location l, SubSpecies subSpecies) {
		super(simID, l );
		this.subSpecies = subSpecies;
	}
/**
 * 
 * @return
 */
	public SubSpecies getSubSpecies() {
		return subSpecies;
	}
/**
 * 
 * @param subSpecies
 */
	public void setSubSpecies (SubSpecies subSpecies) {
		this.subSpecies = subSpecies;
	}
/**
 * Method to represent a BrownBear swimming on a grid. Moves a BrownBear object in any direction based on Integer passed to method.
 */
	@Override
	public void swim(int direction) {		
	//capture current location
		int xCurrent = location.getxCoord();
		int yCurrent = location.getyCoord();
			
		//Update this objects location
		if(direction <= 0) {//0 or less
			System.out.println("Invalid direction pick an integer between 1 and 100");
			
		}
		if(direction<=25 && direction > 0) {// 1 - 25 
		Location newLoc = new Location((xCurrent + 2),(yCurrent)) ;
			super.setLocation(newLoc);
		}
		
		if(direction <=50 && direction > 25) {// 26 - 50
			Location newLoc = new Location((xCurrent),(yCurrent +2)) ;
				super.setLocation(newLoc);
				
		}
		if(direction <=75 && direction > 50) {//51-75
			Location newLoc = new Location((xCurrent - 2),(yCurrent)) ;
				super.setLocation(newLoc);
		 }	
		
		if(direction <=100 && direction > 75) {
			Location newLoc = new Location((xCurrent),(yCurrent-2)) ;
				super.setLocation(newLoc);
		}
		if(direction > 100) {
			System.out.println("Invalid direction pick an integer between 1 and 100");
		}	
	}
/**
 * Method to represent a BrownBear Walking on a grid. Moves a BrownBear object in any direction based on Integer passed to method.		
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
				Location newLoc = new Location((xCurrent + 3),(yCurrent)) ;
					super.setLocation(newLoc);
				}
				
				if(direction <=50 && direction > 25) {// 26 - 50
					Location newLoc = new Location((xCurrent),(yCurrent +3)) ;
						super.setLocation(newLoc);
						
				}
				if(direction <=75 && direction > 50) {//51-75
					Location newLoc = new Location((xCurrent - 3),(yCurrent)) ;
						super.setLocation(newLoc);
				 }	
				
				if(direction <=100 && direction > 75) {
					Location newLoc = new Location((xCurrent),(yCurrent-3)) ;
						super.setLocation(newLoc);
				}
				if(direction > 100) {
					System.out.println("Invalid direction pick an integer between 1 and 100");
				}
	}			
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
							+ ", rested=" + rested + "]";
				}
				
	}
