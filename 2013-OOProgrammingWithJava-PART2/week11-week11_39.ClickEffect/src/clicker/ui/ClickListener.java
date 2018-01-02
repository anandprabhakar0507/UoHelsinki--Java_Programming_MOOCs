/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author nathan
 */
public class ClickListener implements ActionListener{
    private Calculator source;
    private JLabel display;

    public ClickListener(Calculator source, JLabel display) {
        this.source = source;
        this.display = display;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.source.increase();
        this.display.setText("" + this.source.giveValue());
    }
    
}
