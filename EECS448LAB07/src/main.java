import java.io.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a line");
		if(args.length<3)
		{
			throw new RuntimeException("Expecting a format of ./main input.txt output.txt");
		}
	}

}
