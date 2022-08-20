/**
 * 
 * @author sells
 * Class represents a grid and the location of objections created and moved around on a grid inside a simulation
 */
public final class Location{
/**
 * Initiates Variables 
 */
	private int xCoord;
	private int yCoord;
/**
 * Empty constructor  	
 */
	public Location() {
		this.xCoord = 0;
		this.yCoord = 0;
	}
/**
 * 	
 * @param x
 * @param y
 * Preferred constructor
 */
	public Location(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
	}
/**
 * 	
 * @param x
 * @param y
 * @return an updated location  
 */
	public Location update(int x, int y) {
		this.xCoord = x;
		this.yCoord = y;
		return new Location (this.xCoord, this.yCoord);
	}
/**
 * 	
 * @return an array of ints xCoord then yCoord
 */
	public int[] getCoordinates() {
		int[] coords = new int [2];
		for(int i=0;i<coords.length;i++){
			coords [0] = xCoord;
			coords [1] = yCoord;
		System.out.println(coords[i]);
		}
		return coords;
		
	}
/**
 * 		
 * @return
 */
	public int getxCoord() {
		return xCoord;
	}
/**
 * 
 * @param xCoord
 */
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}
/**
 * 
 * @return
 */
	public int getyCoord() {
		return yCoord;
	}
/**
 * 
 * @param yCoord
 */
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}
	
	
	
}
