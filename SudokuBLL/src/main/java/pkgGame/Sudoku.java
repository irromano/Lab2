package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {	

	private int[][] puzzle;	
	private int iSize;	// Lenght of the width/height of the Sudoku puzzle
	private int iSqrtSize; // SquareRoot of the iSize. If the iSize is 9, iSqrtSize will be calcd as 3

	//public Sudoku() {
		//super();
		//  Auto-generated constructor stub
	//}

	public Sudoku(int[][] latinSquare) {
		super(latinSquare);
		// TODO Auto-generated constructor stub
	}

	protected int[][] getPuzzle() {
		// TODO
		return puzzle;
	}

	protected int[] getRegion(int iCol, int iRow) { // figure out what region you're in based on iCol and iRow
		// TODO
		return null; // 1-dim array from a given region 
	}
	
	public int[] getRegion(int r) { // pass in a given region, get back a 1-dim array of region
		// TODO
		return null; // 1-dim array from given region
		
	}
	
	public boolean isPartialSudoku() { // return true if it's a LatinSquare, if each element in first row is in each region, if there is at least one zero
		// TODO
		return false; // TODO
	}
	
	public boolean isSudoku() { // is a partial sudoku and has no zeros
		// TODO
		return false; //TODO
	}
	
	public boolean isValidValue(int iCol, int iRow, int iValue) { // test to see if given value would work for a given column / row
		// TODO
		return false; //TODO
	}
	

}