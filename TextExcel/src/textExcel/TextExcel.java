package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{
 	public static Grid sheet = new Spreadsheet();
	public static void main(String[] args)
	{
	    // Add your command loop here
		String input = "";
		Scanner con = new Scanner(System.in);
		System.out.println(sheet.getGridText());
		input = con.nextLine().trim();
		while(!input.equalsIgnoreCase("quit")){
			System.out.println(sheet.processCommand(input));
			input = con.nextLine();
		}
	}
}

