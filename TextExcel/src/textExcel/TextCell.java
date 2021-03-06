package textExcel;

public class TextCell implements Cell{
    private String text;
    public TextCell(String text)
    {
        this.text = text;
    }
    public String abbreviatedCellText()
    {
        return (text + "            ").substring(0,10);
    }

    public String fullCellText()
    {
        return "\"" + text + "\"";
    }
    public double getDoubleValue(){
        return 0;
    }
    public String cellType() {
        return "TextCell";
    }

}