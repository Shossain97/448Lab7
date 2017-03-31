//Code adapted from github.com/cseasholtz/eecs448-lab7 for 
//the purposes of this assignment
//Author: Shafeen Hossain
import java.lang.Math;
public class Matrix {
	//Max size of matrix
	public static final int MaxSize=10;
	//size of current matrix
	private int n;
	//The matrix values
	private double[][] mdata=new double[MaxSize][MaxSize];
	public Matrix(int _n)
	{
		this.n=_n;
	}
	//Determinant Calculation
	public double determinant()
	{
		//Determinant
		double det=0.0;
		if(n==1)
		{
			det=mdata[0][0];
		}
		else if(n==2)
		{
			det = mdata[0][0] * mdata[1][1] - mdata[0][1] * mdata[1][0];
		}
		else
		{
			for (int i = 0; i < n; ++i)
			{
				det += Math.pow(-1.0, (double)i) * mdata[0][i] * subMatrix(0, i).determinant();
			}
		}
		return det;
	}
	//Create a submatrix
	public Matrix subMatrix(int r, int c)
	{
		Matrix sub=new Matrix(n-1);
		int row=0;
		for(int i=0; i<n;++i)
		{
			if(i==r)
			{
				continue;
			}
			
			int col = 0;
			for (int j = 0; j < n; ++j)
			{
				if (j == c) continue;
				
				sub.mdata[row][col] = mdata[i][j];
				++col;
			}
			
			++row;
		}
		return sub;
	}
	//calculate inverse of matrix
	public Matrix inverse()
	{
		Matrix inv=new Matrix(n);
		double det = determinant();
		
		for (int i = 0; i < n; ++i)
		{
			for (int j = 0; j < n; ++j)
			{
				inv.mdata[i][j] = Math.pow(-1.0, (double)i + j) * subMatrix(j, i).determinant() / det;
			}
		}
		
		return inv;
	}
	//A way to populate the matrix
	public void matrixSet(int i, int j, double val)
	{
		mdata[i][j]=val;
	}
	

}
