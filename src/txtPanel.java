import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class txtPanel extends JPanel {

	private JTextField txtBox;
	
	public txtPanel() {
		
		this.setLayout(new BorderLayout());
		this.txtBox = new JTextField("TextBox");
		this.add(txtBox,BorderLayout.CENTER);
		this.setVisible(false);
	}
	
	public txtPanel(String data) {
		
		this.setLayout(new BorderLayout());
		this.txtBox = new JTextField(data);
		this.add(txtBox,BorderLayout.CENTER);
		this.setVisible(false);
	}
}
