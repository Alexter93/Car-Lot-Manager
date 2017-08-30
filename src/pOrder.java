import javax.swing.*;

/**
 * Created by S1329044 on 3/31/14.
 */
public class pOrder extends JPanel
{
    // declare our objects
    private Inventory inventory;    //don't instantiate here - get it later by REF
    private pAddInv pnlAddInv;

    JScrollPane spOrder;
    JTextArea   taOrder;

    String output = "";

    JPanel ROW1;

    public pOrder()
    {
        taOrder = new JTextArea(5,40);
        spOrder = new JScrollPane(taOrder);
        ROW1 = new JPanel();
        ROW1.add(spOrder);
        add(ROW1);
    }

    public void doSomething()
    {
        taOrder.setText("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
    }

    public void addCar(String s1, String s2, String s3, int i1, int i2, double d)
    {
        output += "Make: " + s1 +
                " / Model: " + s2 +
                " / Color: " + s3 +
                " / " + i1 + " Door" +
                " / " + i2 + " Cylinder" +
                " / $" + d + "\n";
        taOrder.setText(output);
    }

    public void setInventory(Inventory i)
    {
        inventory = i;
    }
}
