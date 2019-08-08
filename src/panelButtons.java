import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panelButtons extends JPanel {

	private JButton btn;
	private JButton btn2;
	
	public panelButtons(Controller c) {
		
		this.setLayout(new GridLayout(4,2,0,23));
		
		this.btn  = new JButton("First button");
		this.btn2 = new JButton("Second button");
		
		this.btn.addActionListener(c);
		this.btn2.addActionListener(c);
		
		this.add(btn);
		this.add(btn2);
		
		
	}
	
}
