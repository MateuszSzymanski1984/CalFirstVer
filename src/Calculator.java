import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Calculator {
    private JPanel Calculator;
    private JTextField txDisplay;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton ACButton;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;
    double a, b, result;
    String op;
    public Calculator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText("");

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txDisplay.setText(txDisplay.getText() + a00Button.getText());
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txDisplay.getText().contains("."))
                {
                    double pm = Double.parseDouble(txDisplay.getText());
                    pm = pm*-1;
                    txDisplay.setText(String.valueOf(pm));

                }else
                {
                 long PM = Long.parseLong(txDisplay.getText());
                 PM = PM*-1;
                 txDisplay.setText(String.valueOf(PM));
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txDisplay.getText().contains("."))
                {
                    txDisplay.setText(txDisplay.getText() + button20.getText());
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(txDisplay.getText());
            op = "+";
            txDisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txDisplay.getText());
                op = "-";
                txDisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txDisplay.getText());
                op = "*";
                txDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txDisplay.getText());
                op = "/";
                txDisplay.setText("");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String backspace = null;
              if (txDisplay.getText().length() > 0)
              {
                  StringBuilder strB = new StringBuilder(txDisplay.getText());
                  strB.deleteCharAt(txDisplay.getText().length() - 1);
                  backspace = String.valueOf(strB);
                  txDisplay.setText(backspace);
              }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txDisplay.getText());
                if (op == "+") {
                    result = a + b;
                    txDisplay.setText(String.valueOf(result));
                } else if (op == "-")
                {
                    result = a - b;
                    txDisplay.setText(String.valueOf(result));
                } else if (op == "*")
                {
                    result = a * b;
                txDisplay.setText(String.valueOf(result));
                } else if(op == "/")
                {
                    result = a/b;
                    txDisplay.setText(String.valueOf(result));
                }
            {

            }

            {
            }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
