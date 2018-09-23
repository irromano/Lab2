package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {	

	private int iSize;	// Lenght of the width/height of the Sudoku puzzle
	private int iSqrtSize; // SquareRoot of the iSize. If the iSize is 9, iSqrtSize will be calcd as 3

	//public Sudoku() {
		//super();
		//  Auto-generated constructor stub
	//}

	public Sudoku(int[][] puzzle) {
		super.setLatinSquare(puzzle);
		iSize = super.getLatinSquare()[0].length;
		iSqrtSize = (int) Math.sqrt(super.getLatinSquare()[0].length);

	}

	protected int[][] getPuzzle() {
		// TODO
		return super.getLatinSquare();
	}

	protected int[] getRegion(int iCol, int iRow) { // figure out what region you're in based on iCol and iRow
		// TODO
		return null; // 1-dim array from a given region 
	}
	
	public int[] getRegion(int r) { // pass in a given region, get back a 1-dim array of region
		int[] reg = new int [iSize];
		
		int i = ( r % iSqrtSize)* iSqrtSize;
		int j = (r / iSqrtSize)* iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		int iCnt=0;
		
		for (; j<jMax ; j++) {
			for (i=(r% iSqrtSize)* iSqrtSize ; i<iMax;i++) {
				reg[iCnt++]= super.getLatinSquare()[j][i];
			}
		}
		return reg;
		
		
		 // 1-dim array from given region
		
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