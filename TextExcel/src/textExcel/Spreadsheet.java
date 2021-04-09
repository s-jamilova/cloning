package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell[][] c;
	private int x;
	private int y;
	public Spreadsheet() {

		x = 12;
		y = 20;
		c = new Cell[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				c[i][j] = new EmptyCell();
			}
		}
	}
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		if (command.equals("")) {
			return "";
		}

		else if(command.equals("clear")){
			c = new Cell[20][12];
			for(int x = 0; x < c.length; x++) {
				for(int y = 0; y < c[x].length; y++) {
					c[x][y] = new EmptyCell();
				}
			}
			return getGridText();
		}
		else if (command.cointains("\"")) {
			Location loc = new SpreadsheetLocation(Helper.assignmentCellReference(command));// everything before the
			// equals sign
			String stringValue = Helper.assignmentTextValue(command); // everything after the equals sign
			stringValue = stringValue.replaceAll("\"", "");// remove quotation marks.
			c[loc.getRow()][loc.getCol()] = new TextCell(stringValue);// Assign the location to be a new text cell
	
			return getGridText();// after mutating c, return the updated c
		}
		return "";


	}

	public int getRows()
	{
		// TODO Auto-generated method stub
		return c.length;
	}

	public int getCols()
	{
		// TODO Auto-generated method stub
		return c[0].length;
	}

	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		if (loc.getRow() < 0 || loc.getRow() >= getRows() ||
				loc.getCol() < 0 || loc.getCol() >= getCols()) {
			return null;
		}
		return c[loc.getRow()][loc.getCol()];
	}

	public String getGridText()
	{
		// TODO Auto-generated method stub
		String formatted;
		formatted = "   |A         |B         |C         |D         |E         |F         |G         |H         |I         |J         |K         |L         |\n";
		for(int x = 0; x < c.length - 11; x++) {
			String temp = (x+1) + "  |";
			for(int y = 0; y < c[x].length; y++) {
				System.out.println(c[x][y].abbreviatedCellText());
				temp = temp + c[x][y].abbreviatedCellText() + "|";
			}
			formatted = formatted + temp + "\n" ;
		}
		for(int x = 9; x < c.length; x++) {
			String temp = (x+1) + " |";
			for(int y = 0; y < c[x].length; y++) {
				System.out.println(c[x][y].abbreviatedCellText());
				temp = temp + c[x][y].abbreviatedCellText() + "|";
			}
			formatted = formatted + temp + "\n" ;
		}
		return formatted;
	}


	
	// You are free to use this helper method.  It takes a column letter (starting at "A")
	// and returns the column number corresponding to that letter (0 for "A", 1 for "B", etc.)  
	// WARNING!!  If the parameter is not a single, capital letter in the range of your Spreadsheet,
	// bad things might happen!
	public static int getColumnNumberFromColumnLetter(String columnLetter)
	{
		return Character.toUpperCase(columnLetter.charAt(0)) - 'A';
	}

	// You are free to use this helper method.  It takes a column number (starting at 0)
	// and returns the column letter corresponding to that number ("A" for 0, "B" for 1, etc.)
	// WARNING!!  If the parameter is not a number in the range of your Spreadsheet,
	// bad things might happen!
	public static String getColumnLetterFromColumnNumber(int columnNumber)
	{
		return "" + (char) ('A' + columnNumber);
	}
}
