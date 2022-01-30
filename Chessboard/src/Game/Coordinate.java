package Game;

/**
 * Created on 29/01/2022
 * @author Andri Eracleous 
 * 
 */
public class Coordinate {
	int x;
	int y;
	
	/**
	 * Default Constructor
	 */
	public Coordinate() {
	}
	
	/**
	 * Constructor
	 * @param x
	 * @param y
	 */
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	/**
	 * Set x
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Set y
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Get x
	 * @return x
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * Get y
	 * @return y
	 */
	public int getY() {
		return this.y;
	}
	
	/**
	 * Convert String to Coordinate
	 * @param point
	 * @return coordinate
	 */
	public Coordinate convertStringToCoordinate(String point) {
		char pointX = point.charAt(0);
		int pointY = Integer.parseInt(String.valueOf(point.charAt(1)));
		int x;
		
		switch(pointX) {
		case 'A': x = 0;
				  break;
		case 'B': x = 1;
		    	  break;
		case 'C': x = 2;
		          break;
		case 'D': x = 3;
		 		  break;
		case 'E': x = 4;
		 		  break;
		case 'F': x = 5;
				  break;
		case 'G': x = 6;
				  break;
		case 'H': x = 7;
		     	  break;
		default: x = -1;
		}
		
		return new Coordinate(x, pointY-1);
	}

	/**
	 * Convert coordinate to string
	 * @param coords
	 * @return String
	 */
	public String convertCoordinateToString(Coordinate coords) {
		int pointX = coords.getX();
		int pointY = coords.getY();
		char x = ' ';
		String y = String.valueOf(pointY+1);
		
		switch(pointX) {
		case 0 :x = 'A';
				  break;
		case 1: x = 'B';
		    	  break;
		case 2: x = 'C';
		          break;
		case 3: x = 'D';
		 		  break;
		case 4: x = 'E';
		 		  break;
		case 5: x = 'F';
				  break;
		case 6: x = 'G';
				  break;
		case 7: x = 'H';
		     	  break;
		default: x = ' ';
		}
		
		return x+y;
	}

}
