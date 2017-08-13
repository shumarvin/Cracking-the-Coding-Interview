import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class UniqueRunner
{
	//constants for input and output files
	public static final String INPUT_FILE = "tests/test.txt";
	public static final String OUTPUT_FILE = "tests/output.txt";

	public static void main(String args[]) throws IOException
	{
		//Construct uld
		UniqueLetterDeterminer uld = new UniqueLetterDeterminer();

		try
		{
			//get input and output files
			File in = new File(INPUT_FILE);
			BufferedWriter out = new BufferedWriter(new FileWriter(OUTPUT_FILE));

			//create scanner
			Scanner scan = new Scanner(in);

			//read from input file and write to output file
			while (scan.hasNextLine())
			{
				uld.setWord(scan.nextLine());
				out.write(uld.isUnique() + "");
				out.newLine();
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}
}