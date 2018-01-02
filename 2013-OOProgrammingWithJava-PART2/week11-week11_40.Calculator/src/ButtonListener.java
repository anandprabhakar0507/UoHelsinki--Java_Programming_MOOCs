
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class ButtonListener implements ActionListener{
    private char operation;
    private JTextField incrementer; //middle
    private JTextField result;  //top
    private JButton zero;
    
    public ButtonListener(char operation, JTextField incrementer, JTextField result, JButton zero){
        this.operation = operation;
        this.incrementer = incrementer;
        this.result = result;
        this.zero = zero;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (operation){
            case '+':
                this.result.setText(getValue(result) + getValue(incrementer) + "");
                this.incrementer.setText("");
                this.zero.setEnabled(getValue(result) != 0);
                break;
            case '-':
                this.result.setText(getValue(result) - getValue(incrementer) + "");
                this.incrementer.setText("");
                this.zero.setEnabled(getValue(result) != 0);
                break;
            case 'z':
                this.result.setText(0 + "");
                this.incrementer.setText("");
                this.zero.setEnabled(getValue(result) != 0);
                break;
        } 
    }
    
    private int getValue(JTextField field){
        try{
            return Integer.parseInt(field.getText());
        } catch (Exception e){
            return 0;
        }
    }
    
}
