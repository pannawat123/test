import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab11 implements ActionListener {
    JFrame window = new JFrame(" Student Score ");
    Container c;
    // create GUI
    JTextField textField[] = new JTextField[3];
    JLabel label[] = new JLabel[3];
    Font newfont = new Font("Courier New", Font.BOLD, 16);
    int data[][] = new int[20][3];
    String strLabel[] = { " Midterm Score : ", " Final Score : ", "Home Work Score : " };

    JTextField studentNo;
    JButton btnOk, btnAll;

    public Lab11() {
        window = new JFrame(" Student Score ");
        c = window.getContentPane();
        c.setLayout(new FlowLayout());
        studentNo = new JTextField(10);
        btnOk = new JButton(" OK ");
        btnOk.addActionListener(this);
        btnAll = new JButton(" Show All ");
        btnAll.addActionListener(this);
        c.add(new JLabel("Enter Student no : "));
        c.add(studentNo);
        c.add(btnOk);
        c.add(btnAll);
        
        for (int n = 0; n < label.length; n++) {
            label[n] = new JLabel(strLabel[n]);
            label[n].setFont(newfont);
            textField[n] = new JTextField(10);
            textField[n].setEditable(false);
            textField[n].setFont(newfont);
            c.add(label[n]);
            c.add(textField[n]);
            window.setSize(450, 240);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            getData(data);
        }
    }

    public void getData(int data[][]) {
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                data[r][c] = rnd(0, 100);
            }
        }
    }

    public static int rnd(int st, int ed) {
        int offset = ed - st + 1;
        return (st + (int) (Math.random() * offset));
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnOk) {
            String strValue = studentNo.getText();
            int value = Integer.parseInt(strValue);
            displayData(value);
            studentNo.setText("");
        } else if (event.getSource() == btnAll) {
            showAll();
        }
    }

    public void showAll() {
        String str = "";
        for (int r = 0; r < 20; r++) {
            str += " " + r + " = > ";
            for (int c = 0; c < 3; c++) {
                str += "| " + data[r][c] + " |";
            }
            str += "\n";
        }
        JOptionPane.showMessageDialog(null, str);
    }

    public void displayData(int value) {
        for (int n = 0; n < 3; n++) {
            textField[n].setText("" + data[value][n]);
        }
    }

    public static void main(String[] args) {
        Lab11 object = new Lab11();
    }
}