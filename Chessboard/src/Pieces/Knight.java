package Pieces;

import Game.Coordinate;
import Game.Game;

import java.util.*;

/**
 * Created on 29/01/2022
 * @author Andri Eracleous 
 * 
 */
public class Knight extends Piece {

	public static final int minMoves = 3;

	/**
	 * Constructor
	 * @param coords
	 * @param isWhite
	 */
	public Knight(Coordinate coords, boolean isWhite) {
		super(coords, isWhite);
	}

	/**
	 * Check if Knight can move to the destination with minimum moves
	 * @param chess
	 * @param startPoint
	 * @param endPoint
	 */
	public void findMinPath(Game chess, Coordinate startPoint, Coordinate endPoint) {
		// Possible directions in x and y
		int[] xDirection = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int[] yDirection = { 1, 2, 2, 1, -1, -2, -2, -1 };

		Queue<Coordinate> q = new LinkedList<>();
		Set<Coordinate> visited = new HashSet<>();
		ArrayList<ArrayList<Coordinate>> result = new ArrayList<ArrayList<Coordinate>>();

		int qSize = 0;
		int mCounter = 1;
		int N = chess.getDimensions();

		// Add to the queue the start point
		q.add(startPoint);

		while (!q.isEmpty() && mCounter <= minMoves) {
			qSize = q.size();

			// Loop for finding all possible moves
			for (int i = 0; i < qSize; i++) {
				Coordinate p = q.remove();

				if (reachTheDestination(p,endPoint)) {
					displayMinPath(result, startPoint, endPoint);
					return;
				}

				for (int j = 0; j < xDirection.length; j++) {
					int newPointX = p.getX() + xDirection[j];
					int newPointY = p.getY() + yDirection[j];

					Coordinate newCoords = new Coordinate(newPointX, newPointY);

					if (!visited.contains(newCoords) && newPointX >= 0 && newPointY >= 0 && newPointX <= N && newPointY <= N) {
						ArrayList<Coordinate> arr = new ArrayList<Coordinate>();
						q.add(newCoords);
						visited.add(newCoords);
						arr.add(p);
						arr.add(newCoords);
						result.add(arr);
					}
					
					if (reachTheDestination(newCoords, endPoint)) {
						displayMinPath(result, startPoint, endPoint);
						return;
					}
				}
			}
			mCounter++;
		}
		System.out.println("No solution has been found..Please try again.");
	}
	
	/**
	 * Display the minimum path
	 * @param result
	 * @param startPoint
	 * @param endPoint
	 * @param mCounter
	 */
	public void displayMinPath(ArrayList<ArrayList<Coordinate>> result, Coordinate startPoint, Coordinate endPoint) {
		Coordinate c = result.get(result.size() - 1).get(1);
		System.out.println(c.convertCoordinateToString(c));
		
		for (int k=result.size()-1; k>=0; k--) {
			int l=0;
			while (l<=result.get(k).size()) {
				if (result.get(k).get(1).getX() == c.getX() && result.get(k).get(1).getY() == c.getY()) {
					int currentX=result.get(k).get(0).getX();
					int currentY=result.get(k).get(0).getY();			
					c.setX(currentX);
					c.setY(currentY);
					System.out.println(c.convertCoordinateToString(c));
					break;
				}
				l++;
			}
		}
	}
	
	/**
	 * Check if we reach the destination
	 * @param curPoint
	 * @param endPoint
	 * @return
	 */
	public boolean reachTheDestination(Coordinate curPoint, Coordinate endPoint) {
		if (curPoint.getX() == endPoint.getX() && curPoint.getY() == endPoint.getY()) {
			return true;
		}
		return false;
	}

}
