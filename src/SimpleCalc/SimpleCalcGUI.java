//Denzel Don L. Sala
package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{

    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;

public SimpleCalcGUI() {
    btnCompute.addActionListener(e -> {

    try {

        int a;
        int b;
        int result;

        a = Integer.parseInt(tfNumber1.getText());
        b = Integer.parseInt(tfNumber2.getText());

        if (cbOperations.getSelectedItem().equals("+")) {
            result = (Integer.parseInt(tfNumber1.getText()) + Integer.parseInt(tfNumber2.getText()));
            lblResult.setText(Integer.toString(result));


        } else if (cbOperations.getSelectedItem().equals("-")) {
            result = (Integer.parseInt(tfNumber1.getText()) - Integer.parseInt(tfNumber2.getText()));
            lblResult.setText(Integer.toString(result));


        } else if (cbOperations.getSelectedItem().equals("*")) {
            result = (Integer.parseInt(tfNumber1.getText()) * Integer.parseInt(tfNumber2.getText()));
            lblResult.setText(Integer.toString(result));


        } else if (cbOperations.getSelectedItem().equals("/")) {
            result = (Integer.parseInt(tfNumber1.getText()) / Integer.parseInt(tfNumber2.getText()));
            lblResult.setText(Integer.toString(result));
        }
    } catch (Exception c) {

        JOptionPane.showMessageDialog(null, "Please enter a number");

    }

    });
}


    public static void main(String[] args) {

        SimpleCalcGUI cal = new SimpleCalcGUI();

        cal.setContentPane(cal.panel1);
        cal.setTitle("Simple Calculator");
        cal.setSize(600,300);
        cal.setVisible(true);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cal.cbOperations.addItem("+");
        cal.cbOperations.addItem("-");
        cal.cbOperations.addItem("*");
        cal.cbOperations.addItem("/");

    }
}
