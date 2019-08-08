import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;

public class Controller implements ActionListener {

	//Frame
	private JFrame window;
	//Panels
	private panelButtons btnPanel;
	private txtPanel txt,areatexto; 
	private JPanel master;
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Panel action listener");
		String ev = event.getActionCommand();
		
		switch(ev){
		case "First button":
			System.out.println(window.getComponents());
			this.txt.setVisible(true);
			this.areatexto.setVisible(false);
			this.master.remove(areatexto);
			this.master.repaint();
			break;
		case "Second button":
			this.areatexto.setVisible(true);
			this.txt.setVisible(false);
		}
		

	}
	
	public Controller() {
		//Creating UI
		
		this.window = new JFrame("Test 1 SWING");
		
		this.btnPanel = new panelButtons(this);
		
		this.txt = new txtPanel();
		this.areatexto = new txtPanel("Area de texto");
		
		this.master = new JPanel(new GridLayout(1,2));
		
		this.master.add(txt);
		this.master.add(areatexto);
		this.master.add(btnPanel);
		
		
		this.window.add(master);
		
		
		window.setSize(800,400);
		window.setVisible(true);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	}

}
