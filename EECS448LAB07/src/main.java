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
			BufferedReader inFile = new BufferedReader(new FileReader(new File(args[0])));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			System.out.println("Cannot read file");
		}
		try
		{
			BufferedWriter outFile=new BufferedWriter(new FileWriter(new File(args[1])));
		}
		catch(IOException e)
		{
			System.out.println("Cannot write to file");
		}
		

	}

}
