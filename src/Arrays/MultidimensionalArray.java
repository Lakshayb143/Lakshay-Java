

public class MultidimensionalArray
{
	public static void main(String[] args)
	{
		// This is a file for creating a multidimensional array 
		// 2D Array.
		// int[] marks -- A 1-D Array
		// int[][] flats -- A 2-D Array

		int [][] flats = new int [2][3];
		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201; 
		flats[1][1] = 202;
		flats[1][2] = 203;

		// Displaying / Traversal a 2-D Array.
		for ( int i = 0 ; i<flats.length ; i++)
		{	
			for ( int j = 0 ; j<flats[i].length ; j++)
			{	System.out.print(flats[i][j]);
				System.out.print(" ");
			}

			System.out.println("");

		}

	
		// Another way of declaring 2D Array.
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},	
                           {0, 0, 0}};




	}

}