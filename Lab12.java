import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab12 extends JFrame implements ActionListener {
    // class varlabie
    Container c;
    JTextField textField;
    Font font = new Font("Courier New", Font.BOLD, 20);
    JButton btn[];
    int maxBtn = 10;

    public Lab12() {
        super("Calculator");
        setSize(280, 250);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        textField = new JTextField(16);
        textField.setFont(font);
        c.add(textField);
        btn = new JButton[maxBtn];
        for (int n = 0; n < maxBtn; n++) {
            btn[n] = new JButton(" " + n + " ");
            btn[n].setFont(font);
            btn[n].addActionListener(this);
            c.add(btn[n]);
        }
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn[0]) {
            textField.setText(textField.getText() + "0");
        } else if (event.getSource() == btn[1]) {
            textField.setText(textField.getText() + "1");
        } else if (event.getSource() == btn[2]) {
            textField.setText(textField.getText() + "2");
        } else if (event.getSource() == btn[3]) {
            textField.setText(textField.getText() + "3");
        } else if (event.getSource() == btn[4]) {
            textField.setText(textField.getText() + "4");
        } else if (event.getSource() == btn[5]) {
            textField.setText(textField.getText() + "5");
        } else if (event.getSource() == btn[6]) {
            textField.setText(textField.getText() + "6");
        } else if (event.getSource() == btn[7]) {
            textField.setText(textField.getText() + "7");
        } else if (event.getSource() == btn[8]) {
            textField.setText(textField.getText() + "8");
        } else if (event.getSource() == btn[9]) {
            textField.setText(textField.getText() + "9");
        }
    }

    public static void main(String[] args) {
        new Lab12();
    }
}