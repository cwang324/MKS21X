import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame{

    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow(){
	this.setTitle("Temperature Conversion GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);			      
    
    
    pane = this.getContentPane();
    pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

    JButton b1 = new JButton("to F");
    JButton b2 = new JButton("to C");

    t = new JTextField(10);
    j = new JLabel("The converted temperature is...");

    pane.add(t);
    pane.add(b1);
    pane.add(b2);
    pane.add(j);
    }


}