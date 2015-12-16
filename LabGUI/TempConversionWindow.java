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

    }


}