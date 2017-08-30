import java.awt.event.InvocationEvent;

/**
 * Created by S1329044 on 3/31/14.
 */
public class Inventory
{
    private InventoryItem[] invItems;
    private final int MAX = 100;
    private int count;

    public Inventory()
    {
        invItems = new InventoryItem[MAX];
        count = 0;
    }

    public int getCount()
    {
        return count;
    }

    public void addItem(String make, String model, String color, int numDoors, int numCylinders, double price) throws InventoryException
    {
        if (count < MAX)
        {
            invItems[count] = new InventoryItem(make, model, color, numDoors, numCylinders, price);
            count++;
        }
        else
        {
            throw new InventoryException("MAX inventory reached");
        }
    }
    public String getLastItem()
    {
        return invItems[count-1].toString();
    }
}
