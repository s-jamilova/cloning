public class EmptyCell implements Cell
{
    public EmptyCell()
    {
        super("")
    }
    public String abbreviatedCellText()
    {
        return "          ";
    }
    public String fullCellText()
    {
        return "";
    }
}