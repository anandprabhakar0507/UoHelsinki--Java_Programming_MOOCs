/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuPanel extends JPanel {
    private JTextField top;
    private JTextField middle;

    public MenuPanel(JTextField top, JTextField middle) {
        super(new GridLayout(1, 3));
        this.top = top;
        this.middle = middle;
        createComponents();
    }

    private void createComponents() {
        //z button
        JButton zero = new JButton("z");
        zero.addActionListener(new ButtonListener('z', middle, top, zero));
        zero.setEnabled(false);
        
        //plus button
        JButton plus = new JButton("+");
        plus.addActionListener(new ButtonListener('+', middle, top, zero));
        
        //minus button
        JButton minus = new JButton("-");
        minus.addActionListener(new ButtonListener('-', middle, top, zero));
        
        
        
        this.add(plus);
        this.add(minus);
        this.add(zero);
    }
}
