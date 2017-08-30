/**
 * Created by S1329044 on 3/31/14.
 */
public class InventoryItem
{
    private String make;
    private String model;
    private String color;
    private int numDoors;
    private int numCylinders;
    private double price;

    public InventoryItem()
    {
        this.make = "";
        this.model = "";
        this.color = "";
        this.numDoors = 0;
        this.numCylinders = 0;
        this.price = 0.0;
    }

    public InventoryItem(String make, String model, String color, int numDoors, int numCylinders, double price) throws InventoryException
    {
        setMake(make);
        setModel(model);
        setColor(color);
        setNumDoors(numDoors);
        setNumCylinders(numCylinders);
        setPrice(price);
    }

    //GETTERS
    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String getColor()
    {
        return color;
    }

    public int getNumDoors()
    {
        return numDoors;
    }

    public int getNumCylinders()
    {
        return numCylinders;
    }

    public double getPrice()
    {
        return price;
    }

    //SETTERS
    public void setMake(String make)
    {
        this.make = make;
    }

    public void setModel(String model) { this.model = model; }

    public void setColor(String color)
    {
        this.color = color;
    }

    /*
    public String setInvNumberString()
    {
        return Integer.toString(invNumber);
    }
    */

    public void setNumCylinders(int numCylinders) throws InventoryException
    {
        if (numCylinders == 4 || numCylinders == 6 ||
            numCylinders == 8 || numCylinders == 10)
        {
            this.numCylinders = numCylinders;
        }
        else
        {
            throw new InventoryException("Invalid Number of Cylinders!");
        }
    }

    public void setNumDoors(int numDoors) throws InventoryException
    {
        if (numDoors > 0.0 && numDoors < 5.0)
        {
            this.numDoors = numDoors;
        }
        else
        {
            throw new InventoryException("Invalid Number of Doors!");
        }
    }

    public void setPrice(double price) throws InventoryException
    {
        if (price > 0.0)
        {
        this.price = price;
        }
        else
        {
            throw new InventoryException("Invalid Price!");
        }
    }
    public String toString()
    {
        return "Make: " + make +
                " / Model: " + model +
                " / Color: " + color +
                " / " + numDoors + " Door" +
                " / " + numCylinders + " Cylinder" +
                " / $" + price;
    }
}
