
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        int result = 0;
        container.setLayout(new GridLayout(3, 1));
        
        //top
        JTextField top = new JTextField(""+result);
        top.setEnabled(false);
        container.add(top, BorderLayout.NORTH);
        
        //middle
        JTextField middle = new JTextField("" + 0);
        container.add(middle, BorderLayout.CENTER);
        
        //bottom
        container.add(new MenuPanel(top, middle), BorderLayout.SOUTH);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}