package pl.dawidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameConverter extends JFrame {

    private JTextField textDecimal;
    private JTextField textBinary;


    private ActionListener calcFromDecimal = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Converting converting = new Converting();
            int decimal = Integer.parseInt(textDecimal.getText());
            textBinary.setText(converting.DecimalToBinary(decimal));
        }
    };

    private ActionListener calcFromBinary = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Converting converting = new Converting();
            String binnary = textBinary.getText();
            textDecimal.setText(String.valueOf(converting.BinaryToDecimal(binnary)));
        }
    };

    private void configure(){

        textDecimal = new JTextField("Wpisz liczbę dziesiętną.", 15);
        textDecimal.setHorizontalAlignment(JLabel.CENTER);
        textDecimal.addActionListener(calcFromDecimal);

        textBinary = new JTextField("Wpisz liczbę binarną.", 15);
        textBinary.setHorizontalAlignment(JLabel.CENTER);
        textBinary.addActionListener(calcFromBinary);


        add(textDecimal);
        add(textBinary);

        setLayout(new FlowLayout());
        setSize(300,100);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Binary Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void runProgram(){
        configure();
    }


}
