import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class UniqueRunner
{
	//constants for input and output files
	public static final String INPUT_FILE = "./tests/test.txt";
	public static final String OUTPUT_FILE = "./tests/output.txt";

	public static void main(String args[]) throws IOException
	{
		//Construct uld
		UniqueLetterDeterminer uld = new UniqueLetterDeterminer();

		try
		{
			//get input and output files
			File in = new File(INPUT_FILE);
			File out = new File(OUTPUT_FILE);

			//create new output file if it doesn't exist
			if(!out.exists())
				out.createNewFile();

			BufferedWriter output = new BufferedWriter(new FileWriter(out));

			//create scanner
			Scanner scan = new Scanner(in);

			//read from input file and write to output file
			while (scan.hasNextLine())
			{
				String word = scan.nextLine();
				uld.setWord(word);
				if(uld.isUnique())
					output.write("true");
				else
					output.write("false");
				output.newLine();
				uld.resetTable();
			}
			output.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}