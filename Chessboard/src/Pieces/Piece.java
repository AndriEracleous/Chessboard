package Pieces;

import Game.Coordinate;

/**
 * Created on 29/01/2022
 * @author Andri Eracleous 
 * 
 */
public abstract class Piece {

	Coordinate coords;
	boolean isWhite;
	
	/**
	 * Constructor
	 * @param coords
	 * @param isWhite
	 */
	public Piece(Coordinate coords, boolean isWhite) {
		this.coords = coords;
		this.isWhite = isWhite;
	}
	
	/**
	 * Set coordinates
	 * @param coords
	 */
	public void setCoords(Coordinate coords) {
		this.coords = coords;
	}
	
	/**
	 * Set Color
	 * @param isWhite
	 */
	public void setColor(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	/**
	 * Get Coordinates
	 * @return coords
	 */
	public Coordinate getCoords() {
		return this.coords;
	}
	
	/**
	 * Get Color
	 * @return isWhite
	 */
	public boolean getColor() {
		return this.isWhite;
	}

}
