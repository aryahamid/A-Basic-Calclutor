import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

public class Calclutor {
    JFrame frame;
    JTextField text1,text2;
    JLabel result;
    JButton plus,minus,division,multiplication,reset;
    JPanel panel;

    public Calclutor(){
        frame=new JFrame();
        frame.setTitle("Calclutor");
        ImageIcon image=new ImageIcon("C:\\Users\\Quantum Computer\\OneDrive\\Desktop\\icon.png");
        frame.setIconImage(image.getImage());
        frame.setSize(400,300);
        text1=new JTextField(10);
        text2=new JTextField(10);
        panel=new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        result=new JLabel("Result: 0");
        plus=new JButton("+");
        minus=new JButton("-");
        division=new JButton("/");
        multiplication=new JButton("x");
        reset=new JButton("reset");

        frame.setLayout(new FlowLayout());
        frame.add(text1);
        frame.add(text2);
        frame.add(result);
        panel.add(plus);
        panel.add(minus);
        panel.add(division);
        panel.add(multiplication);
        panel.add(reset);

        frame.add(panel);

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    result.setText("Result: 0");
                    text1.setText("");
                    text2.setText("");

            }
        });
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float n1=Float.parseFloat(text1.getText());
                float n2=Float.parseFloat(text2.getText());
                if((n1+n2)==Math.floor(n1+n2))
                    result.setText("Result: "+ (int)(n1+n2)+"");
                else
                    result.setText("Result: "+ (n1+n2)+"");
            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float n1=Float.parseFloat(text1.getText());
                float n2=Float.parseFloat(text2.getText());
                if((n1-n2)==Math.floor(n1-n2))
                    result.setText("Result: "+ (int)(n1-n2)+"");
                else
                    result.setText("Result: "+ (n1-n2)+"");
            }
        });

        division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float n1=Float.parseFloat(text1.getText());
                float n2=Float.parseFloat(text2.getText());
                if((n1/n2)==Math.floor(n1/n2))
                    result.setText("Result: "+ (int)(n1/n2)+"");
                else
                    result.setText("Result: "+ (n1/n2)+"");
            }
        });

        multiplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float n1=Float.parseFloat(text1.getText());
                float n2=Float.parseFloat(text2.getText());
                if((n1*n2)==Math.floor(n1*n2))
                    result.setText("Result: "+ (int)(n1*n2)+"");
                else
                    result.setText("Result: "+ (n1*n2)+"");
            }
        });

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                int r = JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION);

                if (r == JOptionPane.YES_OPTION) {

                    System.exit(0);
                }
            }
        });

    }

}
