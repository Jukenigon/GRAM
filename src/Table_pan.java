import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class Table_pan extends JPanel{
	private static final long serialVersionUID = 1L;
	private Box process;
	
	public Table_pan(){
		Border cadre = BorderFactory.createLineBorder(Color.black);
		this.setBorder(cadre);
		setLayout(new BorderLayout());
	
		process = Box.createVerticalBox();
		
		JScrollPane scrollPane = new JScrollPane(process);
		scrollPane.setPreferredSize(new Dimension(300, 300));
		this.add(scrollPane);
			
	}
	
	public Box getBox(){
		return process;
	}

}
