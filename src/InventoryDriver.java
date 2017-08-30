import oracle.jrockit.jfr.JFR;

import javax.swing.*;

/**
 * Created by S1329044 on 3/31/14.
 */
public class InventoryDriver extends JFrame
{
    public static void main (String[] args)
    {
        // declare our objects
        Inventory   inventory;
        pAddInv     pnlAdd;
        pOrder      pnlOrder;

        JTabbedPane tpDisplay;

        // instantiate our objects
        inventory = new Inventory();
        pnlAdd = new pAddInv();
        pnlOrder = new pOrder();
        tpDisplay = new JTabbedPane(JTabbedPane.BOTTOM);

        // configure our objects
        pnlAdd.setInventory(inventory);
        pnlAdd.setOrderPanel(pnlOrder);

        tpDisplay.addTab("Add Inv", pnlAdd);
        tpDisplay.addTab("Order", pnlOrder);

        /*
        JLabel lbl1 = new JLabel("label #1");
        JLabel lbl2 = new JLabel("label #2");
        JLabel lbl3 = new JLabel("label #3");
        JLabel lbl4 = new JLabel("label #4");
        JLabel lbl5 = new JLabel("label #5");
        JLabel lbl6 = new JLabel("label #6");
        */

        InventoryDriver frmApp = new InventoryDriver();
        frmApp.add(tpDisplay);
        /*
        frmApp.add(lbl1);
        frmApp.add(lbl2);
        frmApp.add(lbl3);
        frmApp.add(lbl4);
        frmApp.add(lbl5);
        frmApp.add(lbl6);
        */
        frmApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmApp.setSize(700,500);
        frmApp.setVisible(true);
    }
}
