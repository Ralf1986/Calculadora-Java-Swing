package br.com.cod3r.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    private final JLabel label;


    public Display(){
        setBackground(new Color(46,49,50));
        label = new JLabel("1234");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,25)); // numero no lado direito
        add(label);

    }
}
