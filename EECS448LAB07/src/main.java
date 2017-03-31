//Code adapted from github.comcseasholtz/eecs448-lab7 for 
//the purposes of this assignment
//Author: Shafeen Hossain
import java.io.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a line");
		if(args.length<2)
		{
			throw new RuntimeException("Expecting a format of ./main input.txt output.txt");
		}
		System.out.println(args.length);
		//File stream
		try
		{
			//command
			BufferedReader inFile = new BufferedReader(new FileReader(new File(args[0])));
			BufferedWriter outFile=new BufferedWriter(new FileWriter(new File(args[1])));
			String n;
			while ((n=inFile.readLine())!=null && (Integer.parseInt(n) > 0))
			{
				Matrix m=new Matrix(Integer.parseInt(n));

				
				double det = m.determinant();
		
				
				if (det != 0)
				{

				}
			}
		}
		catch(FileNotFoundException e)
		{
			throw new RuntimeException("Cannot find file");
		}
		catch(IOException e)
		{
			throw new RuntimeException("Cannot write to file");
		}

		//commands

	}

}
