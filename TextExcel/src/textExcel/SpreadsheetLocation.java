package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
    private int col;
    private int row;
    private String[] alph;
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return row;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return col;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
        String strCol;
        String strRow;
        strCol = cellName.substring(0,1);
        strRow = cellName.substring(1,2);
        col = strCol.toLowerCase() - 'a' + 1;
        row = Integer.parseInt(strRow);
    }

}
