package Game;

import java.util.*;
import Pieces.Knight;
import Exceptions.ArrayIndexOutOfBoundsException;
import Exceptions.InvalidInputException;

/**
 * Created on 29/01/2022
 * @author Andri Eracleous 
 * 
 */
public class Main {

	public static int N = 8;
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, InvalidInputException {
	    displayChessboard();
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter the Origin Point: ");
	    String orgPoint = sc.next();    
	    System.out.print("Enter the Destination Point: ");
	    String destPoint = sc.next();
	    
	    sc.close();
	    
	    Game chess = new Game();
	    Coordinate startPoint = new Coordinate();
	    Coordinate endPoint = new Coordinate();
	    startPoint = startPoint.convertStringToCoordinate(orgPoint.toUpperCase());
	    endPoint = endPoint.convertStringToCoordinate(destPoint.toUpperCase());
	    
	    checkForInvalidInputs(orgPoint,destPoint, startPoint, endPoint);
	    
	    Knight knightPiece = new Knight(startPoint, false);
	    knightPiece.findMinPath(chess, startPoint, endPoint);   
	}
	
	/**
	 * Check for invalid inputs and throws the necessary exceptions
	 * @param orgPoint
	 * @param destPoint
	 * @param startPoint
	 * @param endPoint
	 * @throws ArrayIndexOutOfBoundsException
	 * @throws InvalidInputException
	 */
	public static void checkForInvalidInputs(String orgPoint, String destPoint, Coordinate startPoint, Coordinate endPoint) throws ArrayIndexOutOfBoundsException,InvalidInputException {
		if (orgPoint.length()>2 || destPoint.length()>2) {
			String msg= "InvalidInputException";
	    	throw new InvalidInputException(msg);
		}
		
		if (startPoint.getX() == -1 || startPoint.getY()<0 || startPoint.getY()>=N || 
				endPoint.getX() == -1 || endPoint.getY()<0 || endPoint.getY()>=N ) {	
			String msg= "ArrayIndexOutOfBoundsException";
	    	throw new ArrayIndexOutOfBoundsException(msg);
		}
	}
	
	/**
	 * Display Chessboard
	 */
	public static void displayChessboard() {
		System.out.print("             Welcome!");
		for (int i=0; i<N; i++) {
		      System.out.println("");
		      System.out.println("----------------------------------");

		      System.out.print(N-i);
		      for (int j=0; j<N; j++) {
		          System.out.print("| " + " " + " ");
		      }       
		      System.out.print("|");
		 }
		 System.out.println("");
		 System.out.println("----------------------------------");
		 System.out.println("   A   B   C   D   E   F   G   H ");
		 System.out.println();
	}
	
}
