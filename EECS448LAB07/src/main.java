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
				for(int i=0;i<Integer.parseInt(n);i++)
				{
					//read in one row
					n=inFile.readLine();
					//split the row individually for each num
					String rowLine[]=n.split(" ");
					for(int j=0;j<rowLine.length;j++)
					{
						m.matrixSet(i,j,Double.parseDouble(rowLine[j]));
					}
				}
				outFile.write("M= ");
				outFile.newLine();
				outFile.write(m.toString());
				
				double det = m.determinant();
				outFile.write("Det(M)=");
				outFile.write(String.valueOf(det));
				outFile.newLine();
				outFile.newLine();
				//Sample code had two endl's so I'm putting two newlines
				
				if (det != 0)
				{
					Matrix inv=m.inverse();
					outFile.write(inv.toString());
					outFile.newLine();
				}
			}
			outFile.write("Done!");
			outFile.newLine();
			outFile.close();
			inFile.close();
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
