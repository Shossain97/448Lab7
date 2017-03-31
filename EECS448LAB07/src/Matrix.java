
public class Matrix {
	//Max size of matrix
	public static final int MaxSize=10;
	//size of current matrix
	private int n;
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
			//Code that rerquires submatrix to be made
		}
		return det;
	}
	

}
