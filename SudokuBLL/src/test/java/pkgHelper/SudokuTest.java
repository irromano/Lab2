package pkgHelper;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

import pkgGame.Sudoku;

public class SudokuTest {

	@Test
	public void getRegion_test1() {

		int[][] arr1 = {{0,1,2,3,4,5,6,7,8}, {10, 11, 12, 13, 14, 15, 16, 17, 18}, {20, 21, 22, 23, 24, 25, 26, 27, 28},
				{30, 31, 32, 33, 34, 35, 36, 37, 38}, {40, 41, 42, 43, 44, 45, 46, 47, 48}, {50, 51, 52, 53, 54, 55, 56, 57, 58},
				{60, 61, 62, 63, 64, 65, 66, 67, 68}, {70, 71, 72, 73, 74, 75, 76, 77, 78}, {80, 81, 82, 83, 84, 85, 86, 87, 88}};
		
		int[] arr1Test = {0,1,2,10,11,12,20,21,22};
		
		Sudoku sud = new Sudoku(arr1);
		
		String intArrayString = Arrays.toString(sud.getRegion(1));
		System.out.println(intArrayString);
		

		
		int[] arrReg = sud.getRegion(1);
		
		//int[][] arr2 = sud.getLatinSquare();
		

		assertTrue(Arrays.equals(sud.getRegion(0), arr1Test));

	}


}
