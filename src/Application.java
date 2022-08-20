import java.util.ArrayList;
/**
 * 
 * @author sells
 * @version 1.0
 * @summary 
 * The Application class is used to test all of the other classes in the package.
 * The constructors, methods, getters, setters, and toStrings for Location, Animal,Goldfinch, and BrownBear are all tested below.
 * Due to Animal being abstract the lines 41 through 44 will need to commented out to successfully run the program. 
 * An ArrayList of Animal objects has been created and tested. 
 * 
 */
public class Application {

	public static void main(String[] args) {
		System.out.println("*****************************************");
		System.out.println("	     Location Test");
		System.out.println("\n");
		
		Location L1 = new Location();
		System.out.println(L1 + " Create location 1" + "\n");
		
		Location L2 = new Location(10,10);
		System.out.println(L2 + " Create location 2" + "\n");
		
		L1.update(2, 2);
		System.out.println(L1 + " Update location 1" + "\n");
		
		L1.getCoordinates();
		System.out.println("L1.getCoordinates returns an array of coordinates with xCoord then yCoord above."+ "\n");
		
		System.out.println("\n");
		System.out.println("*****************************************");
		
		System.out.println("\n");
		System.out.println("*****************************************");
		System.out.println("	     Animal Test");
		System.out.println("\n");
		
		//Comment everything from line 41 to 44 to run program proving Animal is abstract and cannot instantiate
		Animal A1 = new Animal(); 
		Animal A2 = new Aniaml(001, L1);
		A1.eat();
		A1.sleep();
		
		System.out.println("\n");
		System.out.println("*****************************************");
	
		System.out.println("\n");
		System.out.println("*****************************************");
		System.out.println("	     Goldfinch Test");
		System.out.println("\n");
	
		Goldfinch GF1 = new Goldfinch();
		System.out.println(GF1 + " Create Goldfinch 1" + "\n");
	
		Goldfinch GF2 = new Goldfinch(002,L1, 5.5);
		System.out.println(GF2 + " Create Goldfinch 2" + "\n");
		//Walk
		GF1.walk(0);
		System.out.println("Directions 0 or less are not valid and will return the statement above." + "\n");
		
		GF1.walk(25);
		System.out.println(GF1 + " move the object 1 unit on x plane" + "\n");
		
		GF1.walk(50);
		System.out.println(GF1 + " move the object 1 unit on y plane" + "\n");
		
		GF1.walk(75);
		System.out.println(GF1 + " move the object -1 unit on x plane" + "\n");
		
		GF1.walk(100);
		System.out.println(GF1 + " move the object -1 unit on x plane" + "\n");
		
		GF1.walk(101);
		System.out.println("Directions above 100 are not valid and will return the statement above." + "\n");
		
		//Fly
		System.out.println(GF1 + "Shows Staring position of GF1" + "\n");
		Location FinchFlyTO = new Location(34,55);
		GF1.fly(FinchFlyTO);
		System.out.println(GF1 + "Shows new position of GF1" + "\n");
		
		//eat
		System.out.println(GF1.eat());
		System.out.println(GF1 + "Shows if object is Full or not" + "\n");
		
		//sleep
		System.out.println(GF1.sleep());
		System.out.println(GF1 + "Shows if object is rested or not" + "\n");
		
		System.out.println("\n");
		System.out.println("*****************************************");
		
		System.out.println("\n");
		System.out.println("*****************************************");
		System.out.println("	     BrownBear Test");
		System.out.println("\n");
		
		BrownBear BB1 = new BrownBear();
		System.out.println(BB1 + " Create BrownBear 1" + "\n");
	
		BrownBear BB2 = new BrownBear(003,L1,SubSpecies.Kodiak);
		System.out.println(BB2 + " Create BrownBear 2" + "\n");
		//Walk
		BB2.walk(0);
		System.out.println("Directions 0 or less are not valid and will return the statement above." + "\n");
		
		BB2.walk(25);
		System.out.println(BB2 + " move the object 3 unit on x plane" + "\n");
		
		BB2.walk(50);
		System.out.println(BB2 + " move the object 3 unit on y plane" + "\n");
		
		BB2.walk(75);
		System.out.println(BB2 + " move the object -3 unit on x plane" + "\n");
		
		BB2.walk(100);
		System.out.println(BB2 + " move the object -3 unit on x plane" + "\n");
		
		BB2.walk(101);
		System.out.println("Directions above 100 are not valid and will return the statement above." + "\n");
		
		//Swim
		BB2.swim(0);
		System.out.println("Directions 0 or less are not valid and will return the statement above." + "\n");
		
		BB2.swim(25);
		System.out.println(BB2 + " move the object 2 unit on x plane" + "\n");
		
		BB2.swim(50);
		System.out.println(BB2 + " move the object 2 unit on y plane" + "\n");
		
		BB2.swim(75);
		System.out.println(BB2 + " move the object -2 unit on x plane" + "\n");
		
		BB2.swim(100);
		System.out.println(BB2 + " move the object -2 unit on x plane" + "\n");
		
		BB2.swim(101);
		System.out.println("Directions above 100 are not valid and will return the statement above." + "\n");
		
		//eat
		System.out.println(BB2.eat());
		System.out.println(BB2 + "Shows if object is Full or not" + "\n");
		
		//sleep
		System.out.println(BB2.sleep());
		System.out.println(BB2 + "Shows if object is rested or not" + "\n");
		
		System.out.println("\n");
		System.out.println("*****************************************");
		
		System.out.println("\n");
		System.out.println("*****************************************");
		System.out.println("	     Generics Test");
		System.out.println("\n");
	
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
	
		AnimalList.add(GF1);
		AnimalList.add(GF2);
		AnimalList.add(BB1);
		AnimalList.add(BB2);
		
		for(int i = 0; i < AnimalList.size(); i++){
	        System.out.print(AnimalList.get(i) + "\n");
		}
		
		System.out.println("\n");
		System.out.println("*****************************************");
		}
	}
	
