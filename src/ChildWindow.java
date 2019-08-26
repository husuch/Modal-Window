import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/*
* @Author Nicolas Hauser
* @Version 1.0
* @Date 28.02.2019
*/

public class ChildWindow extends JDialog {
	
	private JLabel infoJLabel = new JLabel("Modales Fenster");
	private JTextArea parentinfoArea; 
	
	public ChildWindow(JFrame parentFrame) {
		
		parentinfoArea = new JTextArea(parentFrame.toString());
		parentinfoArea.setLineWrap(true);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(infoJLabel, BorderLayout.NORTH);
		getContentPane().add(parentinfoArea, BorderLayout.CENTER);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
