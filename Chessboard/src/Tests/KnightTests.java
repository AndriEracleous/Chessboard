package Tests;

import org.junit.jupiter.api.Test;

import Game.Coordinate;
import Game.Game;
import Pieces.Knight;

/**
 * Created on 29/01/2022
 * @author Andri Eracleous 
 * 
 */
public class KnightTests {

	@Test
	public void downLeftMovement() throws Exception {
		Game chess = new Game();
		Coordinate orgCoords = new Coordinate(2,2);
		Coordinate destCoords = new Coordinate(1,0);
		boolean isWhite = false;
		Knight k = new Knight(orgCoords, isWhite);
		System.out.println("Test for Down Left Movement C3 -> B1");
		k.findMinPath(chess, orgCoords, destCoords);
		System.out.println("*******************************************");
	}
	
	@Test
	public void downRightMovement() throws Exception{
		Game chess = new Game();
		Coordinate orgCoords = new Coordinate(2,2);
		Coordinate destCoords = new Coordinate(3,0);
		boolean isWhite = false;
		Knight k = new Knight(orgCoords, isWhite);
		System.out.println("Test for Down Right Movement C3 -> D1");
		k.findMinPath(chess, orgCoords, destCoords);
		System.out.println("*******************************************");
	}
	
	@Test
	public void upLeftMovement() throws Exception{
		Game chess = new Game();
		Coordinate orgCoords = new Coordinate(2,2);
		Coordinate destCoords = new Coordinate(1,4);
		boolean isWhite = false;
		Knight k = new Knight(orgCoords, isWhite);
		System.out.println("Test for Up Left Movement C3 -> B5");
		k.findMinPath(chess, orgCoords, destCoords);
		System.out.println("*******************************************");
	}
	
	@Test
	public void upRightMovement() throws Exception{
		Game chess = new Game();
		Coordinate orgCoords = new Coordinate(2,2);
		Coordinate destCoords = new Coordinate(3,4);
		boolean isWhite = false;
		Knight k = new Knight(orgCoords, isWhite);
		System.out.println("Test for Up Right Movement C3 -> D5");
		k.findMinPath(chess, orgCoords, destCoords);
		System.out.println("*******************************************");
	}
	
	@Test
	public void moveWithTwoMoves() throws Exception{
		Game chess = new Game();
		Coordinate orgCoords = new Coordinate(0,0);
		Coordinate destCoords = new Coordinate(2,4);
		boolean isWhite = false;
		Knight k = new Knight(orgCoords, isWhite);
		System.out.println("Test for two movements A1 -> C5");
		k.findMinPath(chess, orgCoords, destCoords);
		System.out.println("*******************************************");
	}
	
	@Test
	public void moveWithThreeMoves() throws Exception{
		Game chess = new Game();
		Coordinate orgCoords = new Coordinate(4,0);
		Coordinate destCoords = new Coordinate(5,6);
		boolean isWhite = false;
		Knight k = new Knight(orgCoords, isWhite);
		System.out.println("Test for three movements E1 -> F7");
		k.findMinPath(chess, orgCoords, destCoords);
		System.out.println("*******************************************");
	}
	
	@Test
	public void moreThanThreeMoves() throws Exception{
		Game chess = new Game();
		Coordinate orgCoords = new Coordinate(0,0);
		Coordinate destCoords = new Coordinate(7,7);
		boolean isWhite = false;
		Knight k = new Knight(orgCoords, isWhite);
		System.out.println("Test for more than three movements A1 -> H8");
		k.findMinPath(chess, orgCoords, destCoords);
		System.out.println("*******************************************");
	}
}
