package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    ButtonGroup Grouped;



public FoodOrderGUI() {


    Grouped = new ButtonGroup();

    Grouped.add(rbNone);
    Grouped.add(rb5);
    Grouped.add(rb10);
    Grouped.add(rb15);




    btnOrder.addActionListener(e -> {


try {
    double discount;
    double total;
    double sum = 0;


    if (cPizza.isSelected()) {
        sum += 100;
    }

    if (cBurger.isSelected()) {
        sum += 80;
    }

    if (cFries.isSelected()) {
        sum += 65;
    }

    if (cSoftDrinks.isSelected()) {
        sum += 55;
    }

    if (cTea.isSelected()) {
        sum += 50;
    }

    if (cSundae.isSelected()) {
        sum += 40;
    }


    if (rbNone.isSelected()) {

        JOptionPane.showMessageDialog(null, String.format("The total price is %.2f", sum));

    } else if (rb5.isSelected()) {

        discount = (sum * 5) / 100;
        total = sum - discount;

        JOptionPane.showMessageDialog(null, String.format("The total price is %.2f", total));

    } else if (rb10.isSelected()) {

        discount = (sum * 10) / 100;
        total = sum - discount;

        JOptionPane.showMessageDialog(null, String.format("The total price is %.2f", total));
    } else if (rb15.isSelected()) {

        discount = (sum * 15) / 100;
        total = sum - discount;

        JOptionPane.showMessageDialog(null, String.format("The total price is %.2f", total));

    }

} catch (Exception g) {
    JOptionPane.showMessageDialog(null, "Bruh");
}


    });
}


    public static void main(String[] args) {
        FoodOrderGUI food = new FoodOrderGUI();

        food.setContentPane(food.panel1);
        food.setTitle("Food Ordering System");
        food.setSize(700,700);
        food.setVisible(true);
        food.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
