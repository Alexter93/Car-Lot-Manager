/**
 * Created by S1329044 on 3/31/14.
 */
public class InventoryException extends Exception
{
    private String sError;

    //constructors
    public InventoryException()
    {
        sError = "Unknown Inventory Error Occurred";
    }
    public InventoryException(String sError)
    {
        super(sError);
        this.sError = sError;
    }

    //method
    public String toString()
    {
        return sError;
    }
}
