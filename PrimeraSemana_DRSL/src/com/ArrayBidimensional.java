package com;

public class ArrayBidimensional {

	public static void main(String[] args) 
	{
		int [][] matrix = new int[4][3];  
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;

		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		matrix[3][0] = 7;
		matrix[3][1] = 8;
		matrix[3][2] = 9;


		int [][] matrix2 = {{1,2,3},{4,5,6},{7,8,9},{0,1,2}};
		
		for (int i = 0; i < matrix2.length; i++) 
		{
			System.out.println();
			for (int j = 0; j < matrix2[i].length; j++) 
			{
				System.out.print(matrix2[i][j]);
			}
		}

	}

}
