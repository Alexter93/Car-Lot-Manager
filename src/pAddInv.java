import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by S1329044 on 3/31/14.
 */
public class pAddInv extends JPanel implements ActionListener
{
    // declare our objects
    private Inventory   inventory;    //don't instantiate here - get it later by REF
    private pOrder      pnlOrder;

    private JLabel      lblMake;
    private JLabel      lblName;
    private JLabel      lblColor;
    private JLabel      lblNumDoors;
    private JLabel      lblNumCylinders;
    private JLabel      lblPrice;

    private JTextField  txtMake;
    private JTextField  txtName;
    private JTextField  txtColor;
    private JTextField  txtNumDoors;
    private JTextField  txtNumCylinders;
    private JTextField  txtPrice;

    private JButton     btnAddItem;
    private JTextField  txtDisplay;

    private JPanel      ROW1;
    private JPanel      ROW2;
    private JPanel      ROW3;
    private JPanel      ROW4;
    private JPanel      ROW5;
    private JPanel      ROW6;
    private JPanel      ROW7;
    private JPanel      ROW8;

    public String tempOutput;

    public pAddInv()
    {
        // instantiate out objects
        lblMake = new JLabel("Car's Make");
        lblName = new JLabel("Car's Name");
        lblColor = new JLabel("Car's Color");
        lblNumDoors = new JLabel("Number of Doors");
        lblNumCylinders = new JLabel("Number of Cylinders");
        lblPrice = new JLabel("Car's Price");

        txtMake = new JTextField(20);
        txtName = new JTextField(20);
        txtColor = new JTextField(20);
        txtNumDoors = new JTextField(20);
        txtNumCylinders = new JTextField(20);
        txtPrice = new JTextField(20);

        btnAddItem = new JButton("Add to Motor Pool");
        txtDisplay = new JTextField(40);
        ROW1 = new JPanel();
        ROW2 = new JPanel();
        ROW3 = new JPanel();
        ROW4 = new JPanel();
        ROW5 = new JPanel();
        ROW6 = new JPanel();
        ROW7 = new JPanel();
        ROW8 = new JPanel();

        // configure our object
        txtPrice.setActionCommand("additem");
        btnAddItem.setActionCommand("additem");
        txtPrice.addActionListener(this);
        btnAddItem.addActionListener(this);

        ROW1.add(lblMake);
        ROW1.add(txtMake);
        ROW2.add(lblName);
        ROW2.add(txtName);
        ROW3.add(lblColor);
        ROW3.add(txtColor);
        ROW4.add(lblNumDoors);
        ROW4.add(txtNumDoors);
        ROW5.add(lblNumCylinders);
        ROW5.add(txtNumCylinders);
        ROW6.add(lblPrice);
        ROW6.add(txtPrice);
        ROW7.add(btnAddItem);
        ROW8.add(txtDisplay);

        setLayout(new GridLayout(8,1));
        add(ROW1);
        add(ROW2);
        add(ROW3);
        add(ROW4);
        add(ROW5);
        add(ROW6);
        add(ROW7);
        add(ROW8);



        /*
        //can't just add things ... default is a FLOW LAYOUT
        add(lblNumber);
        add(lblName);
        add(lblCost);
        add(txtNumber);
        add(txtName);
        add(txtCost);
        add(btnAddItem);
        add(txtDisplay);
        */
    }

    public void setInventory(Inventory i)
    {
        inventory = i;
    }

    public void setOrderPanel(pOrder p)
    {
        pnlOrder = p;
    }

    @Override
    public void actionPerformed(ActionEvent evt)
    {
        String s1;
        String s2;
        String s3;
        int i1;
        int i2;
        double d;

        if (evt.getActionCommand().equals("additem"));
        {
            try
            {
                txtDisplay.setText("");

                s1 = txtMake.getText();
                s2 = txtName.getText();
                s3 = txtColor.getText();
                i1 = Integer.parseInt(txtNumDoors.getText());
                i2 = Integer.parseInt(txtNumCylinders.getText());
                d = Double.parseDouble(txtPrice.getText());

                inventory.addItem(s1, s2, s3, i1, i2, d);
                txtDisplay.setText(inventory.getLastItem());

                tempOutput = inventory.getLastItem();

                //pnlOrder.doSomething();
                pnlOrder.addCar(s1, s2, s3, i1, i2, d);
            }
            catch (InventoryException ex)
            {
                txtDisplay.setText(ex.toString());
            }
            catch (NumberFormatException ex)
            {
                txtDisplay.setText("Please type valid number");
            }
            catch (Exception ex)
            {
                txtDisplay.setText(ex.toString());
            }

        }
    }
}
