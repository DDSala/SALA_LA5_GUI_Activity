//Denzel Don L. Sala
package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{

    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;


public LeapYearGUI() {

    btnCheckYear.addActionListener(e -> {

        try {

            int yr;

            yr = Integer.parseInt(tfYear.getText());

            if (yr % 400 == 0) {
                JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
            } else if (yr % 100 == 0) {
                JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");
            } else if (yr % 4 == 0) {
                JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
            } else {
                JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");

            }

        } catch (Exception c) {
                JOptionPane.showMessageDialog(null, "Please enter a Year");
        }

    });
}

    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();

        leap.setContentPane(leap.panel1);
        leap.setTitle("Leap Year Checker");
        leap.setSize(600,300);
        leap.setVisible(true);
        leap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        leap.tfYear.setText(" ");
    }
}
