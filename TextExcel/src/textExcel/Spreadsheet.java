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
		return null;
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
