import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{

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
	b1.addActionListener(this);
	b1.setActionCommand("to F");
	JButton b2 = new JButton("to C");
	b2.addActionListener(this);
	b2.setActionCommand("to C");

	t = new JTextField(10);
	j = new JLabel("The converted temperature is...");

	pane.add(t);
	pane.add(b1);
	pane.add(b2);
	pane.add(j);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	String s = t.getText();
        double temp = (double)Integer.parseInt(s);

	if (event.equals("to F")){
	    temp=CtoF(temp);
	}
	if (event.equals("to C")){
	    temp=FtoC(temp);
	}
	s = Double.toString(temp);
	j.setText("The converted temperature is..." + s);
    }
	    
	    
		
	    
	    

    public static double FtoC(double ftemp){
	double ctemp = (ftemp-32)*(5/9.0);
	return ctemp;
    }

    public static double CtoF(double ctemp){
	double ftemp = ctemp * 9/5.0 + 32;
	return ftemp;
    }
}
