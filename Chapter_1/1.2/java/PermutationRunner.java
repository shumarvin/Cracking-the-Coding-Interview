import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class PermutationRunner
{
	//constants for input and output files
	public static final String INPUT_FILE = "./tests/test.txt";
	public static final String OUTPUT_FILE = "./tests/output.txt";

	public static void main(String args[]) throws IOException
	{
		//Construct pc
		PermutationChecker pc = new PermutationChecker();

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
				//get words
				String[] words = scan.nextLine().split(" ");
				for(int i = 0; i < 2; i++)
					System.out.println(words[i]);
				pc.setWord1(words[0]);
				pc.setWord2(words[1]);
				if(pc.isPermutation())
					output.write("true");
				else
					output.write("false");
				output.newLine();
			}
			output.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}