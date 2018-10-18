package matrix;

import java.sql.Array;
import java.util.Arrays;

public class Matrix_main 
{
	public static void main(String[] args) 
	{
		double[][] a = { { 1 , 2 } , { -1 , 1 } };
		double[][] b = { { 3 , -1 } , { 2 , 1 } };
		
		Matrix_lib mlib = new Matrix_lib();
		System.out.println( "Transpose = " + Arrays.deepToString( mlib.getTranspose( a ) ) );
		System.out.println( "Product = " + Arrays.deepToString( mlib.getProduct( a , b ) ) );
		
		double c[][] = { { 3, 1, 1, 2 },{ 5, 1, 3, 4 },{ 2, 0, 1, 0 },{ 1, 3, 2, 1 }};
		System.out.println("Cofactor = "+ (mlib.getCofactor(c)));
		
		double d[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, -1 }, { 1, 1, -1, 1 }, { 1, -1, 1, 1 } };
		double e[] = { 0, 4, -4, 2 };
		System.out.println("Solution = "+ Arrays.toString(mlib.getSolution(d, e)));

	}
}